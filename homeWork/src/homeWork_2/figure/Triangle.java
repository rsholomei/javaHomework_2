package homeWork_2.figure;

import homeWork_2.iShape.IShape;

import java.util.Scanner;

import static java.lang.String.format;

public class Triangle implements IShape {

    private static double sideA;
    private static double sideB;
    private static double sideC;

    private double area;
    private double perimeter;
    private double halfPerimeter;
    private boolean flag;

    public Triangle(){}

    public Triangle(double sideA, double sideB, double sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static Triangle createAndInitializationFigure() {
        Triangle triangle = new Triangle();
        triangle.inputParams(new Scanner(System.in));
        return triangle;
    }

    @Override
    public void inputParams(Scanner scanner) {
        System.out.println("Введіть 3 сторони трикутника:");
        System.out.println("сторона А: ");
        this.sideA = scanner.nextDouble();
        System.out.println("сторона В: ");
        this.sideB = scanner.nextDouble();
        System.out.println("сторона С: ");
        this.sideC = scanner.nextDouble();

        while (sideA < 0 || sideB < 0 || sideC < 0)
        {
            System.out.println("Ви ввели не коректні параметри трикутника. Спробуйте ще:");
            System.out.println("сторона А: ");
            sideA = scanner.nextDouble();
            System.out.println("сторона В: ");
            sideB = scanner.nextDouble();
            System.out.println("сторона С: ");
            sideC = scanner.nextDouble();
        }
    }

    public static double getSideA() {
        return sideA;
    }

    public static double getSideB() {
        return sideB;
    }

    public static double getSideC() {
        return sideC;
    }

    @Override
    public double calculateArea() {
        halfPerimeter = (getSideA() + getSideB() + getSideC()) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - getSideA()) * (halfPerimeter - getSideB())
                * (halfPerimeter - getSideC()));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = getSideA() + getSideB() + getSideC();
        return perimeter;
    }

    private boolean conditionExistenceTriangle() {
        if(getSideA() + getSideB() > getSideC() || getSideA() + getSideC() > getSideB()
                || getSideB() + getSideC() > getSideA())
        {
            flag = true;
        }
        return flag;
    }

    @Override
    public String resultAfterCalculation() {

        if (!conditionExistenceTriangle())
            return format("Трикутник не може існувати з такими сторонами");
        return format("Площа трикутника = %.3f  " + "Периметр трикутника = %.3f%n",
                area, perimeter);
    }
}
