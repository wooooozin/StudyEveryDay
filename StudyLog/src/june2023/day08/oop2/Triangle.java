package june2023.day08.oop2;

public class Triangle extends Shape {
    int width;
    int height;

    public Triangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
        System.out.println("좌표값: [" + x + ", " + y +"]");
        System.out.println("높이: [" + width + ", " + height +"]");

    }
}
