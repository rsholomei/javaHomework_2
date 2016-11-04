package homeWork_2;

import homeWork_2.enumShape.NewFigure;
import homeWork_2.iShape.IShape;

public class Main {
    public static void main(String[] args)
    {
        try {
            IShape shapeAction = NewFigure.selectionFigures();
            shapeAction.calculateArea();
            shapeAction.calculatePerimeter();
            System.out.println(shapeAction.resultAfterCalculation());
        } catch (Exception e) {
            System.err.println("Параметр фігури містить літеру: " + e.getClass());
        }
    }
}
