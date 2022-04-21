package pages;

import base.BaseTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Constants;

public class SaburakuMangaAnimePage extends BaseTest {


    public SaburakuMangaAnimePage(){
        PageFactory.initElements(driver,this);
    }
    public String getTitle() {
        return driver.getTitle();
    }
}
