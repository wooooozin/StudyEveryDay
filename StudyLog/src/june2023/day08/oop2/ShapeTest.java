package june2023.day08.oop2;

public class ShapeTest {
    public static void main(String[] args) {
//        Shape shape1 = new Shape(1, 2); 추상클래스는 객체로 만들 수 없다.
        Triangle t1 = new Triangle(10, 10, 100, 100);
        t1.draw();
    }
}
