import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(1);
        arr.add(2);

        arr.add(0, 23);
        System.out.println(arr);

        for (Integer x : arr) {
            System.out.println(x);
        }
    }
}
