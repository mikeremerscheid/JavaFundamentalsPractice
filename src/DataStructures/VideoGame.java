package DataStructures;

import java.util.Arrays;

public class VideoGame {

    String name, rating;
    String[] platforms;
    int year;

    public VideoGame(String name, int year, String rating, String[] platforms) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                ", platforms=" + Arrays.toString(platforms) +
                ", year=" + year +
                '}';
    }
}
