package homeWork_2.figure;

import homeWork_2.iShape.IShape;

import java.util.Scanner;

import static java.lang.String.format;

public class Circle implements IShape {

    private double radius;
    private double area;
    private double perimeter;

    public double getRadius() { return radius; }

    public static Circle createAndInitializationFigure() {
        Circle circle = new Circle();
        circle.inputParams(new Scanner(System.in));
        return circle;
    }

    @Override
    public void inputParams(Scanner scanner) {
        System.out.println("Введіть радіус кола:");
        this.radius = scanner.nextDouble();
        while (radius < 0)
        {
            System.out.println("Ви ввели не коректний радіус. Спробуйте ще:");
            System.out.println("Введіть радіус кола:");
            radius = scanner.nextDouble();
        }
    }

    @Override
    public double calculateArea() {
        area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = (2*Math.PI) * getRadius();
        return perimeter;
    }

    @Override
    public String resultAfterCalculation() {
        return format("Площа кола = %.3f%n"+"Довжина кола = %.3f%n", area, perimeter);
    }
}
