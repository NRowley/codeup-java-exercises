package movies;

//Inside of src, create a directory named movies. Create all of the classes described below in this directory.
//Create a class named Movie. It should have private fields for name and category,and a constructor that sets both of these.
//Create methods to access these properties and change them (getters and setters).

import java.util.Arrays;

public class Movie {
    //Static properties////////////////

    //Instance Properties//////////////
    private String name;
    private String category;

    //Constructors////////////////////////
    public Movie(String nameStr, String categoryStr) {
        name = nameStr;
        category = categoryStr;
    }

    //Getters and setters/////////////////
    public String getMovieName() {
        return this.name;
    }

    public void setMovieName(String newNameStr) {
        this.name = newNameStr;
    }

    public String getMovieCategory() {
        return this.category;
    }

    public void setMovieCategory(String newCategoryStr) {
        this.category = newCategoryStr;
    }

    //Instance Methods///////////////////////////
    public static Movie[] addMovie(Movie[] currentMovies, String name, String cat) {
        Movie[] updatedMovies = Arrays.copyOf(currentMovies, (currentMovies.length + 1));
        updatedMovies[updatedMovies.length-1] = new Movie(name, cat);
        return updatedMovies;
    }
}
