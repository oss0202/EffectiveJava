package etc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TryWithResource {
    public void write(String fileName, String word) throws IOException {
        Writer writer = new FileWriter(fileName);
        writer.write(word);
    }
}
