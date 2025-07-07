package Steps;

import Pages.CheckoutPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @And("realizo o processo para finalização de compra")
    public void realizoOProcessoParaFinalizacaoDeCompra() throws InterruptedException {
        checkoutPage.clicarBtnComprar();
        checkoutPage.clicarBtnSacola();
        checkoutPage.clicarBtnFinalizarComprar();
        checkoutPage.clicarBtnContinuar();
        checkoutPage.clicarBtnPix();
    }
}
