import java.util.*;
public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = {"agreeable", "brave", "calm", "delightful", "eager", "faithful", "good", "new", "high", "young"};

        String[] nouns = {"boy", "girl", "dog", "cat", "baby", "child", "car", "chair", "store", "friend"};

        randomElement(adjectives, nouns);
    }

    public static void randomElement(String[] a, String[] b) {
           int rnd1 = new Random().nextInt(a.length);
           int rnd2 = new Random().nextInt(b.length);
            System.out.printf("Here is your server name: %n" + a[rnd1] + "-" + b[rnd2]);
    }

}
