import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash;
        boolean ok;

        double width = 0.0;
        double height = 0.0;

        // width > 0
        ok = false;
        do {
            System.out.print("Enter width (> 0): ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width > 0) {
                    ok = true;
                } else {
                    System.out.println("Width must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!ok);

        ok = false;
        do {
            System.out.print("Enter height (> 0): ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                if (height > 0) {
                    ok = true;
                } else {
                    System.out.println("Height must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!ok);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.hypot(width, height);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);

    }
}