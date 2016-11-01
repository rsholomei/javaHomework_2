package homeWork_2.Enum;

import homeWork_2.IShapeAction.IShapeAction;
import homeWork_2.figureAction.*;

import java.util.Scanner;

public class UserSelectionFigures {

    public static IShapeAction selectionFigures()
    {
        EnterFiguresValidator.Validator();
        switch (EnterFiguresValidator.correctedShape())
        {
            case CIRCLE:
                return new CircleAction();
            case SQUARE:
                return new SquareAction();
            case RECTANGLE:
                return new RectangleAction();
            case TRIANGLE:
                return new TriangleAction();
            default:
                return null;
        }
    }
}
