package ExceptionPractice;

public class Animal {

    private String name;
    private int age;

    public Animal (String name, int age) throws AgeAnimalException{
        if (age < 0){
            throw new AgeAnimalException("An Animal object can't have a negative age: " + age);
        }
        else{
            this.name = name;
            this.age = age;
            System.out.println("You have created a dog. Name is " + this.name + ", age is " + this.age + ".");
        }
    }
}
