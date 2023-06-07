package june2023.day08.oop;

class Person {
    public String name;
    public long number;
    public Person () {};
    public Person(String name, long number) {
        this.name = name;
        this.number = number;
    }
    public long getNumber() {
        return number;
    }

    public void printInfo() {
        System.out.println("[사람정보]");
        System.out.println("이름 :" + name);
        System.out.println("번호 :" + number);
    }
}

class Employee extends Person {
    String job;

    public Employee(String name, long number, String job) {
        super(name, number);
        this.job = job;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("[교직원]");
        System.out.println("직업 : " + job);
    }
}

class Officer extends Employee {
    public String department;
    public Officer(String name, long number, String job, String department) {
        super(name, number, job);
        this.department = department;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("부서 : " + department);
    }
}
public class OverridingTest {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 1111);
        Person p2 = new Person("강감찬", 2222);
        Employee e1 = new Employee("이순신", 3333, "학교선생님");
        Officer o1 = new Officer("루피", 4444, "학교직원", "행정실");


        Person[] people = {p1, p2, e1, o1};
        for (int i = 0; i < people.length; i++) {
            people[i].printInfo();
        }
    }
}
