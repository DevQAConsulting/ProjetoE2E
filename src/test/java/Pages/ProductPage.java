package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.selecionarComboBox;

public class ProductPage extends RunCucumberTest {

    public ProductPage() {
        PageFactory.initElements(getDriver(), this);
    }

}
