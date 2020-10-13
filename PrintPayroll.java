package week2.day1;
import java.util.Scanner;

public class PrintPayroll {
    public static void main(String[] args) {

        System.out.print("Enter the length from the center to a vertex: ");
        Scanner input1 = new Scanner(System.in);
        double centerLen = input1.nextDouble();

        double sideLen = 2 * centerLen * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(sideLen, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The area of the pentagon is " + Math.floor(area* 100.0) / 100.0);

    }
}
