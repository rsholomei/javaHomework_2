package homeWork_2;

import homeWork_2.Enum.UserSelectionFigures;
import homeWork_2.IShapeAction.IShapeAction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        try {
            IShapeAction shapeAction = UserSelectionFigures.selectionFigures();
            shapeAction.enterOptions(new Scanner(System.in));
            shapeAction.calculateArea();
            shapeAction.calculatePerimeter();
            System.out.println(shapeAction.resultAfterCalculation());
        } catch (Exception e) {
            System.err.println("Ви ввели невірні параметри фігури: " + e.getClass());
        }
    }
}
