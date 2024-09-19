class parent {
    final public void say() {
        System.out.println("HII");
    }
}

class child extends parent {

}

public class TEST {
    public static void main(String[] args) {
        child obj = new child();
        obj.say();
    }
}
