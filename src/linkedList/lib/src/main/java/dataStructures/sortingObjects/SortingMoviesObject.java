package dataStructures.sortingObjects;
import java.util.ArrayList;
import java.util.List;

public class SortingMoviesObject {

    //NOTE: THE TASK IS SOLVED BY INSERTION SORT ALGORITHM AS THE PREVIOUS LAB
    public static void insertByYearDescending(List<Movie> sorted, Movie movie) {
        int i = 0;
        while (i < sorted.size() && movie.getYear() > sorted.get(i).getYear()) {
            i++;
        }
        sorted.add(i, movie);
    }

    public static void insertAlphabeticallyIgnoringArticles(List<Movie> sorted, Movie movie) {
        int i = 0;
        String title = movie.getTitle().replaceAll("^(A|An|The)\\s+", "");
        while (i < sorted.size()) {
            String sortedTitle = sorted.get(i).getTitle().replaceAll("^(A|An|The)\\s+", "");
            if (title.compareToIgnoreCase(sortedTitle) > 0) {
                i++;
            } else {
                break;
            }
        }
        sorted.add(i, movie);
    }

    public static List<Movie> insertionSortByYearDescending(List<Movie> movies) {
        List<Movie> sorted = new ArrayList<>();
        sorted.add(movies.get(0));
        for (int i = 1; i < movies.size(); i++) {
            insertByYearDescending(sorted, movies.get(i));
        }
        return sorted;
    }

    public static List<Movie> insertionSortAlphabeticallyIgnoringArticles(List<Movie> movies) {
        List<Movie> sorted = new ArrayList<>();
        sorted.add(movies.get(0));
        for (int i = 1; i < movies.size(); i++) {
            insertAlphabeticallyIgnoringArticles(sorted, movies.get(i));
        }
        return sorted;
    }
}