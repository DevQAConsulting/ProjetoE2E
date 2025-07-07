package Runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.UUID;

public class RunnerBase {

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = getDriverChrome();
        }
        return driver;
    }

    public static WebDriver getDriverChrome() {
        ChromeOptions options = new ChromeOptions();

        // Headless moderno — ideal para CI/CD
        options.addArguments("--headless=new");

        // Evita problemas comuns no ambiente Linux do GitHub Actions
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Evita conflito de sessões com diretório de perfil duplicado
        options.addArguments("user-data-dir=/tmp/profile-" + UUID.randomUUID());

        // Incognito + janela maximizada (opcional, útil para cenários visuais)
       // options.addArguments("incognito");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        return driver;
    }
}
