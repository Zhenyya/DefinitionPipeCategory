package calculation;

public class CategoryPipeL2 extends Category {

    @Override
    public void calculateCategory(int diameter, double pressure, double resultMultiplication) {

        System.out.println(resultMultiplication);

        if (diameter <= 200) {
            System.out.println("No category d < 200");
        } else {
            if ((pressure > 1.0 && pressure <= 50.0) && resultMultiplication > 500) {
                System.out.println("Cat. 1");
            } else if (pressure > 50.0) {
                System.out.println("Cat. 2");
            } else {
                System.out.println("No category dob <= 500");
            }
        }
    }
}
