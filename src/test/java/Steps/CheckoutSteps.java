package Steps;

import Pages.CheckoutPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @And("realizo o processo para finalização de compra")
    public void realizoOProcessoParaFinalizacaoDeCompra() throws InterruptedException {
        checkoutPage.clicarBtnComprar();
        checkoutPage.clicarBtnFinalizarCompra();
        checkoutPage.clicarBtnContinuar();
        checkoutPage.clicarBtnPix();
        checkoutPage.clicarBtnFinalizarCompraPix();
        Assert.assertEquals("Pedido realizado com sucesso!", checkoutPage.msgSucessPix());
    }
}
