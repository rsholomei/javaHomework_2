package homeWork_2.enumShape;

import homeWork_2.iShape.IShape;
import homeWork_2.figure.*;

public class NewFigure {

    public static IShape selectionFigures()
    {
        FiguresValidator.inputFigure();
        switch (FiguresValidator.correctedShape())
        {
            case CIRCLE:
                return Circle.createAndInitializationFigure();
            case SQUARE:
                return Square.createAndInitializationFigure();
            case RECTANGLE:
                return Rectangle.createAndInitializationFigure();
            case TRIANGLE:
                return Triangle.createAndInitializationFigure();
            default:
                return null;
        }
    }
}
