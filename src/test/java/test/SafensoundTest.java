package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import utilities.Base;

/**
 * @Author Muneer
 * January 8, 2021
 * google test search Space labs
 * TestNG framework
 */

public class SafensoundTest extends Base{
    @Test(description = "Verify that link 'safensound.io' exists")
    public void test01() {
        homePage.inputField.click();
        homePage.searchFor("spacelabs safensound");
        homePage.searchBtn.click();

        //Assert  homepage is displayed
        Assert.assertTrue(homePage.link.isDisplayed());
    }
}
