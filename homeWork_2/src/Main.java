import enumShape.NewFigure;
import iShape.IShape;

public class Main {
    public static void main(String[] args){
        try {
            IShape figure = NewFigure.selectionFigure();
            figure.calculateArea();
            figure.calculatePerimeter();
            System.out.println(figure.resultAfterCalculation());
        }catch (Exception e)
        {
            System.err.println("Параметр фігури не може містити літер:  " + e.getClass());
        }
    }
}
