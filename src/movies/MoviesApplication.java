package movies;

import java.util.*;


public class MoviesApplication {
    public static Movie[] moviesArray = MoviesArray.findAll();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int response;
        String addName;
        String addCategory;

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
            System.out.println("6 - View Musicals");
            System.out.println("7 - View Comedies");
            response = sc.nextInt();

            userOption(response);
        }
        while (response != 0);


    }

    private static void showAll() {
        Movie moviesArray[] = MoviesArray.findAll();
        for (Movie movie : moviesArray) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    private static void getCategory(String category) {
        Movie moviesArray[] = MoviesArray.findAll();
        for (Movie movie : moviesArray) {
            if (movie.getCategory().equals(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    private static void userOption(int response) {
        switch (response) {
            case 0:
                System.out.println("Thanks for using the Movies App.");
                break;
            case 1:
                showAll();
                break;
            case 2:
                getCategory("animated");
                break;
            case 3:
                getCategory("drama");
                break;
            case 4:
                getCategory("horror");
                break;
            case 5:
                getCategory("scifi");
                break;
            case 6:
                getCategory("musical");
                break;
            case 7:
                getCategory("comedy");
                break;

        }


    }



}

//                case 6:
//                    Movie[] newMoviesArray = Arrays.copyOf(moviesArray, moviesArray.length + 1);
//                    Movie testMovie = new Movie();
//                    System.out.println("Enter a movie name.");
//                    addName = sc.nextLine();
//                    sc.nextLine();
//                    testMovie.setName(addName);
//                    System.out.println("Enter a category.");
//                    addCategory = sc.nextLine();
//                    testMovie.setCategory(addCategory);
////                    sc.nextLine();
//                    newMoviesArray[newMoviesArray.length-1] = testMovie;
//                    System.out.println(newMoviesArray[newMoviesArray.length-1].getName() + " " + newMoviesArray[newMoviesArray.length-1].getCategory());
//
//                    Movie testMovie = Movie(addName, addCategory);
//                    newMoviesArray[newMoviesArray.length - 1] = testMovie;
//                    movies = newMoviesArray;

