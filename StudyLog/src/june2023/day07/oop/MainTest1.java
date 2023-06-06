package june2023.day07.oop;

class Vehicle {
    public String name;
    public double maxSpeed;
    public int capacity;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.maxSpeed);
        System.out.println(this.capacity);
    }
}

class Car extends Vehicle {
    public String rpm;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("RPM: " + this.rpm);

    }
}


public class MainTest1 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.name = "차량";
        v1.maxSpeed = 200;
        v1.capacity = 5;

        Car c1 = new Car();
        c1.name = "자동차";
        c1.rpm = "1000";
        c1.printInfo();

    }
}
