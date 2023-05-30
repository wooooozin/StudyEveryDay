package may2023.day004.generics;

// 자료형 매개변수를 두개 사용하는 클래스
class Point<T, V> {
    T x;
    V y;

    Point(T x, V y) {
        this.x = x;
        this.y = y;
    }
    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}

public class GenericMethodTest {
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
        double left = ((Number) p1.getX()).doubleValue();
        double right = ((Number) p2.getX()).doubleValue();
        double top = ((Number) p1.getY()).doubleValue();
        double bottom = ((Number) p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }

    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double rect = GenericMethodTest.makeRectangle(p1, p2);
        System.out.println(rect); // 100
    }
}
