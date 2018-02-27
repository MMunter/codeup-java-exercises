import java.util.Scanner;
public class ConsoleExercises {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of the classroom.");
        float length = Float.parseFloat(sc.nextLine());

        System.out.println("Please enter the width of the classroom.");
        float width = Float.parseFloat(sc.nextLine());

        System.out.println("Please enter the height of the classroom.");
        float height = Float.parseFloat(sc.nextLine());

        float perimeter = 2 * length + 2 * width;

        System.out.println("The area is " + length * width);
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The volume of the room is " + length * width * height);

//        String string1 = sc.next();
//        String string2 = sc.next();
//        String string3 = sc.next();
//
//        System.out.println(string1);
//        System.out.println(string2);
//        System.out.println(string3);


    }
}
