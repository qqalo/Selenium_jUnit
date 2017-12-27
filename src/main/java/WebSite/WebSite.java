package WebSite;


import org.openqa.selenium.WebDriver;

public class WebSite {
    WebDriver webDriver;
    public WebSite(WebDriver driver){
        webDriver = driver;

    }
    public RegisterUser RegisterUser() { return new RegisterUser(webDriver);}
    public UserLogin UserLogin() { return new UserLogin(webDriver);}
    public Calculator Calculator() { return new Calculator(webDriver);}



}
