package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.pegarTexto;

public class CheckoutPage extends RunCucumberTest {

    public CheckoutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "#header > div.main-bar > div > div > div.icons-resume.col.col-lg-4.col-3.order-lg-12 > div > div.col-lg-4.col.basket > a")
    private WebElement btnSacola;

    @FindBy(css = "#content-wrapper > div.basket-content > div.wd-checkout-basket.wd-widget.wd-widget-js > div.row.grid.no-gutters > div.col.col-12.col-lg-4.summary > div.bottom > div > button.bt-checkout.btn-big.btn-buy")
    private WebElement btnFinalizarComprar;

    @FindBy(css = "#summary > div > div:nth-child(5) > a")
    private WebElement btnContinuar;

    @FindBy(css = "#form-checkout > div > div.checkout-step.methods > div > div > div > div:nth-child(3) > a")
    private WebElement btnPix;

    @FindBy(xpath = "//*[@title='Comprar'][@class='btn-buy']")
    private WebElement btnComprar;

    public void clicarBtnSacola() throws InterruptedException {
        Thread.sleep(5000);
        getDriver().navigate().refresh();
        clicar(btnSacola);
    }

    public void clicarBtnFinalizarComprar() {
        clicar(btnFinalizarComprar);
    }

    public void clicarBtnContinuar() throws InterruptedException {
        clicar(btnContinuar);
        Thread.sleep(5000);
        getDriver().navigate().refresh();
        Thread.sleep(5000);
        clicar(btnContinuar);
    }

    public void clicarBtnPix() {
        getDriver().navigate().refresh();
        clicar(btnPix);
        getDriver().navigate().refresh();
    }

    public void clicarBtnComprar() throws InterruptedException {
        clicar(btnComprar);
        getDriver().navigate().refresh();
        Thread.sleep(5000);
        clicar(btnComprar);
    }
}
