import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        return (degrees*3.14159265/180);
        // Pur your code here
    }

    public static double toDegrees(double radians) {
        return (radians*180/3.14159265);
        // Put your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        double newRadians = toRadians(degrees);
        System.out.println(newRadians);
        System.out.println("Math.to results:"+Math.toRadians(degrees));

        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        double newDegrees = toDegrees(radians);
        System.out.println(newDegrees);
        System.out.println("Math.to results:"+Math.toDegrees(radians));

        // Add System.out, your method call, and Math.toDegrees call here
    }
}
