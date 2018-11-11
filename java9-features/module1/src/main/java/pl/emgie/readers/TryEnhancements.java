package pl.emgie.readers;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class TryEnhancements {

    public void tryEnhancemnets() throws URISyntaxException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(getClass().getClassLoader().getResource("sample.txt").getFile()));

        try (reader) {
            reader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
