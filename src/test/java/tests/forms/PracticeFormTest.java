package tests.forms;

import data.StudentData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.forms.PracticeFormPage;
import tests.TestBase;

public class PracticeFormTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }



    @Test
    public void enterPracticeForm(){
        new PracticeFormPage(driver).enterPersonalData(StudentData.FIRST_NAME,StudentData.LAST_NAME,StudentData.EMAIL,StudentData.PHONE)
               .selectGender(StudentData.GENDER).typeOfDate(StudentData.DATE)
                .addSubject(StudentData.SUBJECTS)
        .chooseHobby(StudentData.HOBBIES)
        .uploadFile(StudentData.PHOTO_PATH)
        .enterAdress(StudentData.ADRESS)
        .inputState(StudentData.STATE);

                //.chooseHobby(StudentData.HOBBIES);

               // .inputState(StudentData.STATE).inputCity(StudentData.CITY);
    }




}
