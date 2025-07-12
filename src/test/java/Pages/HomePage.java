package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class HomePage extends RunCucumberTest {

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "#top-search > div > form > div > input")
    private WebElement search;

    public void digitarSearch(String produto) throws InterruptedException {
        digitar(search, produto);
        search.sendKeys(Keys.ENTER);
    }
}
