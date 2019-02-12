package calculation;

public class CategoryPipeG2 extends Category {

    @Override
    public void calculateCategory(int diameter, double pressure, double resultMultiplication) {

        //dobutok = diameter * pressure;
        System.out.println(resultMultiplication);

        if (pressure <= 0.05) {
            System.out.println("No category P <= 0.05 MPa");
        } else if (pressure > 0.05 && pressure <= 3.2) {
            if (diameter > 32 && (resultMultiplication > 100 && resultMultiplication <= 350)) {
                System.out.println("Cat.1");
            } else if (diameter > 100 && (resultMultiplication > 350 && resultMultiplication <= 500)) {
                System.out.println("Cat.2");
            } else if (diameter > 250 && (resultMultiplication > 500)) {
                System.out.println("Cat.3");
            } else {
                System.out.println("No category for pressure > 0.05 and pressure <= 3.2");
            }
        } else {
            if (diameter <= 32) {
                System.out.println("No category for d <= 32 mm and P > 3.2 MPa");
            } else if (diameter > 32 && diameter <= 100) {
                System.out.println("Cat.1");
            } else if (diameter > 100 && diameter <= 250) {
                System.out.println("Cat.2");
            } else {
                System.out.println("Cat.3");
            }
        }
    }
}

