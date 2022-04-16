package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends setup {
    public loginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        setup.driver= driver;
    }

    @FindBy(how =How.NAME, using = "email")
    public WebElement emailLocator;

    @FindBy(how =How.NAME, using = "password")
    public WebElement passwordLocator;

    @FindBy(how =How.CLASS_NAME, using = "my-login")
    public WebElement loginbuttonLocator;



    public void enteremailAddress(String emailtyped){

        emailLocator.sendKeys(emailtyped);

    }


    public void enterpassword (String passwordEntered){

        passwordLocator.sendKeys(passwordEntered);


    }

    public void clickLoginbutton (){

        loginbuttonLocator.click();
    }







}
