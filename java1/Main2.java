import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(30);
        arr.add(4);
        System.out.println(arr);
        arr.add(0, 99);
        System.out.println(arr);
        arr.set(1, 34);
        System.out.println(arr);

        System.out.println(arr.contains(0));
        System.out.println(arr.get(0));
        System.out.println(arr.indexOf(1));
        System.out.println(arr.remove(0));
        System.out.println(arr.size());

    }

}
