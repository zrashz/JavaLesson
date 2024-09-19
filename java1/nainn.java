public class nainn implements Mainn {
    public void eat() {
        System.out.println("eat");
    }

    public void drink() {
        System.out.println("drink");
    }

    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        Mainn x = new nainn();
        System.out.println(nainn.number);

    }
}
