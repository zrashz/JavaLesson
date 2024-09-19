
class C {
    void show() {
        System.out.println("hiii");
    }

}

class D extends C {
    void show() {
        super.show();
        System.out.println("hellow");
    }
}

public class B {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }

}
