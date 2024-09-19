import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class read2 {
    public static void main(String[] args) {
        File file = new File("file1.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
