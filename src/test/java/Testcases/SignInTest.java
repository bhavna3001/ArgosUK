package Testcases;

import Argos.Base.Base.TestBase;
import Argos.Base.Pages.HomePage;
import Argos.Base.Pages.LoginPage;
import Argos.Base.Pages.SearchMobile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    SearchMobile searchMobile;
    public SignInTest()
    {
            super();
    }


    @BeforeMethod
    public void setUp(){
        initialisation();
      homePage = new HomePage();
      loginPage= new LoginPage();
      searchMobile= new SearchMobile();
    }



    @Test
    public void signInTest(){
        homePage.clickGotIt();
        //homePage.signInClick();
        //loginPage.loginClick();
         searchMobile.mouseHover();
         searchMobile.scrollPageDown();
         searchMobile.tvClick();
         //searchMobile.scrollPageUp();
         searchMobile.trolleyClick();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    }

