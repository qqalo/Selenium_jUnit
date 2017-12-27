package WebSite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    WebSite website;
    WebDriver webDriver;
    @Before
    public void setUP ()
    {
       webDriver = new ChromeDriver();
       website = new WebSite(webDriver);
       webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       System.setProperty("webdriver.chrome.driver", "E:\\Intelej\\chromedriver.exe");
    }
    @Test
    public void Test1() throws Exception {
        MailSender mailSender;
        mailSender = new MailSender();
        try

        {
            webDriver.get("http://unipost.su/");
            website.RegisterUser().RegPage();
            website.RegisterUser().SendFIO();
            website.RegisterUser().Email();
            website.RegisterUser().Pass();
            website.RegisterUser().PassConfirm();
            website.RegisterUser().ClickReg();
        }
        catch (WebDriverException e) {
            mailSender.main("Need to check test#1");
        }
    }
//       mailSender.main( "Test#2");      // Assert.assertEquals("Введите пароль", webDriver.findElement(By.cssSelector("div.dEOOab.RxsGPe")).getText());
//        Assert.assertEquals("Добро пожаловать!", webDriver.findElement(By.className("sfYUmb")).getText());
      //  assertEquals("Google.com.ua предлагается на: українська", webDriver.findElement(By.id("_eEe")).getText());
 //   }

    @Test
     public void Test2() throws Exception {
                  MailSender mailSender;
                  mailSender = new MailSender();
        try{
            webDriver.get("http://unipost.su/");
            website.UserLogin().GoToLoginPage();
            website.UserLogin().SetUserName();
            website.UserLogin().SetUserPass();
            website.UserLogin().PressLogin();

        }
        catch (WebDriverException e)
        {
            mailSender.main( "Need to check test#2");
        }

    }
       /////////
//    @After
//    public void tearDown() {
//       if (webDriver != null)
//           webDriver.quit();
//    }
}