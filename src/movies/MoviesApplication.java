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
                        "\n5 - view movies in sci-fi category" +
                        "\n6 - add a movie"
        );
        Input userInput = new Input();
        int userSelect = userInput.getInt(0, 6, "Enter your menu option: ");
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
            case 6:
                Input userName = new Input();
                String newMovieName = userName.getString("Enter new Movie name: ");
                Input userCategory = new Input();
                String newMovieCategory = userCategory.getString("Enter new Movie category: ");
                System.out.println("newMovieCategory = " + newMovieCategory);

                addMovie(allMovies, new Movie(newMovieName, newMovieCategory));
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

    public static void display(Movie[] allMovies, String category) {
        for (Movie movie : allMovies) {
            String movieCategory = movie.getMovieCategory();
            if (movieCategory.equalsIgnoreCase(category)) {
                System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
            }
        }
    }

    public static Movie[] addMovie(Movie[] allMovies, Movie newMovie) {
        Movie[] tempArr = Arrays.copyOf(allMovies, allMovies.length + 1);
        tempArr[tempArr.length - 1] = newMovie;
        for (Movie singleMovie : tempArr) {
            System.out.println(singleMovie.getMovieName() + " -- " + singleMovie.getMovieCategory());
        }
        return tempArr;
    }

//    public static Movie[] addMovie(Movie[] allMovies, Movie newInput) {
//
//        Movie[] tempArr = Arrays.copyOf(allMovies, allMovies.length + 1);
//        tempArr[tempArr.length - 1] = newMovie;
//        for (Movie singleMovie : tempArr) {
//            System.out.println(singleMovie.getMovieName() + " -- " + singleMovie.getMovieCategory());
//        }
//        return tempArr;
//    }
//

}
