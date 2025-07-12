package Utils;


import Runners.RunnerBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils extends RunnerBase {

    public static void clicar(WebElement elemento) throws InterruptedException {
        Thread.sleep(3000);
        elemento.click();
    }

    public static void digitar(WebElement elemento, String texto) {
        esperarElementoAparecer(elemento);
        elemento.sendKeys(texto);
    }

    public static String obterTexto(WebElement elemento) {
        esperarElementoAparecer(elemento);
        return elemento.getText();
    }

    public static void esperarElementoAparecer(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(elemento));

    }

    public static void esperarElementoDesaparecer(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(elemento));

    }

    public static void selecionarComboBox(WebElement elemento, String texto) {
        esperarElementoAparecer(elemento);
        Select listaSuspensa = new Select(elemento);
        listaSuspensa.selectByVisibleText(texto);
    }

    public static void validarPopUp() throws InterruptedException {
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }
}
