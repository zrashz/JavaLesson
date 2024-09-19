class Test {
    String name;

    Test() {
        name = "kamal";
        System.out.println("welcome");
    }

    void main() {
        System.out.println("hellow");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.name);
    }
}