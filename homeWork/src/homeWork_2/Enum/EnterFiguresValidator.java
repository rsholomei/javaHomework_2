package homeWork_2.Enum;

import java.util.Scanner;

public class EnterFiguresValidator {
    private static boolean flag;
    private static Shape correct;

    public static boolean enterFigure()
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

    public static void Validator()
    {
        while (!flag)
        {
            System.out.println("Введіть тип фігури:");
            enterFigure();
        }
    }

    public static Shape correctedShape()
    {
        return correct;
    }
}
