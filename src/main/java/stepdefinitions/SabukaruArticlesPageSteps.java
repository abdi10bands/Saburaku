package stepdefinitions;

import base.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.netty.util.Constant;
import org.junit.Assert;
import pages.SabukaruArticlesPage;
import pages.SabukaruHomePage;
import pages.SaburakuMangaAnimePage;
import utils.Constants;


public class SabukaruArticlesPageSteps extends BaseTest {
    SabukaruArticlesPage sabukaruArticlesPage = new SabukaruArticlesPage();
    SaburakuMangaAnimePage saburakuMangaAnimePage;
    SabukaruHomePage sabukaruHomePage;

    @Given("^I am on the above page$")
    public void i_am_on_the_above_page() throws InterruptedException {
        String URL = prop.getProperty("baseURL");
        driver.get(URL);
        sabukaruHomePage = new SabukaruHomePage();
        //call saburakuHome page to get to our article page
        sabukaruArticlesPage = sabukaruHomePage.click_on_the_Articles_Link();
        //call sabarauku Articles page to go ManagaAnimePage;
        saburakuMangaAnimePage = sabukaruArticlesPage.gotoSaburakuMangaAnimePage();
        String expectedURL = driver.getCurrentUrl();
        Assert.assertTrue(expectedURL.equalsIgnoreCase(Constants.MANGAANIME_PAGE_URL));
       // Assert.assertEquals(expectedTitle,saburakuMangaAnimePage.getTitle());
    }

}
