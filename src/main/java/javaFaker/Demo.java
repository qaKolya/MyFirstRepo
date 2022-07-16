package javaFaker;

import com.github.javafaker.Faker;

public class Demo {

    protected static Faker faker = new Faker();

    public static void main(String[] args) {

        System.out.println(generateFakeFirstName());
        System.out.println(generateFakeLastName());
        System.out.println(generateeFakeEmail());

    }

    public static String generateFakeFirstName(){

        return "Hello my name is " + faker.name().firstName();
    }

    public static String generateFakeLastName(){
        return "Last name is " + faker.name().lastName();
    }

    public static String generateeFakeEmail(){
        return "Email is " + faker.internet().emailAddress();
    }

    public static String generateFakeAnimal(){
        return "Animal is " + faker.animal();
    }
}
