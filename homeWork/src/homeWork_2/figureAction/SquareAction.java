package homeWork_2.figureAction;


import homeWork_2.IShapeAction.IShapeAction;

import java.util.Scanner;

import static java.lang.String.format;

public class SquareAction implements IShapeAction {

    private double lengthSide;

    private double area;
    private double perimeter;
    private TriangleAction triangle;

    public double getLengthSide()
    {
        return lengthSide;
    }

    @Override
    public void enterOptions(Scanner scanner) {
        System.out.println("Введіть довжину сторони квадрата:");
        this.lengthSide = scanner.nextDouble();

        triangle = new TriangleAction(getLengthSide(),getLengthSide(),
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
