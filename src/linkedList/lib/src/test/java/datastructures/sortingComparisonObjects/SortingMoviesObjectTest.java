package datastructures.sortingComparisonObjects;

import dataStructures.sortingObjects.Movie;
import dataStructures.sortingObjects.SortingMoviesObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;

public class SortingMoviesObjectTest {

    public List<Movie> movies;

    @BeforeEach
    public void createObjectForTest() {
        movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 1994, new String[]{"Drama"}));
        movies.add(new Movie("The Godfather", 1972, new String[]{"Crime", "Drama"}));
        movies.add(new Movie("A Clockwork Orange", 1971, new String[]{"Crime", "Drama", "Sci-Fi"}));
        movies.add(new Movie("Pulp Fiction", 1994, new String[]{"Crime", "Drama"}));
        movies.add(new Movie("A Beautiful Mind", 2001,  new String[]{"Biography", "Drama"}));
    }

    @Test
    public void testSortByYearDescending() {
        List<Movie> sorted = SortingMoviesObject.insertionSortByYearDescending(movies);
        Assertions.assertEquals(1971, sorted.get(0).getYear());
    }

    @Test
    public void testSortAlphabeticallyIgnoringArticles() {
        List<Movie> sorted = SortingMoviesObject.insertionSortAlphabeticallyIgnoringArticles(movies);
        // Assert that the first movie in the sorted list comes first alphabetically
        Assertions.assertEquals("A Beautiful Mind", sorted.get(0).getTitle());
        // Add more assertions as needed
    }
}
