package june2023.day10.oop;

class SmartMath {
    static double round(double d, int n) {
        return (double) (Math.round(d * Math.pow(10, n)) / Math.pow(10, n));
    }

    static double ceil(double d, int n) {
        return (double) (Math.ceil(d * Math.pow(10, n)) / Math.pow(10, n));
    }

    static double floor(double d, int n) {
        return (double) (Math.floor(d * Math.pow(10, n)) / Math.pow(10, n));
    }

    // 두점 사이의 거리 구하기
    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
public class MathClassTest {



    public static void main(String[] args) {
        double d1 = 12.426;
        System.out.println(d1);
        System.out.println(Math.round(d1)); // 반올림
        System.out.println(Math.ceil(d1)); // 올림
        System.out.println(Math.floor(d1)); // 버림

        // 소수점 2째리까지 표현 하기 위해 올림, 반올림, 버림
        System.out.println(SmartMath.round(d1, 2)); // 12.43
        System.out.println(SmartMath.ceil(d1, 2)); // 12.43
        System.out.println(SmartMath.floor(d1, 2)); // 12.42

        double x1 = 1;
        double y1 = 1;
        double x2 = 4;
        double y2 = 3;

        System.out.println(SmartMath.distance(x1, y1, x2, y2));
    }
}
