package pages;
import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SabukaruHomePage extends BaseTest{

    @FindBy(xpath = "//*[@id=\"collection-57825c4915d5db8fe566cc6f\"]/header/div[3]/nav/div/span/a")
    WebElement ArticlesIcon;


    public SabukaruHomePage(){
        PageFactory.initElements(driver, this);
    }
    public String getTitle(){
        return driver.getTitle();
    }
    //do the actual clicking
    public SabukaruArticlesPage click_on_the_Articles_Link() throws InterruptedException {
        ArticlesIcon.click();
        Thread.sleep(5000);
        return new SabukaruArticlesPage();
    }
    public String just_to_check_the_string(){
        return ArticlesIcon.getText();
    }

}
