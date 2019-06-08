import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resources {

    public static void main(String[] args) throws IOException {
        final BufferedReader br2 = new BufferedReader(new FileReader("path"));

        try (br2) {
        }
    }
}
