
package org.progra;

import java.util.List;
import java.util.ArrayList;


public class MovieDatabase {
  private static List<Movie> movies = new ArrayList<>();

    public static void addMovie(Movie movie) {
        movies.add(movie);
    }

    public static List<Movie> getMovies() {
        return movies;
    }

    public static void removeMovie(Movie movie) {
        movies.remove(movie);
    }
}
