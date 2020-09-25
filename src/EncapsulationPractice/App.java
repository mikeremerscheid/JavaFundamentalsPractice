package EncapsulationPractice;

public class App {

    public static void main(String[] args) {
        Movie m1 = new Movie("The Matrix", "Wachowski", "R");
        Movie m2 = new Movie("Pulp Fiction", "Tarantino", "R");

        m1.setRating("DOG");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }


}
