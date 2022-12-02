import java.util.List;

public class MovieLibrary {
    public MovieLibrary() {
    }

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }

    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }
}
