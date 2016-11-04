package homeWork_2.enumShape;

import java.util.Scanner;

public class FiguresValidator {
    private static boolean flag;
    private static Shape correct;

    public static boolean validatorFigure()
    {
        Scanner scanner = new Scanner(System.in);
        String yourFigure = scanner.next();
        Shape[] shapes = Shape.values();
        
        for (Shape shape : shapes)
        {
            if (shape.toString().equals(yourFigure.toUpperCase()))
            {
                flag = true;
                correct = shape;
                break;
            } else
                {
                    flag = false;
                }
        }
        return flag;
    }

    public static void inputFigure()
    {
        while (!flag)
        {
            System.out.println("Введіть тип фігури:");
            validatorFigure();
        }
    }

    public static Shape correctedShape()
    {
        return correct;
    }
}
