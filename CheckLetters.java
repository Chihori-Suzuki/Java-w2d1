package week2.day1;

import java.util.Scanner;
public class CheckLetters {
    public static void main(String[] args) {
        
        System.out.print("Enter a letter : ");

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char ch = str.charAt(0);
        boolean isVowel = false;

        switch(ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }

        if(isVowel){
            System.out.println(ch + " is a vowel");
        } else{
            if((ch >= 'A' && ch <= 'Z') || (ch > 'a' && ch <= 'z')){
                System.out.println(ch + " is a consonant");
            }else{
                System.out.println(ch + " is a invalid input");
            }
        }


    }
}
