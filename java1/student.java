public class student {
    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        student obj = new student("gayan", 12);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
