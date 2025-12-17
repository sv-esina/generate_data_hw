package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import utils.RandomUtils;
import utils.RandomUtils.*;
import tests.FakerGenerateData.*;
import static tests.FakerGenerateData.*;

public class PracticeFormWithGenerateData extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();
    String gender = RandomUtils.getRandomGender();
    String subject = RandomUtils.getRandomSubjects();
    String hobbie = RandomUtils.getRandomHobbies();
    String city = RandomUtils.getRandomCity();

    @Test
    void successfulRegistrationTest(){

        practiceFormPage.openPage()
                .removeBanners()
                .setFirstName(fakerFirstName)
                .setLastName(fakerLastName)
                .setEmail(fakerEmail)
                .setGender(gender)
                .setUserNumber(fakerPhoneNumber)
                .setBirthDate(fakerBirthDay, fakerBirthMonth, fakerBirthYear)
                .setSubjects(subject)
                .setHobbies(hobbie)
                .uploadPicture(fakerImage)
                .currentAddress(fakerCurAddress)
                .scroll()
                .setState(fakerState)
                .setCity(city)
                .clickSubmit()
                .checkResultTable("Student Name", fakerFirstName + " " + fakerLastName)
                .checkResultTable("Student Email", fakerEmail)
                .checkResultTable("Gender", gender)
                .checkResultTable("Mobile", fakerPhoneNumber)
                .checkResultTable("Date of Birth", fakerBirthDay + " " + fakerBirthMonth + "," + fakerBirthYear)
                .checkResultTable("Subjects", subject)
                .checkResultTable("Hobbies", hobbie)
                .checkResultTable("Picture", fakerImage)
                .checkResultTable("Address", fakerCurAddress)
                .checkResultTable("State and City", fakerState + " " + city)
                .closeTable()
                ;
    }
}

