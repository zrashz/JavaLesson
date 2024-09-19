class A implements Runnable {
    public void run() {

        System.out.println("hii");

    }

}

public class w {
    public static void main(String[] args) {
        A obj1 = new A();
        Thread o = new Thread(obj1);
        o.start();
    }
}
