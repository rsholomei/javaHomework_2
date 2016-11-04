package homeWork_2.figure;


import homeWork_2.iShape.IShape;

import java.util.Scanner;

import static java.lang.String.format;

public class Square implements IShape {

    private double lengthSide;

    private double area;
    private double perimeter;
    private Triangle triangle;

    public static Square createAndInitializationFigure() {
        Square square = new Square();
        square.inputParams(new Scanner(System.in));
        return square;
    }

    public double getLengthSide()
    {
        return lengthSide;
    }

    @Override
    public void inputParams(Scanner scanner) {
        System.out.println("Введіть довжину сторони квадрата:");
        this.lengthSide = scanner.nextDouble();

        while (lengthSide < 0)
        {
            System.out.println("Ви ввели не коректну сторону квадрата. Спробуйте ще:");

            System.out.println("Введіть довжину сторони квадрата:");
            lengthSide = scanner.nextDouble();
        }

        triangle = new Triangle(getLengthSide(),getLengthSide(),
                getLengthSide() * Math.sqrt(2));
    }

    @Override
    public double calculateArea() {
        area = Math.pow(getLengthSide(), 2);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = getLengthSide()*4;
        return perimeter;
    }

    @Override
    public String resultAfterCalculation() {
        triangle.calculateArea();
        triangle.calculatePerimeter();
        return format("Площа квадрата = %.3f  " + "Периметр квадрата = %.3f%n"
                        + "Квадрат складається з двох рівних трикутників %n"
                        + triangle.resultAfterCalculation() ,
                area, perimeter);
    }
}