package Steps;

import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import static Runners.RunnerBase.getDriver;

public class LoginSteps {

    LoginPage loginPage;

    @Before
    public void setUp() {
        loginPage = new LoginPage();
    }

    @Given("realize login no site da linx ecommerce com Sucesso")
    public void realizeLoginNoSiteSauceDemo() {
        getDriver().get("https://comercialomni.core.dcg.com.br/login?url=/painel-do-cliente/dados-cadastrais");
        loginPage.clicarAgreeUsage();
        loginPage.digitarEmail();
        loginPage.digitarSenha();
        loginPage.clicarBtnLogin();
    }
}
