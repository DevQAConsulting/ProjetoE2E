package Elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElements {

    @FindBy(xpath = "//*[@id='jasoucliente']//input[@id='widget75-email']")
    public WebElement txtEmail;

    @FindBy(xpath = "//*[@id='jasoucliente']//input[@id='widget75-password']")
    public WebElement txtSenha;

    @FindBy(xpath = "//*[@id='jasoucliente']//button[@id='widget75-submit']")
    public WebElement btnLogin;

    @FindBy(id = "agreeUsage")
    public WebElement agreeUsage;

    @FindBy(css = "#mainModal > div")
    public WebElement modalLoginIncorreto;

    @FindBy(css = "#mainModal > div > div.input-wrapper > span")
    public WebElement modal;
}
