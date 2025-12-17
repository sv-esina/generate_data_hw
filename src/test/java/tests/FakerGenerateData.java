package tests;

import com.github.javafaker.Faker;
import java.util.Locale;

import utils.RandomUtils.*;


public class FakerGenerateData {
    protected static Faker faker = new Faker(new Locale("ru"));
    protected static Faker fakerEn = new Faker(new Locale("en-US"));

    static String fakerFirstName = faker.name().firstName();
    static String fakerLastName = faker.name().lastName();
    static String fakerEmail = fakerEn.internet().emailAddress();
    static String fakerPhoneNumber = faker.phoneNumber().subscriberNumber(10);
    static String fakerImage = faker.options().option("image1.png", "image2.png");
    static String fakerBirthDay = String.format("%s", faker.number().numberBetween(10, 28));
    static String fakerBirthMonth = String.format("%s", faker.options().option("January", "February",
            "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
    static String fakerBirthYear = String.format("%s", faker.number().numberBetween(1990, 2010));
    static String fakerCurAddress = faker.address().fullAddress();
    public static String fakerState = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");


    public static String getRandomCity() {
        return switch (fakerState) {

            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> null;
        };
    }
}
