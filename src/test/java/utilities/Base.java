package utilities;

import org.openqa.selenium.support.PageFactory;
import page.HomePage;
import test.Driver;
import test.Hooks;

public class Base extends Hooks {
    protected static HomePage homePage;

    public static Base initiatePages(){
        homePage = PageFactory.initElements(Driver.getDriver(), HomePage.class);
        return new Base();
    }
}
