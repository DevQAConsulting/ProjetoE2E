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

    @FindBy(xpath = "//*[@id=\"cw2014807445_1\"]/div/nav/ul/li[3]/h3/a")
    private WebElement secaoPrincipalEletrodomesticos;

    @FindBy(css = "#top-search > div > form > div > input")
    private WebElement search;

    public String secaoPrincipalEletrodomesticos() {
        esperarElementoAparecer(secaoPrincipalEletrodomesticos);
        return secaoPrincipalEletrodomesticos.getText();
    }

    public void digitarSearch(String produto) throws InterruptedException {
        Thread.sleep(5000);
        digitar(search, produto);
        search.sendKeys(Keys.ENTER);
    }
}
