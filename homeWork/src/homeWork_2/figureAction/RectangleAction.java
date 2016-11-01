package homeWork_2.figureAction;

import homeWork_2.IShapeAction.IShapeAction;

import java.util.Scanner;

import static java.lang.String.format;

public class RectangleAction implements IShapeAction {

    private double length;
    private double width;

    private double area;
    private double perimeter;
    private TriangleAction triangle;

    @Override
    public void enterOptions(Scanner scanner) {
        System.out.println("Введіть довжину прямокутника:");
        this.length = scanner.nextDouble();
        System.out.println("Введіть ширину прямокутника:");
        this.width = scanner.nextDouble();

        triangle = new TriangleAction(getWidth(),getLength(),
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
