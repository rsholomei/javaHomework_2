package homeWork_2.IShapeAction;

import java.util.Scanner;

public interface IShapeAction {
    
    double calculateArea();
    double calculatePerimeter();
    void enterOptions(Scanner scanner);
    String resultAfterCalculation();
}
