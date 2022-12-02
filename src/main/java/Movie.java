import java.util.List;

public class Movie {
    public Movie() {
    }

    public Movie(String title, Director director, String genre, int year, List<Actor> actors) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.actors = actors;
    }

    private String title;
    private Director director;
    private String genre;
    private int year;
    private List<Actor> actors;

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public List<Actor> getActors() {
        return actors;
    }
}
