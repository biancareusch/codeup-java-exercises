package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {


        System.out.println(
                "\nWhat would you like to do?" +
                        "\n0 - exit" +
                        "\n1 - view all movies" +
                        "\n2 - view movies in animated category" +
                        "\n3 - view movies in drama category" +
                        "\n4 - view movies in horror category" +
                        "\n5 - view movies in sci-fi category"
        );
        Input userInput = new Input();
        int userSelect = userInput.getInt(0,5,"Enter your menu option: ");
        Movie[] allMovies = MoviesArray.findAll();

        switch (userSelect) {
            case 0:
                break;
            case 1:
                display(allMovies);
                break;
            case 2:
                display(allMovies, "animated");
                break;
            case 3:
                display(allMovies, "drama");
                break;
            case 4:
                display(allMovies, "horror");
                break;
            case 5:
                display(allMovies, "scifi");
                break;
        }

    }


    public static void display(Movie[] allMovies) {
        for (Movie movie : allMovies) {
            String name = movie.getMovieName();
            String category = movie.getMovieCategory();
            System.out.println(name + " -- " + category);
        }
    }

        public static void display (Movie[]allMovies, String category){
            for (Movie movie : allMovies) {
                String movieCategory = movie.getMovieCategory();
                if (movieCategory.equalsIgnoreCase(category)) {
                    System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
                }
            }
        }





}
