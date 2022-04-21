package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Constants;

import java.util.concurrent.TimeUnit;

public class SabukaruArticlesPage extends BaseTest {

    @FindBy(xpath = "//*[@id=\"collection-57825c4915d5db8fe566cc6f\"]/header/div[3]/nav/div/span/span/a[4]")
    WebElement MangaAnimeIcon;

    public SabukaruArticlesPage(){
        PageFactory.initElements(driver,this);
    }
    public String getTitle(){
        return driver.getTitle();
    }
    public SaburakuMangaAnimePage gotoSaburakuMangaAnimePage() throws InterruptedException {
        MangaAnimeIcon.click();
        Thread.sleep(5000);
        return new SaburakuMangaAnimePage();
    }





}
