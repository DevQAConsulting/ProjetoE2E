package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.*;

public class CheckoutPage extends RunCucumberTest {

    public CheckoutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "#content-wrapper > div.basket-content > div.wd-checkout-basket.wd-widget.wd-widget-js > div.row.grid.no-gutters > div.col.col-12.col-lg-4.summary > div.bottom > div > button.bt-checkout.btn-big.btn-buy")
    private WebElement btnFinalizarComprar;

    @FindBy(css = "#summary > div > div:nth-child(5) > a")
    private WebElement btnContinuar;

    @FindBy(css = "#form-checkout > div > div.checkout-step.methods > div > div > div > div:nth-child(3) > a")
    private WebElement btnPix;

    @FindBy(xpath = "//*[@title='Comprar'][@class='btn-buy']")
    private WebElement btnComprar;

    @FindBy(id = "form-checkout-submit")
    private WebElement btnFinalizarComprarPix;

    @FindBy(css = "#form-checkout > div > div.checkout-step.confirmation > div.confirmation-wrapper.PIX > div.confirmation-header-color > h2 > span")
    private WebElement msgSucessPix;

    public void clicarBtnFinalizarCompra() throws InterruptedException {
        clicar(btnFinalizarComprar);
    }

    public void clicarBtnFinalizarCompraPix() throws InterruptedException {
        clicar(btnFinalizarComprarPix);
    }

    public void clicarBtnContinuar() throws InterruptedException {
        clicar(btnContinuar);
    }

    public void clicarBtnPix() throws InterruptedException {
        clicar(btnPix);
    }

    public void clicarBtnComprar() throws InterruptedException {
        clicar(btnComprar);
    }

    public String msgSucessPix() throws InterruptedException {
        Thread.sleep(3000);
        return msgSucessPix.getText();
    }
}
