package EncapsulationPractice;

import java.util.Arrays;
import java.util.List;

public class Movie {

    private String name;
    private String director;
    private String rating;

    public String getName() {                        return name;    }
    public String getDirector() {                    return director;    }
    public String getRating() {                      return rating;    }
    public void setName(String name) {               this.name = name;    }
    public void setDirector(String director) {       this.director = director;    }

    String[] ratings = {"G","PG","PG-13","R","NC-17","NR"};
    List<String> list = Arrays.asList(ratings);

    public void setRating(String rating) {
        if (list.contains(rating)){
            this.rating = rating;
        }else{
            this.rating = "NR";
        }
    }

    public Movie(String name, String director, String rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
