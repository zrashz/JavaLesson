import java.util.LinkedList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        arr.add(12);
        System.out.println(arr);
        System.out.println(arr.indexOf(1));
        arr.forEach(n -> {
            System.out.println(n);
        });

    }
}
