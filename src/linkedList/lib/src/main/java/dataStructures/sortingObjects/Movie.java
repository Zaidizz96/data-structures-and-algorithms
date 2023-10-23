package dataStructures.sortingObjects;

import java.util.Arrays;

public class Movie {
    String title;
    int year;
    String[] genres;

    public Movie(String title, int year, String[] genres) {
        this.title = title;
        this.year = year;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genres=" + Arrays.toString(genres) +
                '}';
    }
}
