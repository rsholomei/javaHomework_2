package figure;


import iShape.IShape;

import java.util.Scanner;

public class Circle implements IShape {

    private double radius;
    private double area;
    private double perimeter;

    public double getRadius() {
        return radius;
    }

    public static Circle createAndInitializationFigure()
    {
        Circle circle = new Circle();
        circle.inputParams(new Scanner(System.in));
        return circle;
    }
    @Override
    public double calculateArea() {
        area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = (2 * Math.PI) * getRadius();
        return perimeter;
    }

    @Override
    public void inputParams(Scanner scanner) {
        System.out.println("Введіть радіус кола:");
        this.radius = scanner.nextDouble();

        while (radius < 0)
        {
            System.out.println("Ви ввели некоректний радіус. Спробуйте ще:");
            System.out.println("Введіть радіус кола:");
            radius = scanner.nextDouble();
        }

    }

    @Override
    public String resultAfterCalculation() {
        return String.format("Площа кола = %.3f " + "Довжина кола = %.3f", area, perimeter);
    }
}
