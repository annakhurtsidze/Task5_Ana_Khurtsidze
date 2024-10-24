import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Please enter width of rectangle ");
        Scanner scanner = new Scanner(System.in);

        double enterWidth = scanner.nextDouble();

        System.out.println("Please enter width of rectangle ");
        double enterLength = scanner.nextDouble();
        scanner.close();

        System.out.println("Area of the rectangle is: " + calculateArea(enterLength, enterWidth));
    }


    public static double calculateArea(double length, double width){
        return length*width;

    }
}
