package june2023.day11.generics;

abstract class Material {
    abstract void doPrinting();
}
class Grape extends Material{
    public String toString() {
        return "재료는 포도 입니다.";
    }

    @Override
    void doPrinting() {
        System.out.println("와인의 주된 재료는 포도입니다.");
    }
}

class Malt extends Material {
    public String toString() {
        return "재료는 맥아 입니다.";
    }
    @Override
    void doPrinting() {
        System.out.println("맥주의 주된 재료는 맥아입니다.");
    }
}

class GenericAlcohol<T extends Material> {
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
        material.doPrinting();
    }
}
public class AlcoholTest {
    public static void main(String[] args) {
        GenericAlcohol<Grape> wine = new GenericAlcohol<>();
        wine.setMaterial(new Grape());
        wine.printing();

        GenericAlcohol<Malt> beer = new GenericAlcohol<>();
        beer.setMaterial(new Malt());
        beer.printing();
    }
}
