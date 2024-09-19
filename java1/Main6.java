import java.io.FileWriter;

public class Main6 {
    public static void main(String[] args) {
        String txt = "\n welcome";
        try {
            FileWriter writter = new FileWriter("file1.txt", true);
            writter.append(txt);
            writter.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
