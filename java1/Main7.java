import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main7 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("File2.txt", true));
            writer.write("rashmi");
            writer.write("hello");
            writer.newLine();
            writer.write("welcome");
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
