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
}
