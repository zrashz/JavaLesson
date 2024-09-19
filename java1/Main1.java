public class Main1 {
    int rupee;

    Main1() {
        rupee = 0;
    }

    Main1(int x) {
        rupee = x;
    }

    public static void main(String[] args) {
        Main1 kamal = new Main1();
        Main1 nimal = new Main1(20);
        System.out.println(kamal.rupee);
        System.out.println(nimal.rupee);
    }

}
