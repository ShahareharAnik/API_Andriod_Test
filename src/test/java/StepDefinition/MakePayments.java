package StepDefinition;

import POM.AppElements;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class MakePayments {

     AndroidDriver  driver;
     AppElements elements;
    @Given("Click on make payment")
    public void clickOnMakePayment() throws InterruptedException {
       // driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
        elements = new AppElements(driver);
        elements.MakePayment();
    }

    @When("Input Phone {string}")
    public void inputPhoneNumber(String n) throws InterruptedException {
        elements = new AppElements(driver);
        elements.PhoneNumber(n);
    }

    @And("Input Receiver {string}")
    public void inputReceiverName(String n) throws InterruptedException {
        elements.Receiver(n);
    }

    @And("Input {string}")
    public void inputAmount(String a) throws InterruptedException {
        elements.Amount(a);
    }

    @And("Select {string}")
    public void selectCountry(String c) throws InterruptedException {
        elements.Where(c);
    }

    @Then("Send Payment")
    public void sendPayment() throws InterruptedException {
        elements.SendPayment();
    }

}
