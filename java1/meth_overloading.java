public class meth_overloading {
    public void meth() {
        System.out.println("m1");
    }

    public void meth(int x) {
        System.out.println("m2");
    }

    public void meth(double y) {
        System.out.println("m3");
    }

    public static void main(String[] args) {
        meth_overloading obj = new meth_overloading();
        obj.meth(2);
    }

}
