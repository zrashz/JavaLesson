import java.io.File;

public class Main5 {
    public static void main(String[] args) {
        File obj = new File("file.txt");
        try {
            // System.out.println(obj.createNewFile());
            System.out.println(obj.exists());
            System.out.println(obj.getName());
            System.out.println(obj.canRead());
            System.out.println(obj.canWrite());
            System.out.println(obj.getAbsolutePath());
            System.out.println(obj.length());
            if (obj.delete()) {
                System.out.println("file delted");
            } else {
                System.out.println("no");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
