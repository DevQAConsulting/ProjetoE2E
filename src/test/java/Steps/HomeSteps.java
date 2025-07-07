package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Runners.RunnerBase.getDriver;

public class HomeSteps {


    HomePage homePage = new HomePage();

    @And("realizo a busca pelo produto {string}")
    public void aguardarListagemDeProdutos(String produto) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Eletrodomésticos", homePage.secaoPrincipalEletrodomesticos());
        homePage.digitarSearch(produto);
    }
}
