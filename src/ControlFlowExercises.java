import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");

        int number= sc.nextInt();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("Number | Squared  | Cubed");
            System.out.println("------ | -------  | -----");
        for(int i = 1; i <= number; i++){
            System.out.println(i + "      | " + i * i + "        | " + i * i * i);
            }
    }
}

