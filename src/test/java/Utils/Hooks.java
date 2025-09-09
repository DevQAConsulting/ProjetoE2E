package Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Runners.RunnerBase;

public class Hooks {

    @Before
    public void setUp() {
        RunnerBase.getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Cenário falhou: " + scenario.getName());

        }

        RunnerBase.quitDriver();
    }
}
