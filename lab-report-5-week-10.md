# Lab Report 5

For this lab report, I compared the outputs of my group's implementation of MarkdownParse to the lab9 implementation of MarkdownParse, looking for differences in the outputs of the commonmark test files on the two programs. 

To find the tests that outputted different results, I wrote a bash script for each implementation of MarkdownParse that ran each of the files ending in .md on the code, outputting results. I then used the `>` symbol to write the output of the bash scripts to files, which looked something like this:

```
$ bash week9script.sh > week9output.txt
$ bash myscript.sh > myoutput.txt

```
I then used the `diff` command to compare the differences between the contents of the two files to find the test files that produced different results. The command I used was: 

```
$ diff week9output.txt myoutput.txt
```

Using this command, I found that the files 194.md and 201.md had different outputs. 

---

### Test file 194.md

Contents of the file:
```
[Foo*bar\]]:my_(url) 'title (with parens)'

[Foo*bar\]]
```

Output of Week 9 MarkdownParse:
```
[url]
```

Output of My MarkdownParse:
```
[]
```

Expected output:
```
my_(url)
```

Based on the expected output, both implementations of MarkdownParse were incorrect. I think the bug that caused this problem in my group's MarkdownParse was our check that the closing bracket `]` and the opening parentheses `(` had to be next to each other, otherwise the program would look for the next opening bracket, skipping the contents in between. A different method would have to be implemented for our MarkdownParse program to return the correct result. 

Code that needs to be fixed:
```
if (nextCloseBracket != openParen - 1) {
    currentIndex = closeParen + 1;
    continue;
}
```

---

### Test file 201.md

Contents of the file:
```
[foo]: <bar>(baz)

[foo]
```

Output of Week 9 MarkdownParse:
```
[baz]
```

Output of My MarkdownParse:
```
[]
```

Expected output:
```
[]
```

In this case, my group's MarkdownParse produced the correct output, but this was probably an accident. In the case of the Week9 MarkdownParse, the only fix I can currently think of is to include that check that nothing invalid is in between the closing bracket `]` and the opening parentheses `(`, with invalid meaning markdown syntax elements such as the `<>`, `*`, or `:` characters. 

Code that needs to be added:
```
if (markdown.substring(nextCloseBracket, openParen).contains('*')) {
    currentIndex = closeParen + 1;
    continue;
}

/**
 * this code block checks if there is an asterisk between the closing bracket and the opening parentheses
 * if it contains the asterisk, then the current index would be assigned to one after the closing parentheses, and continue with the while loop
*/

```