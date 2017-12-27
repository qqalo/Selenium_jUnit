package WebSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterUser {
    public WebDriver webDriver;

    @FindBy(xpath = "//a [@href='/Account/Register']")
    WebElement RegPage;
    @FindBy(id = "user-fullname")
    WebElement SendFIO;
    @FindBy(id = "user-email")
    WebElement Email;
    @FindBy(id = "user-psw")
    WebElement Pass;
    @FindBy(id = "user-psw-confirm")
    WebElement PassConfirm;
    @FindBy(xpath = "//div[@id='register-user']//button")
    WebElement ClickReg;
    public RegisterUser(WebDriver driver) {
        webDriver = driver;
        //wait = new WebDriverWait(webDriver,30);
        PageFactory.initElements(webDriver,this);
    }

    public void RegPage() {
        RegPage.click();
    }

    public void SendFIO() {

        SendFIO.sendKeys("Иванов Иван Иванович");
    }

    public void Email() {

        Email.sendKeys("Qweqwe1233@mail.ru");
    }
    public void Pass() {
        Pass.sendKeys("123456");
    }

    public void PassConfirm() {
        PassConfirm.sendKeys("123456");
    }

    public void ClickReg() {
        ClickReg.click();
    }

}