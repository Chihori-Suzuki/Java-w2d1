package week2.day1;
import java.util.Scanner;

public class OrderThreeCities {
    public static void main(String[] args) {
        
        System.out.print("Enter employee's name : ");
        Scanner input1 = new Scanner(System.in);
        String name = input1.nextLine();

        System.out.print("Enter number of hours worked in a week : ");
        Scanner input2 = new Scanner(System.in);
        Double hour = input2.nextDouble();

        System.out.print("Enter hourly pay rate : ");
        Scanner input3 = new Scanner(System.in);
        Double hourlyRate = input3.nextDouble();

        System.out.print("Enter federal tax withholding rate : ");
        Scanner input4 = new Scanner(System.in);
        Double federalTax = input4.nextDouble();

        System.out.print("Enter state tax withholding rate : ");
        Scanner input5 = new Scanner(System.in);
        Double stateTax = input5.nextDouble();

        Double gross = hour * hourlyRate;


        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hour);
        System.out.println("Pay Rate: $" + hourlyRate);
        System.out.println("Gross Pay: $" + gross);
        System.out.println("Deductions:");

        Double federalTaxPer = federalTax * 100;
        Double dedFed = gross * federalTax;
        System.out.println("  Federal Withholding (" + Math.round(federalTaxPer * 100.0) / 100.0 + "%): $" +  Math.round(dedFed  * 100.0) / 100.0);

        Double stWithPer = stateTax * 100;
        Double stWith = gross * stateTax;
        System.out.println("  State Withholding (" + Math.round(stWithPer * 100.0) / 100.0 + "%): $" +  Math.round(stWith * 100.0) / 100.0);


        System.out.println("  Total Deduction: $" + Math.floor((dedFed + stWith) * 100.0) / 100.0);
        System.out.println("Net Pay: $" + Math.floor((gross - (dedFed + stWith))* 100.0) / 100.0);
        
        
    }
}
