package utils;

import tests.FakerGenerateData;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils extends FakerGenerateData {

    public static void main(String[] args) {
        System.out.println(getRandomGender());
        System.out.println(getRandomSubjects());
        System.out.println(getRandomHobbies());
    }


    public static int getRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }


    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        String randomGender = getRandomItemFromStringArray(genders);

        return randomGender;
    }

    public static String getRandomSubjects() {
        String[] subjects = {"Accounting",
                "Arts", "Biology", "Business Studies", "Chemistry", "Civics", "Commerce", "Computer Science",
                "Economics", "English", "Finance", "Hindi", "History", "Maths", "Physics", "Social Studies"};
        String randomSubjects = getRandomItemFromStringArray(subjects);

        return randomSubjects;
    }

    public static String getRandomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        String randomHobbies = getRandomItemFromStringArray(hobbies);

        return randomHobbies;
    }

    public static String getRandomItemFromStringArray(String[] stringArray) {
        int arrayLength = stringArray.length - 1;
        int randomInt = getRandomInt(0, arrayLength);

        return stringArray[randomInt];
    }

}