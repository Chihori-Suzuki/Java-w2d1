package week2.day1;
import java.util.Scanner;
import java.util.*;

public class PentagonArea {
    public static void main(String[] args) {

        System.out.print("Enter the first city: ");
        Scanner input1 = new Scanner(System.in);
        String city1 = input1.nextLine();
        city1 = city1.substring(0,1).toUpperCase() + city1.substring(1).toLowerCase();

        System.out.print("Enter the second city: ");
        Scanner input2 = new Scanner(System.in);
        String city2 = input2.nextLine();
        city2 = city2.substring(0,1).toUpperCase() + city2.substring(1).toLowerCase();

        System.out.print("Enter the third city: ");
        Scanner input3 = new Scanner(System.in);
        String city3 = input3.nextLine();
        city3 = city3.substring(0,1).toUpperCase() + city3.substring(1).toLowerCase();
        
        ArrayList<String> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);

        Collections.sort(cities);
        String ans = String.join(" " ,cities);

        // String ans = "";
        // for(int i = 0; i < cities.size(); i++){
        //     ans = ans + " " + cities.get(i);
        // }

        System.out.println("The three cities in alphabetical order are " + ans);

    }
}
