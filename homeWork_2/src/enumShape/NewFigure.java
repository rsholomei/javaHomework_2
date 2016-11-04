package enumShape;

import figure.Circle;
import figure.Rectangle;
import figure.Square;
import figure.Triangle;
import iShape.IShape;

public class NewFigure {
    public static IShape selectionFigure()
    {
        SelectionFigure.inputFigure();
        switch (SelectionFigure.correctedFigure())
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
