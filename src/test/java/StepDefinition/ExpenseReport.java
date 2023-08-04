package StepDefinition;

import POM.AppElements;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExpenseReport {
    AndroidDriver driver;
    AppElements elementts;
    @Given("Click on Expense Report")
    public void clickOnExpenseReport() throws InterruptedException {
        elementts = new AppElements(driver);
        elementts.Expense();
    }

    @When("Add report abd Back")
    public void addReportAbdBack() throws InterruptedException {
        elementts = new AppElements(driver);
        elementts.ADDandBack();
    }

    @Then("Logout")
    public void logout() throws InterruptedException {
        elementts.Logout();
        System.out.println("....................LogOut.................................................");
    }
}
