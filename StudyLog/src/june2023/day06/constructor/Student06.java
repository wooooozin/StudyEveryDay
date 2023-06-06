package june2023.day06.constructor;

public class Student06 {
    public String name;
    public int age;

    // 기본생성자 : 자동으로 제공
    public Student06() {
        System.out.println("학생 생성자가 호출생");
    };

    // 생성자 만들기
    public Student06(String name) {
        this.name = name;
        System.out.println("이름 매개변수로 갖는 학생 생성자 호출새");
    }

    // 생성자 오버로딩

    public Student06(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
