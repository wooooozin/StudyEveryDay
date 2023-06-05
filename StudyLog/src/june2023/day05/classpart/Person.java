package june2023.day05.classpart;

public class Person {
    // 멤버 변수, 필드, 프로퍼티, 속성
    private String name; // 이름
    private int age; // 나이
    private String address; // 주소

    public void printInfo() {
        System.out.println("학생 이름 :" + this.name);
        System.out.println("학생 나이 :" + this.age);
        System.out.println("학생 주소 :" + this.address);
    }
}
