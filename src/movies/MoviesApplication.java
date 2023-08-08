package movies;

//Download the MoviesArray file and save it as MoviesArray.java inside of movies.
//This class has a static method named findAll that will return an array of Movie objects.
//Create a class named MoviesApplication that has a main method.

//Give the user a list of options for viewing all the movies or viewing movies by category.
//Use your Input class to get input from the user, and display information based on their choice.
//(Remember to import your Input class)
//If a category is selected, only movies from that category should be displayed.
//Your application should continue to run until the user chooses to exit.

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input movieInputs = new Input();
        Movie[] allMovies = MoviesArray.findAll();

        int viewOption;
        do {
            System.out.println("Please enter an option!\n0: Exit\n1: View All Movies\n2: View Animated Movies\n3: View Drama Movies\n4: View Horror Movies\n5: View SciFi Movies\n6: View Comedy Movies\n7: Add a movie");
            viewOption = movieInputs.getInt(0, 7);
            if (viewOption == 1) {
                getAllMovies(allMovies);
            } else if (viewOption == 2) {
                String cat = "Animated";
                getMoviesByCat(allMovies, cat);
            } else if (viewOption == 3) {
                String cat = "Drama";
                getMoviesByCat(allMovies, cat);
            } else if (viewOption == 4) {
                String cat = "Horror";
                getMoviesByCat(allMovies, cat);
            } else if (viewOption == 5) {
                String cat = "SciFi";
                getMoviesByCat(allMovies, cat);
            } else if (viewOption == 6) {
                String cat = "Comedy";
                getMoviesByCat(allMovies, cat);
            } else if (viewOption == 7) {
                System.out.println("Add a Movie!\n------------------------------");
                System.out.println("Enter movie name:");
                String newMovieName = movieInputs.getString();
                String newMovieCat = "";
                System.out.println("Select a category:\n1: Animated\n2: Drama\n3: Horror\n4: SciFi\n5: Comedy\n");
                int newMovieCategoryNum = movieInputs.getInt(1, 5);
                if (newMovieCategoryNum == 1) {
                    newMovieCat = "animated";
                } else if (newMovieCategoryNum == 2) {
                    newMovieCat = "drama";
                } else if (newMovieCategoryNum == 3) {
                    newMovieCat = "horror";
                } else if (newMovieCategoryNum == 4) {
                    newMovieCat = "scifi";
                } else {
                    newMovieCat = "comedy";
                }
                allMovies = Movie.addMovie(allMovies, newMovieName, newMovieCat);
            }
        } while (viewOption != 0);
        System.out.println("Exiting... Goodbye!");
    }

    public static void getAllMovies(Movie[] allMovies) {
        System.out.println("---All Movies---\n------------------------------");
        for (int i = 0; i < allMovies.length; i++) {
            System.out.printf("#%d: %s  -- %s\n", i + 1, allMovies[i].getMovieName(), allMovies[i].getMovieCategory());
        }
        System.out.println("\n");
    }

    public static void getMoviesByCat(Movie[] allMovies, String cat) {
        System.out.printf("---%s Category---\n------------------------------\n", cat);
        for (int i = 0; i < allMovies.length; i++) {
            if (allMovies[i].getMovieCategory().equalsIgnoreCase(cat)) {
                System.out.printf("#%d: %s -- %s\n", i + 1, allMovies[i].getMovieName(), allMovies[i].getMovieCategory());
            }
        }
        System.out.println("\n");
    }
}