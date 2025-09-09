package Pages;

import Elementos.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static Utils.Utils.*;

public class LoginPage {

    private WebDriver driver;
    private LoginElements el;

    public LoginPage() {
        this.driver = getDriver(); // usando método utilitário para obter o driver
        el = new LoginElements();
        PageFactory.initElements(driver, el);
    }

    public void digitarUsuario(String usuario) {
        el.txtEmail.sendKeys(usuario);
    }

    public void digitarSenha(String senha) {
        el.txtSenha.sendKeys(senha);
    }

    public void clicarBotaoLogin() {
        el.btnLogin.click();
    }

    public boolean validarLogin() {
        return el.modalLoginIncorreto.isDisplayed();
    }

    public void realizarLogin(String usuario, String senha) {
        digitarUsuario(usuario);
        digitarSenha(senha);
        clicarBotaoLogin();
    }


    public void clicarAgreeUsage() throws InterruptedException {
        clicar(el.agreeUsage);
    }

    public void clicarBtnLogin() throws InterruptedException {
        clicar(el.btnLogin);
    }

    public void esperarModalLoginCarregar() {
        esperarElementoAparecer(el.modalLoginIncorreto);
    }

    public String obterTextoDoModal() {
        return obterTexto(el.modal);
    }
}
