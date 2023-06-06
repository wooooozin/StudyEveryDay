package june2023.day06.constructor;


class Cola {
    private static int capacity = 20;
    private int manufacturingDate = 10;

    static {
        System.out.println("클래스 초기화 블럭");
        capacity = 40;
        System.out.println("용량 : " + capacity);
    }
    {
        System.out.println("인스턴스 초기화 블럭");
        manufacturingDate = 50;
        capacity = 50;
        System.out.println("용량 : " + capacity);
        System.out.println("제조일자 : " + manufacturingDate);

    }

    public Cola() {
        System.out.println("생성자 호출");
        capacity = 60;
        manufacturingDate = 60;
        System.out.println("용량 : " + capacity);
        System.out.println("제조일자 : " + manufacturingDate);
    }
}

public class ColaTest {
    public static void main(String[] args) {
        Cola coke = new Cola();
        Cola coke2 = new Cola();
    }
}
