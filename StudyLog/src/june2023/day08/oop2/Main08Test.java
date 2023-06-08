package june2023.day08.oop2;

class Animal {
    public void sound() {
        System.out.println("동물이 소리를 낸다.");
    }
    public void printInfo() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹~");
    }
    public void printInfo1() {
        System.out.println("Cat");
    }
}

public class Main08Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // "동물이 소리를 낸다."
        animal.printInfo();

        Cat cat = new Cat();
        cat.sound(); // "야옹~"
        cat.printInfo();

        Animal cat1 = new Cat();
        cat1.sound();

    }
}
