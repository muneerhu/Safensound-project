package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.Base;

import java.util.concurrent.TimeUnit;

public class Hooks {
    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        Base base = Base.initiatePages();
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        Driver.closeDriver();
    }
}
