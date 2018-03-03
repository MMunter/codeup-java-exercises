package util;

public class InputTest {
    public static void main(String[] args){
        Input userInput = new Input();

        System.out.println(userInput.getString("Anything i want"));

        System.out.println(userInput.yesNo("Say yes or no."));

        System.out.println(userInput.getInt(1, 10));

        System.out.println(userInput.getInt());

        System.out.println(userInput.getDouble(-.5, .5));

        System.out.println(userInput.getDouble());
    }
}
