package Runners;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.UUID;

public class RunnerBase {

    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public class AppConfig {

        public static final String BASE_URL = "https://comercialomni.core.dcg.com.br";

        public static String getLoginUrl() {
            return BASE_URL + "/login?url=/painel-do-cliente/dados-cadastrais";
        }
    }

    public static WebDriver getDriver() {
        if (driverThreadLocal.get() == null) {
            driverThreadLocal.set(getDriverChrome());
        }
        return driverThreadLocal.get();
    }

    public static WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    public static WebDriver getDriverChrome() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("user-data-dir=/tmp/profile-" + UUID.randomUUID());

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        return driver;
    }

    public static void quitDriver() {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
    }

    public class Hooks {

        @Before
        public void setUp() {
        }

        @After
        public void tearDown() {
            RunnerBase.quitDriver();
        }
    }
}
