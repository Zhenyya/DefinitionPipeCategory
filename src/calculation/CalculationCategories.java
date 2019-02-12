package calculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculationCategories {

    public static void main(String[] args) {

        String str = "";
        int d;
        double p;
        double multiplyResult;
        Category pipeCat;
        String attempt = "Y";

        while (true) {

            System.out.println("Input G1 or G2 or L1 or L2 ");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                str = reader.readLine();
            } catch (IOException e1) {
                System.out.println("We have an IO exception!");
            }

            switch (str) {
                case ("G1"):
                    pipeCat = new CategoryPipeG1();
                    break;
                case ("G2"):
                    pipeCat = new CategoryPipeG2();
                    break;
                case ("L1"):
                    pipeCat = new CategoryPipeL1();
                    break;
                case ("L2"):
                    pipeCat = new CategoryPipeL2();
                    break;
                default:
                    System.out.println("Enter the correct group of pipe!");
                    continue;
            }

            d = pipeCat.checkDiameterValue();
            p = pipeCat.checkPressureValue();
            multiplyResult = pipeCat.multiply(d, p);
            pipeCat.calculateCategory(d, p, multiplyResult);
            System.out.println("Done!");

            System.out.println("Input \'N\' for finish or any symbol for continue");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                attempt = reader.readLine();
            } catch (IOException e1) {
                System.out.println("Please \\'N\\' for finish or any symbol for continue!");
            }
            if (attempt.equals("N") || attempt.equals("n")) {
                System.out.println("The end of calculation!");
                break;
            }
        }
    }
}

