package StepDefinition;

import POM.AppElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MortgageRequest {
    AndroidDriver driver;
    AppElements element;
    @Given("Click on Mortgage")
    public void clickOnMortgage() throws InterruptedException {
        element = new AppElements(driver);
        element.Mortgage();

    }

    @When("Enter {string} and {string}")
    public void enterFirstNameAndLastName(String F,String L) throws InterruptedException {
        element = new AppElements(driver);
        element.Names(F,L);
    }

    @And("Enter {string}")
    public void enterAge(String n) throws InterruptedException {
        element.Age(n);
    }


    @And("Enter {string} with {string}")
    public void enterAddressesWithAddressess(String a, String b) throws InterruptedException {
        element.Address(a,b);
    }

    @And("Selections {string} and go next")
    public void selectionsCountriesAndGoNext(String c) throws InterruptedException {
        element.Cntrs(c);
    }

    @And("Type of loan and years and Occupations and MonthlyIncome")
    public void typeOfLoanAndYearsAndOccupationsAndMonthlyIncome() throws InterruptedException {
        element.info();
    }

    @Then("Click Save")
    public void clickSave() {
        element.save();
    }


}
