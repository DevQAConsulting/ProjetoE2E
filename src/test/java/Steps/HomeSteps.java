package Steps;

import Pages.HomePage;
import io.cucumber.java.en.And;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @And("realizo a busca pelo produto {string}")
    public void aguardarListagemDeProdutos(String produto) throws InterruptedException {
        Thread.sleep(2000);
        homePage.digitarSearch(produto);
    }
}
