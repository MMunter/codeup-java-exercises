import java.util.*;
public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = {"agreeable", "brave", "calm", "delightful", "eager", "faithful", "good", "new", "high", "young"};

        String[] nouns = {"boy", "girl", "dog", "cat", "baby", "child", "car", "chair", "store", "friend"};

        randomElement(adjectives, nouns);

        String[] movies = new movies [3];
        movies[0] = {"Citizen Kane", "drama"};
        movies[1] = {"Casablaca", "drama"};
        movies[2] = {"Psycho", "horror"};

        for (String movie : movies){
            String drama = movie.
            System.out.println();
        }



    }
    public static void randomElement(String[] a, String[] b) {
           int rnd1 = new Random().nextInt(a.length);
           int rnd2 = new Random().nextInt(b.length);
            System.out.printf("Here is your server name: %n" + a[rnd1] + "-" + b[rnd2]);
    }

}
