package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObject.loginPage;

public class loginStep extends setup {

    loginPage lp = new loginPage(driver);





    @And("I enter valid email")
    public void iEnterValidEmail() {
        lp.enteremailAddress("sinthia@gmail.com");

    }

    @And("I enter valid password")
    public void iEnterValidPassword() {

        lp.enterpassword( "123456");
    }


    @When("I click on the login button")
    public void iClickOnTheLoginButton() {

        lp.clickLoginbutton();
    }


    @And("I enter invalid email")
    public void iEnterInvalidEmail() {
        lp.enteremailAddress("asdjmnpmlasd@");

    }

    @And("I enter invalid password")
    public void iEnterInvalidPassword() {

        lp.enterpassword("aoiksnjd");

    }

    @And("I enter email and password")
    public void iEnterEmailAndPassword() {
        lp.enteremailAddress("sinthia@gmail.com");
        lp.enterpassword("ijaubhefas");

    }
}


