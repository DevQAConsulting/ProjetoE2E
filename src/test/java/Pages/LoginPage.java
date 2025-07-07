package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class LoginPage extends RunCucumberTest {

    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='jasoucliente']//input[@id='widget75-email']")
    private WebElement txtEmail;

    @FindBy(xpath = "//*[@id='jasoucliente']//input[@id='widget75-password']")
    private WebElement txtSenha;

    @FindBy(xpath = "//*[@id='jasoucliente']//button[@id='widget75-submit']")
    private WebElement btnLogin;

    @FindBy(id = "agreeUsage")
    private WebElement agreeUsage;

    public void digitarEmail() {
        digitar(txtEmail, "cursouniversidadeqa@gmail.com");
    }

    public void digitarSenha() {
        digitar(txtSenha, "Teste123");
    }

    public void clicarAgreeUsage() {
        clicar(agreeUsage);
    }

    public void clicarBtnLogin() {
        clicar(btnLogin);
    }
}
