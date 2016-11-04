package homeWork_2.figure;

import homeWork_2.iShape.IShape;

import java.util.Scanner;

import static java.lang.String.format;

public class Rectangle implements IShape {

    private double length;
    private double width;

    private double area;
    private double perimeter;
    private Triangle triangle;

    public static Rectangle createAndInitializationFigure() {
        Rectangle rectangle = new Rectangle();
        rectangle.inputParams(new Scanner(System.in));
        return rectangle;
    }

    @Override
    public void inputParams(Scanner scanner) {
        System.out.println("Введіть довжину прямокутника:");
        this.length = scanner.nextDouble();
        System.out.println("Введіть ширину прямокутника:");
        this.width = scanner.nextDouble();

        while (length < 0 || width < 0)
        {
            System.out.println("Ви ввели не коректні параметри прямокутника. Спробуйте ще:");

            System.out.println("Введіть довжину прямокутника:");
            length = scanner.nextDouble();
            System.out.println("Введіть ширину прямокутника:");
            width = scanner.nextDouble();
        }

        triangle = new Triangle(getWidth(),getLength(),
                Math.sqrt(Math.pow(getWidth(), 2)+Math.pow(getLength(), 2)));
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        area = getLength()*getWidth();
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = (getLength()+getWidth())*2;
        return perimeter;
    }

    @Override
    public String resultAfterCalculation() {
        triangle.calculateArea();
        triangle.calculatePerimeter();
        return format("Площа прямокутника = %.3f  " + "Периметр прямокутника = %.3f%n"
                        + "Квадрат складається з двох рівних трикутників %n"
                        + triangle.resultAfterCalculation() ,
                area, perimeter);
    }
}