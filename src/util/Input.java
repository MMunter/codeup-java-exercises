package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;
    int number = 0;
    int digit = 0;
    double decimal = 0;
    double newDecimal = 0;

    public Input(){
        scan = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scan.nextLine();

    }

    public String numberPrompt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ".");
        return scan.nextLine();

    }

    public String numberPrompt(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max + ".");
        return scan.nextLine();

    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String answer = scan.next();
        scan.nextLine();
        return (answer.toLowerCase().startsWith("y"));
    }

    public int getInt(int min, int max){
        do {

            number = Integer.parseInt(numberPrompt(min, max));
        }

        while(number < min || number > max);

        return number;
    }

    public int getInt(){
       digit = Integer.parseInt(getString("Enter a number."));

         return digit;
    }

    public double getDouble(double min, double max){
        do{
            decimal = Double.parseDouble(numberPrompt(min, max));
        }
        while(decimal < min || decimal > max);

        return decimal;
    }

    public double getDouble(){
        newDecimal = Double.parseDouble(getString("Enter a number."));
        return newDecimal;
    }


}
