package Argos.Base.Pages;

import Argos.Base.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[contains(@type,'email')]")
    WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//button[contains(.,'Sign in securely')]")
    WebElement signInbutton;

     public  LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void loginClick(){
        username.sendKeys(prop.getProperty("username"));
        password.sendKeys(prop.getProperty("pwd"));
        signInbutton.click();
    }

}
