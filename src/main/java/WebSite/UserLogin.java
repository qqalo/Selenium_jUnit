package WebSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogin {
    public WebDriver webDriver;

    @FindBy(xpath = "//a [@href='/Account/Login']")
    WebElement GoToLoginPage;

    @FindBy(xpath = "//input [@class='lgUserName form-control']")
    WebElement SetUserName;

    @FindBy(xpath = "//input [@class='lgPassword form-control']")
    WebElement SetUserPass;

    @FindBy(xpath = "//input [@class='/Account/Login']")
    WebElement PressLogin;

    public UserLogin(WebDriver driver) {
        webDriver = driver;
        //wait = new WebDriverWait(webDriver,30);
        PageFactory.initElements(webDriver, this);
    }

    public void GoToLoginPage() {
        GoToLoginPage.click();
    }

    public void SetUserName() {
       SetUserName.sendKeys("g.lushkoalina@gmail.com");
    }

    public void SetUserPass() {
        SetUserPass.sendKeys("123456");
    }

    public void PressLogin() {
        PressLogin.click();
    }
}
