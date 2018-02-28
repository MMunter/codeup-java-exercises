import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String answer = "";

       do {
           System.out.println("Say something to Bob.");
           String input = sc.nextLine();

           if (input.endsWith("?")) {
               System.out.println("Sure.");
           } else if (input.trim().equals("")) {
               System.out.println("Fine. Be that way!");
           } else if (input.endsWith("!") || input.toUpperCase().equals(input)) {
               System.out.println("Whoa, chill out!");
           } else {
               System.out.println("Whatever.");
           }
           System.out.println("Would you like to say something else to Bob?");
           answer = sc.nextLine().toLowerCase();
       }
       while(answer.startsWith("y"));
    }
}
