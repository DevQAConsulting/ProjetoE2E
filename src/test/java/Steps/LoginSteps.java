package Steps;

import Pages.LoginPage;
import Runners.RunnerBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Runners.RunnerBase.getDriver;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("realize login no site da linx ecommerce com Sucesso")
    public void realizeLoginNoSiteSauceDemo() throws InterruptedException {
        getDriver().get(RunnerBase.AppConfig.getLoginUrl());
        loginPage.clicarAgreeUsage();
        loginPage.digitarEmail();
        loginPage.digitarSenha();
        loginPage.clicarBtnLogin();

    }

    @Given("que o usuario tente realizar login passando a senha invalida")
    public void tentativaDeLoginComSenhaIncorreta() throws InterruptedException {
        getDriver().get(RunnerBase.AppConfig.getLoginUrl());
        loginPage.clicarAgreeUsage();
        loginPage.digitarEmail();
        loginPage.digitarSenhaInvalida();
        loginPage.clicarBtnLogin();
    }

    @When("o modal de carregar")
    public void oModalDeCarregar() {
        loginPage.esperarModalLoginCarregar();
    }

    @Then("a mensagem de erro deve ser {string}")
    public void aMensagemDeErroDeveSer(String textoDoModal) throws InterruptedException {
        Assert.assertEquals(textoDoModal, loginPage.obterTextoDoModal());
    }
}
