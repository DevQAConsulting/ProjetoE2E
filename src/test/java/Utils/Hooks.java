package Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import Runners.RunnerBase;

public class Hooks {

    @Before
    public void setUp() {
        RunnerBase.getDriver();
    }

    @After
    public void tearDown() {
        RunnerBase.quitDriver();
    }
}
