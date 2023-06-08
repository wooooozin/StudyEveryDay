package june2023.day09.oop;

abstract class Animal {
    abstract void cry();
    abstract void eat();

    public void awake() {
        System.out.println("동물이 잠에서 꺠어 납니다..");
    }

    public void sleep() {
        System.out.println("동물이 잠듭니다..");
    }
}

class Dog extends Animal {

    @Override
    void cry() {
        System.out.println("강아지가 멍멍 웁니다.");
    }

    @Override
    void eat() {
        System.out.println("강아지가 강아지 사료를 먹습니다.");
    }
}

abstract class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("고양이가 야옹 웁니다.");
    }
}

class MyCat extends Cat {

    @Override
    void cry() {
        System.out.println("나의 고양이가 미유미유 웁니다.");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Cat myCat = new MyCat();

        animal.eat(); // 강아지가 강아지 사료를 먹습니다.
        animal.cry(); // 강아지가 멍멍 웁니다.
        animal.awake(); // 동물이 잠에서 꺠어 납니다..

        myCat.eat(); // 고양이가 야옹 웁니다.
        myCat.cry(); // 나의 고양이가 미유미유 웁니다.
        myCat.awake(); // 동물이 잠에서 꺠어 납니다..
    }
}
