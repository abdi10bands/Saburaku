package stepdefinitions;

import base.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.SabukaruHomePage;
import pages.SabukaruArticlesPage;
import utils.Constants;

public class SabukaruHomePageSteps extends BaseTest {
    @Before
    public void openBrowser(){
        BaseTest.setupBrowser();
    }

    @After
    public void closeBrowser(){
        driver.close();
    }
    SabukaruHomePage sabukaruHomePage;
    SabukaruArticlesPage sabukaruMangaAnimePage;

    @Given("^I am on the sabukaru.com page$")
    public void i_am_on_the_saburaku_com_page(){
        String URL = prop.getProperty("baseURL");
        driver.get(URL);
        sabukaruHomePage = new SabukaruHomePage();

        String expectedTitle = Constants.SABURAKU_HOMEPAGE_TITLE;

        Assert.assertEquals(expectedTitle,sabukaruHomePage.getTitle());
    }
    @When("^I click on Articles$")
    public void i_click_on_the_MangaAnime_Part_in_Articles() throws InterruptedException {
        System.out.println(sabukaruHomePage.just_to_check_the_string());
        sabukaruMangaAnimePage = sabukaruHomePage.click_on_the_Articles_Link();


        //sabukaruMangaAnimePage = sabukaruHomePage.click_on_the_Manga_Anime_Link();
        //String strUrl = driver.getCurrentUrl();
        //Assert.assertTrue(strUrl.equalsIgnoreCase(Constants.MANGA_ANIME_PAGE_URL));

    }
    @Then("^I should find myself in the sabukaru articles Page$")
    public void i_am_on_the_articles_page(){
        String strUrl = driver.getCurrentUrl();
        Assert.assertTrue(strUrl.equalsIgnoreCase(Constants.ARTICLES_PAGE_URL));
    }
}
