package week2.day1;
import java.util.Scanner;

public class PentagonArea {
    public static void main(String[] args) {

        System.out.print("Enter the first city: ");
        Scanner input1 = new Scanner(System.in);
        String city1 = input1.nextLine();

        System.out.print("Enter the second city: ");
        Scanner input2 = new Scanner(System.in);
        String city2 = input2.nextLine();

        System.out.print("Enter the third city: ");
        Scanner input3 = new Scanner(System.in);
        String city3 = input3.nextLine();
        
        System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);


    }
}
