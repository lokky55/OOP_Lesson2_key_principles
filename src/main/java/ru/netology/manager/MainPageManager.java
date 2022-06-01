package ru.netology.manager;
import ru.netology.domain.Movie;

public class MainPageManager {    // класс только будет хранить информацию о том что у него есть movieManager

    private MovieManager movieManager;
    public String generatePage() {
        Movie[] movies = movieManager.getMoviesForFeed();
        return null;
    }
}
