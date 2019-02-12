package calculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Category {

    private int diameter;
    private double pressure;
    private String inputStr;

    public void inputData(String message) {
        System.out.println(message);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            inputStr = reader.readLine();
        } catch (IOException e1) {
            System.out.println("Please, input correct data, mm");
        }
    }

    public int checkDiameterValue() {
        inputData("Input diameter, mm: ");
        try {
            diameter = Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            System.out.println("It isn't a number! Please input a diameter, mm");
            checkDiameterValue();
        }
        return diameter;
    }

    public double checkPressureValue() {
        inputData("Input pressure, MPa: ");
        try {
            pressure = Double.parseDouble(inputStr);
        } catch (NumberFormatException e) {
            System.out.println("It isn't a number! Please input a pressure, MPa");
            checkPressureValue();
        }
        return pressure;
    }

    public double multiply(int diameter, double pressure) {
        return diameter * pressure;
    }

    public abstract void calculateCategory(int diameter, double pressure, double resultMultiplication);

}

