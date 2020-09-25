package ExceptionPractice;

public class App {
    public static void main(String[] args) {
        Animal dog = null;

        try {
            dog = new Animal ("Fido", -7);
        }
        catch(AgeAnimalException e){
            System.out.println(e.getMessage());
        }
    }
}
