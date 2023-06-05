package june2023.day05.classpart;

public class Student {
    // 멤버 변수
    int studentId; // 학번
    String name; // 이름
    int grade; // 학년
    int classNumber; // 반

    // 생성자
    public Student(int studentId, String name, int grade, int classNumber) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.classNumber = classNumber;
    }

    // 메서드
    public void printInfo() {
        System.out.println("학생 이름 :" + this.name);
        System.out.println("학생 학번 :" + this.studentId);
        System.out.println("학생 학년 :" + this.grade);
        System.out.println("학생 반 :" + this.classNumber);
    }
}
