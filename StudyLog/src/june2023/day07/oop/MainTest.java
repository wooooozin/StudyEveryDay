package june2023.day07.oop;

class Person {
    public String name;


}

class Employee extends Person {

}
public class MainTest {
    public static void main(String[] args) {

        Person p = new Person();
        p.name = "사람 이름";

        Employee e = new Employee();
        e.name = "직원 이름";

        System.out.println(p.name);
        System.out.println(e.name);

    }
}
