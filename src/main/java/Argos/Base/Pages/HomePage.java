package Argos.Base.Pages;

import Argos.Base.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @FindBy(xpath = "//a[contains(.,'Sign in / join')]")
    WebElement signIn;


    @FindBy(xpath = "//a[@href='#'][contains(.,'Got it')]")
    WebElement privacy;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }


    public void clickGotIt(){
        privacy.click();
    }

    public void signInClick(){
        signIn.click();
    }
}
