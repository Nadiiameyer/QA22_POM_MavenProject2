package tests.bookStore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

public class SearchBookTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBookStoreApplication();
    }


    @Test
    public void serchBookPositiveTest(){
        new BookStorePage(driver).typeInSearchField("Git")
                .assertNameOfBook("Git");
    }
}
