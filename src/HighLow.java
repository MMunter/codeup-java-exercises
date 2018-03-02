import java.util.*;
public class HighLow {
    public static final Random RANDOM = new Random();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int guess = 0;
        int guessNum = 1;
        int number = (int) (Math.random() * (99 + 1));

        String answer = "";

    do {
        System.out.println("Guess the number!");
        guess = sc.nextInt();
        sc.nextLine();
        System.out.println("Guess Counter: " + guessNum);

        if (guess == number){
            System.out.println("GOOD GUESS!");
            System.out.println("Want to play again?");
            guessNum = 1;
            answer =sc.nextLine();
            number = (int)(Math.random() * (99 + 1));
            }

        else if (guess > number) {
            System.out.println("LOWER!");
            System.out.println("Keep guessing?");
            answer = sc.nextLine();
            guessNum++;

        } else if (guess < number) {
            System.out.println("HIGHER");
            System.out.println("Keep guessing?");
            answer = sc.nextLine();
            guessNum++;
        }

    if (guessNum == 11){
        System.out.println("You've already guessed enough times. The number is " + number + ".");
    }

    }
    while(answer.toLowerCase().startsWith("y"));

    if (answer.toLowerCase().startsWith("n")){
        System.out.println("The number was " + number);
    }


    }

}


