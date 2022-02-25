import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TheirMarkdownParseTest {

    // @Test
    // public void addition() {
    //     assertEquals(2, 1 + 1);
    // }

    // @Test
    // public void links() throws IOException {


        
    //     ArrayList<String> output = new ArrayList<>();
    //     output.add("https://something.com");
    //     output.add("some-page.html");
    //     String actual = "test-file.md";
    //     Path fileName = Path.of(actual);
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = TheirMarkdownParse.getLinks(contents);
    //     assertEquals(output, links);
    // }

    // @Test
    // public void links2() throws IOException {
    //     ArrayList<String> output = new ArrayList<>();
    //     output.add("https://something.com");
    //     output.add("https://something.com");
    //     String actual = "test-file2.md";
    //     Path fileName = Path.of(actual);
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = TheirMarkdownParse.getLinks(contents);
    //     assertEquals(output, links);
    // }

    // @Test
    // public void links3() throws IOException {
    //     ArrayList<String> output = new ArrayList<>();
    //     output.add("https://something.com");
    //     String actual = "test-file3.md";
    //     Path fileName = Path.of(actual);
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = TheirMarkdownParse.getLinks(contents);
    //     assertEquals(output, links);
    // }

    // @Test
    // public void links4() throws IOException {
    //     ArrayList<String> output = new ArrayList<>();
    //     output.add("https://helloworld.com");
    //     String actual = "test-file4.md";
    //     Path fileName = Path.of(actual);
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = TheirMarkdownParse.getLinks(contents);
    //     assertEquals(output, links);
    // }

    @Test
    public void snippetOne() throws IOException {
        Path fileName = Path.of("test-file-1.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = TheirMarkdownParse.getLinks(contents);
        
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"),links);
    }

    @Test
    public void snippetTwo() throws IOException {
        Path fileName = Path.of("test-file-2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = TheirMarkdownParse.getLinks(contents);
        
        assertEquals(List.of("a.com", "a.com(())", "example.com"),links);
    }

    @Test
    public void snippetThree() throws IOException {
        Path fileName = Path.of("test-file-3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = TheirMarkdownParse.getLinks(contents);
        
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"),links);
    }
}