


public class Main {
    public static class JavaVersionChecker {
        public static void main(String[] args) {
            String version = System.getProperty("java.version");
            System.out.println("Task 1: ");
            System.out.println("Java Version: " + version);

            System.out.println("\n");
            System.out.println("Task 2 & 3: ");
            Shape rectangle = new Rectangle(5, 10);
            ShapeDescriber.describe(rectangle);

            Shape triangle = new Triangle(3, 4, 5);
            ShapeDescriber.describe(triangle);



        }


    }
}

abstract class Shape{
    public Shape(){
        print();
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public void print(){
        System.out.println("Class name: " + this.getClass().getSimpleName());

    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape{
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }
}

class ShapeDescriber{
    public static void describe(Shape shape){
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }

}