import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");

        int number= sc.nextInt();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");

        for(long i = 1; i <= number; i++){
            System.out.format("%-7d", i);
            System.out.print(" | " + i * i);;
            System.out.println(" | " + i * i * i);
            }

        String answer = "";

        do{
            System.out.println("Enter a numerical grade.");
            int grade = sc.nextInt();
            sc.nextLine();

            if (grade >= 98 && grade <= 100) {
                System.out.println(grade + " is an A+! Congratulations!");
            }
            else if(grade >= 93 && grade <= 97){
                System.out.println(grade + " is an A! Great job!");
            }
            else if(grade >= 88 && grade <= 92){
                System.out.println(grade + " is an A-. Good work!");
            }
            else if(grade >= 85 && grade <= 87){
                System.out.println(grade + " is a B+!");
            }
            else if(grade >= 82 && grade <= 84){
                System.out.println(grade + " is a B!");
            }
            else if (grade >= 80 && grade <= 81) {
                System.out.println(grade + " is a B-!");
            }
            else if(grade >= 76 && grade <= 79){
                System.out.println(grade + " is a C+.");
            }
            else if (grade >= 72 && grade <= 75) {
                System.out.println(grade + " is a C.");
            }
            else if (grade >= 67 && grade <= 71) {
                System.out.println(grade + " is a C-.");
            }
            else if (grade >= 64 && grade <= 66) {
            System.out.println(grade + " is an D+.");
            }
            else if(grade >= 62 && grade <= 63){
                System.out.println(grade + " is a D.");
            }
            else if(grade >= 60 && grade <= 61){
                System.out.println(grade + " is a D-.");
            }
            else if(grade >= 0 && grade <= 59){
                System.out.println(grade + " is an F. Sorry.");
            }
            else  {
                System.out.println("That is not a valid grade.");
            }
            System.out.println("Would you like to enter another grade?");
            answer = sc.nextLine().toLowerCase();

        }

    while (answer.startsWith("y"));




    }
}

