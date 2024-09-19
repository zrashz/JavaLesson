class C {
    int x = 12;

}

class B extends C {
    int x = 13;

    public void print() {
        System.out.println(super.x);
    }
}

public class A {
    public static void main(String[] args) {
        B obj = new B();
        obj.print();
    }

}
