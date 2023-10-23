package dataStructures.sortingObjects;

import java.util.ArrayList;
import java.util.List;

import static dataStructures.sortingObjects.SortingMoviesObject.insertionSortAlphabeticallyIgnoringArticles;
import static dataStructures.sortingObjects.SortingMoviesObject.insertionSortByYearDescending;

public class Driver {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 2010, new String[]{"Action", "Adventure", "Sci-Fi"}));
        movies.add(new Movie("The Matrix", 1999, new String[]{"Action", "Sci-Fi"}));
        movies.add(new Movie("Forrest Gump", 1994, new String[]{"Drama", "Romance"}));
        movies.add(new Movie("The Dark Knight", 2008, new String[]{"Action", "Crime", "Drama"}));
        movies.add(new Movie("Gladiator", 2000, new String[]{"Action", "Adventure", "Drama"}));
        movies.add(new Movie("Jurassic Park", 1993, new String[]{"Action", "Adventure", "Sci-Fi"}));


        List<Movie> sortedByYear = insertionSortByYearDescending(movies);

        List<Movie> sortedAlphabetically = insertionSortAlphabeticallyIgnoringArticles(movies);

        System.out.println("Sorted by Year (Descending):");
        for (Movie movie : sortedByYear) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
        }

        System.out.println("Sorted Alphabetically by Title (Ignoring Articles):");
        for (Movie movie : sortedAlphabetically) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
        }
    }}

