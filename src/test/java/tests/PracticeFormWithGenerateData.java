package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import tests.FakerGenerateData.*;


public class PracticeFormWithGenerateData extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();
    FakerGenerateData fakerGenerateData = new FakerGenerateData();


    @Test
    void successfulRegistrationTest(){

        practiceFormPage.openPage()
                .removeBanners()
                .setFirstName(fakerGenerateData.fakerFirstName)
                .setLastName(fakerGenerateData.fakerLastName)
                .setEmail(fakerGenerateData.fakerEmail)
                .setGender(fakerGenerateData.fakerRandomGender)
                .setUserNumber(fakerGenerateData.fakerPhoneNumber)
                .setBirthDate(fakerGenerateData.fakerBirthDay, fakerGenerateData.fakerBirthMonth, fakerGenerateData.fakerBirthYear)
                .setSubjects(fakerGenerateData.fakerRandomSubjects)
                .setHobbies(fakerGenerateData.fakerRandomHobbies)
                .uploadPicture(fakerGenerateData.fakerImage)
                .currentAddress(fakerGenerateData.fakerCurAddress)
                .scroll()
                .setState(fakerGenerateData.fakerState)
                .setCity(fakerGenerateData.fakerRandomCity)
                .clickSubmit()
                .checkResultTable("Student Name", fakerGenerateData.fakerFirstName + " " + fakerGenerateData.fakerLastName)
                .checkResultTable("Student Email", fakerGenerateData.fakerEmail)
                .checkResultTable("Gender", fakerGenerateData.fakerRandomGender)
                .checkResultTable("Mobile", fakerGenerateData.fakerPhoneNumber)
                .checkResultTable("Date of Birth", fakerGenerateData.fakerBirthDay + " " + fakerGenerateData.fakerBirthMonth + "," + fakerGenerateData.fakerBirthYear)
                .checkResultTable("Subjects", fakerGenerateData.fakerRandomSubjects)
                .checkResultTable("Hobbies", fakerGenerateData.fakerRandomHobbies)
                .checkResultTable("Picture", fakerGenerateData.fakerImage)
                .checkResultTable("Address", fakerGenerateData.fakerCurAddress)
                .checkResultTable("State and City", fakerGenerateData.fakerState + " " + fakerGenerateData.fakerRandomCity)
                .closeTable()
                ;
    }
}

