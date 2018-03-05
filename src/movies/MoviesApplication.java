package movies;

import java.util.*;


public class MoviesApplication {

    public static void main(String[] args) {
        Movie moviesArray[] = MoviesArray.findAll();

        Scanner sc = new Scanner(System.in);
        int response;

        do {
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("0 - Exit");
            System.out.println("1 - View all movies");
            System.out.println("2 - View Animated movies");
            System.out.println("3 - View Dramas");
            System.out.println("4 - View Horror movies");
            System.out.println("5 - View Sci-fi movies");
            System.out.println("6 - Add a movie");
            response = sc.nextInt();

            switch(response) {
                case 0:
                    System.out.println("Thanks for looking at the Movies App.");
                    break;
                case 1:
                    for (Movie movie : moviesArray) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : moviesArray) {
                        String animated = movie.getCategory();
                        if (animated.equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : moviesArray) {
                        String drama = movie.getCategory();
                        if (drama.equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : moviesArray) {
                        String horror = movie.getCategory();
                        if (horror.equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : moviesArray) {
                        String scifi = movie.getCategory();
                        if (scifi.equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 6:

            }
        }
        while (response != 0);
    }
}

