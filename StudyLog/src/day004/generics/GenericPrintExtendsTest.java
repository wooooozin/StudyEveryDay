package day004.generics;

abstract class Material {
    public abstract void doPrinting();
}

class Powder1 extends Material {

    @Override
    public void doPrinting() {
        System.out.println("Powder1 재료로 출력");
    }

    public String toString() {
        return "재료는 Powder1 입니다.";
    }
}

class Plastic1 extends Material {

    @Override
    public void doPrinting() {
        System.out.println("Plastic1 재료로 출력");
    }

    public String toString() {
        return "재료는 Plastic1 입니다.";
    }
}

class Water {
    public void doPrinting() {
        System.out.println("물 재료로 생성");
    }
    public String toString() {
        return "재료는 Water 입니다.";
    }
}

class GenericPrinter1<T extends Material> { // Material 자료형으로 제한
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting(); // 상위 클래스 Material의 메서드 호출
    }
}

public class GenericPrintExtendsTest {
    public static void main(String[] args) {
        // Water는 Meterial를 상속하고 있지 않아 참조 클래스로 사용할 수 없음
//        GenericPrinter1<Water> waterGenericPrinter1 = new GenericPrinter1<Water>();

        GenericPrinter1<Powder1> powderGenericPrinter1 = new GenericPrinter1<Powder1>();
        powderGenericPrinter1.setMaterial(new Powder1());
        powderGenericPrinter1.printing(); // Powder1 재료로 출력
    }
}
