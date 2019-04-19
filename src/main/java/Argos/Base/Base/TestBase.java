package Argos.Base.Base;

import Argos.Base.Util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {


    public  static WebDriver driver;
    public static Properties prop;

     public  TestBase(){

         try {

             prop=new Properties();
             String Sel_Path = "C:\\Users\\Bhavna PC\\IdeaProjects\\ArgosUK\\src\\main\\java\\Argos\\Base\\Properties\\Configprop";
             if(System.getProperty(Sel_Path) == null){
                 System.out.println("Null!");
             }
             FileInputStream fis=new FileInputStream(Sel_Path);
             prop.load(fis);
             System.out.println(prop);
         }

         catch(Exception e)
         {
             e.printStackTrace();
         }

     }

     public void  initialisation(){



         String browserName=prop.getProperty("browser");
         System.out.println("here");
         if(browserName.equals("chrome"))
         { System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavna PC\\IdeaProjects\\ArgosUK\\chromedriver.exe");
             ChromeOptions options = new ChromeOptions();
             //options.addArguments("--headless");
            driver=new ChromeDriver(options);
             System.out.println("here 2");
             DesiredCapabilities capabilities = DesiredCapabilities.chrome();
             capabilities.setCapability(ChromeOptions.CAPABILITY, options);

             System.out.println("here 3");


         }
         else if(browserName.equals("firefox"))
         {
             System.setProperty("webdriver.gecko.driver","C:\\Users\\Bhavna PC\\Documents\\IdeaProjects\\ArgosUK\\geckodriver.exe");
             driver=new FirefoxDriver();

         }
         System.out.println("after");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
         System.out.println("before get url");
         driver.get(prop.getProperty("url"));

     }
}
