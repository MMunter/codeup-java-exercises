package movies;

import java.util.*;


public class MoviesApplication {
    public static Movie[] moviesArray = MoviesArray.findAll();

    public static void main(String[] args) {
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
            System.out.println("6 - View Musicals");
            System.out.println("7 - View Comedies");
            System.out.println("8 - Add a movie.");
            response = sc.nextInt();

            userOption(response);
        }
        while (response != 0);
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
            case 8:
                addMovie();
                break;
            default:
                System.out.println("That is not a valid option.");
                break;
        }
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

    private static void addMovie(){
        Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a movie name.");
                    System.out.println("Enter a category.");
                    String addName = sc.nextLine();
                    String addCategory = sc.nextLine();
                    Movie testMovie = new Movie(addName, addCategory);
                    Movie[] newMoviesArray = Arrays.copyOf(moviesArray, moviesArray.length + 1);
                    newMoviesArray[newMoviesArray.length-1] = testMovie;

    }

    }

//}

//                case 6:
//
//                    Movie testMovie = Movie(addName, addCategory);
//                    newMoviesArray[newMoviesArray.length - 1] = testMovie;
//                    movies = newMoviesArray;

