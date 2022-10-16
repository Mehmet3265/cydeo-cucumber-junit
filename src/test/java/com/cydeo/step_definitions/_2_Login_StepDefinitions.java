package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _2_Login_StepDefinitions {
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
        //TODO:FİX THİS LATER
        //İF ı NEED TO FİX  THE BUG LATER   ı can put t o d o to remind me later
    }
    @When("user enters student username")
    public void user_enters_student_username() {
       //I dont have to write anything to this line
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters username");
    }
    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user eters password");
    }


    @Given("user is on library login page")
    public void user_is_on_library_login_page() {
        System.out.println("user is on the library page");

    }
}

