/** 
 * javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
 * java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.ArrayList;

public class OurMarkdownParseTest {
    // @Test
    // public void addition() {
    //     assertEquals(2, 1 + 1);
    // }

    // @Test
    // public void firstFile() throws IOException{
    //     Path fileName = Path.of("test-file.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
        
    //     assertEquals("https://something.com", links.get(0));
    //     assertEquals("some-page.html", links.get(1));
    // }
    // @Test
    // public void secondFile() throws IOException{
    //     Path fileName = Path.of("test-file2.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = OurMarkdownParse.getLinks(contents);

    //     assertEquals("https://something.com", links.get(0));
    //     assertEquals("some-page.html", links.get(1));
    // }
    // @Test
    // public void thirdFile() throws IOException{
    //     Path fileName = Path.of("test-file3.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
    //     assertEquals(List.of(),links);
        
    // }
    // @Test
    // public void fourthFile() throws IOException{
    //     Path fileName = Path.of("test-file4.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
    //     assertEquals(List.of(),links);
    // }
    // @Test
    // public void fifthFile() throws IOException{
    //     Path fileName = Path.of("test-file5.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
    //     assertEquals(List.of(),links);
    // }
    // @Test
    // public void sixthFile() throws IOException{
    //     Path fileName = Path.of("test-file6.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
    //     assertEquals(List.of(),links);
    // }
    // @Test
    // public void seventhFile() throws IOException{
    //     Path fileName = Path.of("test-file7.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
    //     assertEquals(List.of(),links);
    // }
    // @Test
    // public void eighthFile() throws IOException{
    //     Path fileName = Path.of("test-file8.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
    //     assertEquals(List.of(),links);
    // }

    @Test
    public void snippetOne() throws IOException {
        Path fileName = Path.of("test-file-1.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"),links);
    }

    @Test
    public void snippetTwo() throws IOException {
        Path fileName = Path.of("test-file-2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
        assertEquals(List.of("a.com", "a.com(())", "example.com"),links);
    }

    @Test
    public void snippetThree() throws IOException {
        Path fileName = Path.of("test-file-3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = OurMarkdownParse.getLinks(contents);
        
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"),links);
    }
}