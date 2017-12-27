package WebSite;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Calculator {
    public WebDriver webDriver;
    @FindBy(className = "calc-submit-warpper")
    WebElement SubmitCalc;
    @FindBy(xpath = "//div[@class='bootstrap-growl alert alert-danger']")
    WebElement FirstAlert;
    @FindBy(xpath = "//a [@href='/Calc']")
    WebElement GoToCalPage;
    @FindBy(id = "calc-delivery-body-from")
    WebElement CityFrom;
    @FindBy(id = "calc-delivery-body-to")
    WebElement CityTo;
    @FindBy(id = "calc-delivery-body-weight")
    WebElement Weightpackege;
    @FindBy(id = "calc-delivery-body-length")
    WebElement Lengthpackege;
    @FindBy(id = "calc-delivery-body-width")
    WebElement Widthpackege;
    @FindBy(id = "calc-delivery-body-height")
    WebElement Heightpackege;



    public Calculator(WebDriver driver) {
        webDriver = driver;
        PageFactory.initElements(webDriver,this);
    }
        public void SubmitCalc() {
        SubmitCalc.click();
    }

    public void FirstAlert() {

        Assert.assertEquals("×\nЗаполните необходимые поля",
                FirstAlert.getText());
    }
    public void GoToCalPage() {
        GoToCalPage.click();
    }

    public void CityFrom() {
        CityFrom.sendKeys("Москва");
    }



}