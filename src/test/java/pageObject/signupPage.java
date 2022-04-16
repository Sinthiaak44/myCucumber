package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signupPage extends setup {
    public signupPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        setup.driver= driver;
    }

    @FindBy(how =How.NAME, using = "firstName")
    public WebElement firstNameLocator;

    @FindBy(how =How.NAME, using = "lastName")
    public WebElement lastNameLocator;


    public void enterFirstName(String typeFirstName){

        firstNameLocator.sendKeys(typeFirstName);

    }









}
