import java.io.FileReader;

public class read1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file1.txt");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
