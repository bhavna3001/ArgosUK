package Argos.Base.Pages;

import Argos.Base.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMobile extends TestBase {

    /*@FindBy(xpath = "//a[@href='/browse/technology/c:29949/?clickOrigin=header:home:menu:technology'][contains(.,'Technology')]")
    WebElement technology;*/

    @FindBy(xpath = "//button[contains(.,'Add Bush 32 Inch Smart HD Ready TV to Trolley')]")
    WebElement BushTV;

   /* @FindBy(xpath = "//svg[@version='1.1']")
    WebElement click;*/

    @FindBy(xpath = "(//span[@class='argos-header__link-label'][contains(.,'Trolley')])[1]")
    WebElement trolley;

    @FindBy(xpath = "//a[@class='button button--full xs-hidden sm-block']")
    WebElement goToTrolley;

    public SearchMobile(){
        PageFactory.initElements(driver, this
        );
    }

    public void tvClick(){
        //technology.click();
        BushTV.click();
    }

    public void trolleyClick(){
        //click.click();


                driver.findElement(By.xpath("//a[@class='button button--full xs-hidden sm-block']")).click();






       // goToTrolley.click();
        //trolley.click();
    }

    public void mouseHover(){
        WebElement element = driver.findElement(By.xpath("//a[@href='/browse/technology/c:29949/?clickOrigin=header:home:menu:technology'][contains(.,'Technology')]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        WebElement subElement = driver.findElement(By.xpath("//a[contains(.,'Televisions')]"));
        action.moveToElement(subElement);
        action.click();
        action.perform();
    }



    public void scrollPageDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element= driver.findElement(By.xpath("//button[contains(.,'Add Bush 32 Inch Smart HD Ready TV to Trolley')]"));
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void scrollPageUp(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element= driver.findElement(By.xpath("(//span[contains(.,'Trolley')])[3]"));
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
        }





