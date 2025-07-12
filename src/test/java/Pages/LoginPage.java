package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

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

    @FindBy(css = "#mainModal > div")
    private WebElement modalLoginIncorreto;

    @FindBy(css = "#mainModal > div > div.input-wrapper > span")
    private WebElement modal;

    public void digitarEmail() {
        digitar(txtEmail, "cursouniversidadeqa@gmail.com");
    }

    public void digitarSenha() {
        digitar(txtSenha, "Teste123");
    }

    public void digitarSenhaInvalida() {
        digitar(txtSenha, "Teste1234");
    }

    public void clicarAgreeUsage() throws InterruptedException {
        clicar(agreeUsage);
    }

    public void clicarBtnLogin() throws InterruptedException {
        clicar(btnLogin);
    }

    public void esperarModalLoginCarregar() {
        esperarElementoAparecer(modalLoginIncorreto);
    }

    public String obterTextoDoModal() throws InterruptedException {
        return obterTexto(modal);
    }
}
