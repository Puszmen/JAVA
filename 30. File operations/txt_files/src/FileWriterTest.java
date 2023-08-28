import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {

        String fileName = "testFile.txt";

        try (
            var fileWriter = new FileWriter(fileName);
            var writer = new BufferedWriter(fileWriter);
            ) {

            writer.write("Goku");
            writer.newLine();
            writer.write("Gohan");
            writer.newLine();
            writer.write("Goten");
            writer.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
