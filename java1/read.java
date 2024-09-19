import java.io.File;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        File file = new File("File1.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());

            }
            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
