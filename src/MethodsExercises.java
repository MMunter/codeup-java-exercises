public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(addition(1, 2));
        System.out.println(subtraction(5,2));
        System.out.println(multiplication(2,3));
        System.out.println(division(3,2));
        System.out.println(mod(6,2));
    }
    public static float addition(float a, float b){
        return a + b;
    }

    public static float subtraction(float a, float b){
        return a - b;
    }

    public static float multiplication(float a, float b){
        int result = 0;
       while (a > 0){
           result += b;
           a--;
       }
       return result;
    }

    public static float division(float a, float b){
        return a / b;
    }

    public static float mod(float a, float b){
        return a % b;
    }
}
