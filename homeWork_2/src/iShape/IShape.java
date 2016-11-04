package iShape;

import java.util.Scanner;

public interface IShape {

    double calculateArea();
    double calculatePerimeter();
    void inputParams(Scanner scanner);
    String resultAfterCalculation();
}
