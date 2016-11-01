package homeWork_2.figureAction;

import homeWork_2.IShapeAction.IShapeAction;

import java.util.Scanner;

import static java.lang.String.format;

public class CircleAction implements IShapeAction {

    private double radius;

    private double area;
    private double perimeter;

    @Override
    public void enterOptions(Scanner scanner) {
        System.out.println("Введіть радіус кола:");
        this.radius = scanner.nextDouble();
    }

    public double getRadius() { return radius; }

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
