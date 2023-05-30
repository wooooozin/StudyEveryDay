package may2023.day004.generics;

class Powder {
    public void doPrinting() {
        System.out.println("Powder를 사용해 출력합니다.");
    }
    public String toString() {
        return "재료는 Powder 입니다.";
    }
}

class Plastic {
    public void doPrinting() {
        System.out.println("Plastic 사용해 출력합니다.");
    }
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}

class GenericPrinter<T> { // 참조 자료형에 <T> 사용
    private T material; // T 자료형으로 선언한 변수 // 일반적인 변수 선언과 비교 private String name;

    public T getMaterial() { // T 자료형 변수 material을 반환하는 제네릭 메서드 // 일반적인 메서드 public String getName() {return name;}
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }
}

public class GenericPrintTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // Powder 타입으로 GenericPrinter 생성
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter); // 재료는 Powder 입니다.

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>(); // Plastic 타입으로 GenericPrinter 생성
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter); // 재료는 Plastic 입니다.

        // 자료형을 명시하지 않는 경우 - 강제 형변환 등 필요
        GenericPrinter powderPrinter2 = new GenericPrinter();
        powderPrinter2.setMaterial(new Powder());
        Powder powder = (Powder) powderPrinter.getMaterial();
        System.out.println(powderPrinter2);

        // 여러 자료형 사용 시 오브젝트 클래스로 만들 수도 있음
        GenericPrinter<Object> genericPrinter = new GenericPrinter<>();
    }
}
