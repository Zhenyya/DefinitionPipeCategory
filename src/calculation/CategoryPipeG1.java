package calculation;

public class CategoryPipeG1 extends Category {

    @Override
    public void calculateCategory(int diameter, double pressure, double resultMultiplication) {

        System.out.println(resultMultiplication);

        if (pressure <= 0.05) {
            System.out.println("No category P <= 0.05 MPa");
        } else if (pressure > 0.05 && pressure <= 1.0) {
            if (diameter <= 25) {
                System.out.println("No category d <= 25 mm");
            } else if (diameter > 25 && diameter <= 100) {
                System.out.println("Cat.1");
            } else if (diameter > 100 && diameter < 350) {
                System.out.println("Cat.2");
            } else {
                System.out.println("Cat.3");
            }
        } else if (pressure > 1.0 && pressure <= 3.5) {
            if (resultMultiplication <= 100 && (diameter > 25 && diameter <= 100)) {
                System.out.println("Cat.1");
            } else if ((resultMultiplication > 100 && resultMultiplication <= 350) &&
                    (diameter > 25 && diameter <= 350)) {
                System.out.println("Cat.2");
            } else if (resultMultiplication > 350 && (diameter > 100 && diameter <= 350)) {
                System.out.println("Cat.3");
            } else {
                System.out.println("No category case pressure > 1.0 && pressure <= 3.5");
            }
        } else {
            if (diameter <= 25) {
                System.out.println("No category d <= 25 for P > 3.5 MPa");
            } else if (diameter > 25 && diameter <= 100) {
                System.out.println("Cat.2");
            } else {
                System.out.println("Cat.3");
            }
        }
    }
}

