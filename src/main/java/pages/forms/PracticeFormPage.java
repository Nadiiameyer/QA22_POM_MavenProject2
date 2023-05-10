package pages.forms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class PracticeFormPage extends BasePage {
    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "firstName")
    WebElement fName;

@FindBy(id = "lastName")
WebElement lName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userNumber")
    WebElement userNumber;

    public PracticeFormPage enterPersonalData(String firstName, String lastName, String email, String phone) {
    type(fName, firstName);
    type(lName, lastName);
    type(userEmail, email);
    type(userNumber, phone);

        return this;
    }
    @FindBy(css = "[for='gender-radio-1']")
    WebElement male;
    @FindBy(css = "[for='gender-radio-1']")
    WebElement female;
    @FindBy(css = "[for='gender-radio-1']")
    WebElement other;

    public PracticeFormPage selectGender(String gender) {
        if (gender.equals("Male")){
            click(male);
        }else if (gender.equals("Female")) {
            click(female);
        } else {
            click(other);
        }
        return this;
    }
    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthInput;
    public PracticeFormPage typeOfDate(String date){
        click(dateOfBirthInput);

      String os = System.getProperty("os.name");
        System.out.println("My OS " + os);

        if (os.startsWith("Mac")){
            dateOfBirthInput.sendKeys(Keys.COMMAND,"a");
        } else {
            dateOfBirthInput.sendKeys(Keys.CONTROL,"a");
        }
        dateOfBirthInput.sendKeys(date);
        dateOfBirthInput.sendKeys(Keys.ENTER);
        return  this;
    }

@FindBy(id = "subjectsInput")
WebElement subjectsInput;

    public PracticeFormPage addSubject(String[] subjects) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                typeWithJSExecutor(subjectsInput, subjects[i], 0, 200);
                subjectsInput.sendKeys(Keys.ENTER);
            }

        }

        return this;
    }
    @FindBy(css = "[for=hobbies-checkbox-1]")
    WebElement sports;
    @FindBy(css = "[for=hobbies-checkbox-2]")
    WebElement reading;
    @FindBy(css = "[for=hobbies-checkbox-3]")
    WebElement music;

    public PracticeFormPage chooseHobby(String[] hobbies) {
        for (int i = 0; i < hobbies.length; i++) {
            if (hobbies[i].equals("Sports")){
                click(sports);
            }  if (hobbies[i].equals("Reading")) {
                click(reading);
            }if (hobbies[i].equals("Music")){
                click(music);
            }
        }
        return this;
    }
@FindBy(id = "uploadPicture")
WebElement uploadPicture;
    public PracticeFormPage uploadFile(String photoPath) {
        uploadPicture.sendKeys(photoPath);
        return this;
    }
    @FindBy(id = "currentAddress")
    WebElement currentAdress;

    public PracticeFormPage enterAdress(String adress){
        typeWithJSExecutor(currentAdress,adress,0,300);
        return this;
    }
    @FindBy(id = "state")
    WebElement stateContainer;
@FindBy(id = "react-select-3-input")
WebElement cityContainer;
    public PracticeFormPage inputState(String state) {
click(stateContainer);
cityInput.sendKeys(state);
cityInput.sendKeys(Keys.ENTER);
        return this;
    }

@FindBy(id = "city")
WebElement cityContainer;
@FindBy(id = "react-select-4-input")
WebElement cityInput;
    public PracticeFormPage inputCity(String city) {
click(cityContainer);
cityInput.sendKeys(city);
cityInput.sendKeys(Keys.ENTER);
        return this;
    }
}

