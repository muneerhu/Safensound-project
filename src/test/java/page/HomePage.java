package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@title='Search']")
    public WebElement inputField;

    @FindBy(xpath = "//input[@class='gNO89b']")
    public WebElement searchBtn;

    @FindBy(xpath = "//cite[text()='www.safensound.io']")
    public WebElement link;

    public void searchFor(String text) {
        inputField.sendKeys(text);
    }


}
