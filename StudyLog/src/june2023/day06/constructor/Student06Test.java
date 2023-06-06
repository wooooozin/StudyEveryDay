package june2023.day06.constructor;

public class Student06Test {
    public static void main(String[] args) {
        Student06 st1 = new Student06();
        Student06 st2 = new Student06("LOOPPY");
        Student06 st3 = new Student06("HILOOP", 10);

        st1.name = "Loopy";
        System.out.println(st1.name);
        System.out.println(st1.age);

        System.out.println(st2.name);
        System.out.println(st2.age);

        System.out.println(st3.name);
        System.out.println(st3.age);
    }
}
