package Steps;

import Data.UsuarioPadrao;
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
    public void realizeLoginNoSiteComSucesso() {
        getDriver().get(RunnerBase.AppConfig.getLoginUrl());
        loginPage.realizarLogin(UsuarioPadrao.USUARIO_VALIDO, UsuarioPadrao.SENHA_VALIDA);
    }

    @Given("que o usuario tente realizar login passando a senha invalida")
    public void tentativaDeLoginComSenhaIncorreta() throws InterruptedException {
        getDriver().get(RunnerBase.AppConfig.getLoginUrl());
        loginPage.clicarAgreeUsage();
        loginPage.realizarLogin(UsuarioPadrao.USUARIO_VALIDO, UsuarioPadrao.SENHA_INVALIDA);
    }

    @When("o modal de carregar")
    public void oModalDeCarregar() {
        // Aqui você precisa ter um método na LoginPage para esperar o modal
        loginPage.esperarModalLoginCarregar(); // certifique-se de que esse método existe
    }

    @Then("a mensagem de erro deve ser {string}")
    public void aMensagemDeErroDeveSer(String textoDoModal) {
        Assert.assertEquals(textoDoModal, loginPage.obterTextoDoModal()); // idem: esse método deve existir na page
    }
}
