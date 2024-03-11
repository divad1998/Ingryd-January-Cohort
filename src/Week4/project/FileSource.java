package Week4.project;

import java.io.*;

public class FileSource implements ContentSource{

    String filePath;
    FileSource(String filePath) {
        this.filePath = filePath;
    }

    BufferedReader getReader() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(this.filePath));
        return reader;
    }
}