package grades;

import java.util.*;
import util.Input;


public class GradesApplication {
    static Input userInput = new Input();
    static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        Student student1 = new Student("Marcy");
        student1.addGrade(50);
        student1.addGrade(45);
        student1.addGrade(55);
        students.put("IluvCodeup", student1);

        Student student2 = new Student("Marcella");
        student2.addGrade(80);
        student2.addGrade(100);
        student2.addGrade(90);
        students.put("ImAwesome", student2);

        Student student3 = new Student("Mark");
        student3.addGrade(80);
        student3.addGrade(80);
        student3.addGrade(95);
        students.put("WelcomeToMyHouse", student3);

        Student student4 = new Student("Max");
        student4.addGrade(83);
        student4.addGrade(97);
        student4.addGrade(100);
        students.put("HateUsCauseTheyAinUs", student4);

        System.out.printf("%nWelcome! %n%nHere are the github students of our students:%n%n");

        Set<HashMap.Entry<String, Student>> entries = students.entrySet();

        for(HashMap.Entry<String, Student> st : entries){
            System.out.print("|" + st.getKey() + "| ");
        }

        System.out.printf("%n%n");
        displayMapInfo();
    }


    public static void displayMapInfo() {
        String keepGoing;
         do {  String response = userInput.getString("What student would you like to see more information on?");

            if (students.containsKey(response)) {
                Student student = students.get(response);
                System.out.printf("%nGithub Username: " + response + "%n%n");
                System.out.printf("Name | Grade Average%n");
                System.out.println("---------------------");
                student.display();
            }
            else if (!students.containsKey(response)) {
                System.out.println("Sorry, no student found with the github username of " + response);
            }
             System.out.println("");
             keepGoing = userInput.getString("Would you like to see another student?");
         }
         while(keepGoing.startsWith("y"));

         if (keepGoing.startsWith("n")){
             System.out.println("Goodbye.");
         }
        }
}
