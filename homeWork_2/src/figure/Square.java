package figure;


import iShape.IShape;

import java.util.Scanner;

public class Square implements IShape {
    Triangle triangle;

    private double lengthSide;
    private double area;
    private double perimeter;

    public double getLengthSide() {
        return lengthSide;
    }

    public static Square createAndInitializationFigure()
    {
        Square square = new Square();
        square.inputParams(new Scanner(System.in));
        return square;
    }

    @Override
    public double calculateArea() {
        area = Math.pow(getLengthSide(), 2);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = getLengthSide() * 4;
        return perimeter;
    }

    @Override
    public void inputParams(Scanner scanner) {
        System.out.println("Введіть довжину сторони квадрата:");
        this.lengthSide = scanner.nextDouble();
        while (getLengthSide() < 0)
        {
            System.out.println("Ви ввели некоректну довжину сторони квадрата. Спробуйте ще:");
            System.out.println("Введіть довжину сторони квадрата:");
            lengthSide = scanner.nextDouble();
        }
        triangle = new Triangle(getLengthSide(), getLengthSide(), Math.sqrt(Math.pow(getLengthSide(), 2) +
                Math.pow(getLengthSide(), 2)));

    }

    @Override
    public String resultAfterCalculation() {
        triangle.calculateArea();
        triangle.calculatePerimeter();
        return String.format("Площа прямокутника = %.3f " + "Периметр прямокутника = %.3f%n"
                        + "Прямокутник складається з двох рівних трикутників %n" +
                        triangle.resultAfterCalculation(),
                area, perimeter);
    }
}
