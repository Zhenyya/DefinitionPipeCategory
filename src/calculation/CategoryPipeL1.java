package calculation;

public class CategoryPipeL1 extends Category {

    @Override
    public void calculateCategory(int diameter, double pressure, double resultMultiplication) {

        System.out.println(resultMultiplication);

        if (diameter <= 25) {
            System.out.println("No category d < 25");
        } else {
            if (pressure > 0.05 && pressure <= 1.0) {
                if (resultMultiplication > 200) {
                    System.out.println("Cat. 1");
                } else {
                    System.out.println("No category for cat.1");
                }
            } else if (pressure > 1.0 && pressure <= 50.0){
                if (pressure <= 8.0 && resultMultiplication > 200) {
                    System.out.println("Cat. 2");
                } else if ((pressure > 8.0 && pressure <= 50.0) && resultMultiplication > 350) {
                    System.out.println("Cat. 2");
                } else {
                    System.out.println("No category for cat.2");
                }
            } else {
                System.out.println("Cat. 3");
            }
        }
    }
}
