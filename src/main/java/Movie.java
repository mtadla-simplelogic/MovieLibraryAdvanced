import java.util.List;

public class Movie {
    private String title;
    private Director director;
    private String genre;
    private int year;
    private List<Actor> actors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Movie() {}
    public Movie(String title, Director director, String genre, int year, List<Actor> actors) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.actors = actors;
    }
}
