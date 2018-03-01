import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input = 0;

        System.out.println(addition(1, 2));
        System.out.println(subtraction(5,2));
        System.out.println(multiplication(2,3));
        System.out.println(division(3,2));
        System.out.println(mod(6,2));

       do {
           System.out.println("Enter a number between 1 and 10");
           input = sc.nextInt();
           System.out.println(getInteger(input, 1, 10));
       }
       while(!getInteger(input, 1, 10));

        System.out.println("Factorial: Please enter a number between 1 and 20");
        int number = sc.nextInt();

        long answer = factorial(number);

        System.out.print(number + "! = ");
        System.out.format("%,d%n", answer);

        }
    public static float addition(float a, float b){
        return a + b;
    }

    public static float subtraction(float a, float b){
        return a - b;
    }

    public static float multiplication(float a, float b){

            if (b == 1)
                return a;
            if (b == 0)
                return 0;
            if (b > 1)
                return multiplication(a, b-1) + a;

            return -1;// it will never be executed
        }


    public static float division(float a, float b){
        return a / b;
    }

    public static float mod(float a, float b){
        return a % b;
    }

    public static boolean getInteger(int input, int min, int max){
        return (input >= min && input <= max);
    }

    public static long factorial(long number){
        long result = 1;
        if (number >= 1 && number <= 20){
            for (long i = 1; i <= number; i++){
                result *= i;
            }
        }
        return result;
    }

}
