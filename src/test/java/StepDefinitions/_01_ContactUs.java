package StepDefinitions;

import Pages.DialogContent;
import Utilities.MyMethods2;
import Utilities.ParameterDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

public class _01_ContactUs {
    DialogContent dialogContent = new DialogContent();

    @Given("Navigate to Exercise page")
    public void navigateToExercisePage() {
        ParameterDriver.getDriver().get("https://www.automationexercise.com/");
    }

    @And("Click on the Contact Us Button")
    public void clickOnTheContactUsButton() {
        dialogContent.clickMethod(dialogContent.contactUs);
    }

    @And("Fill the Form with this Data")
    public void fillTheFormWithThisData(DataTable dataTable) {
        var rows = dataTable.asMaps(String.class, String.class); // java 11

        for(Map<String, String> row: rows){
            dialogContent.sendKeysMethod(dialogContent.nameInput, row.get("name"));
            dialogContent.sendKeysMethod(dialogContent.emailInput, row.get("email"));
            dialogContent.sendKeysMethod(dialogContent.subjectInput, row.get("subject"));
            dialogContent.sendKeysMethod(dialogContent.messageInput, row.get("message"));
        }
        System.out.println("scenario called");
        MyMethods2.myWait(4);
    }

    @And("Click Submit Button")
    public void clickSubmitButton() {
        //        page.clickMethod(page.submitButton);
    }

    @Then("Verify Form is submitted")
    public void verifyFormIsSubmitted() {
        System.out.println("Done");
    }
}
