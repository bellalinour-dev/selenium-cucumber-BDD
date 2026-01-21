package com.e2eTest.automation.step_definitions;


import org.openqa.selenium.WebElement;

import com.e2eTest.automation.page_objects.NewsletterPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.WaitUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsletterSteps {

	NewsletterPage newsletter = new NewsletterPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();
	WaitUtils waitUtils = new WaitUtils(Setup.getDriver());

	@When("Je saisis une adresse mail valide")
	public void jeSaisisUneAdresseMailValide() {
		actionsUtils.writeText(NewsletterPage.getNewLetterPageField(), configFileReader.getProperty("home.email"));
	}

	@When("clique sur Subscribe")
	public void cliqueSurSubscribe() {
		actionsUtils.click(NewsletterPage.getSubsribeButton());
	}

	@Then("le message suivant doit apparaitre Message {string}")
	public void leMessageSuivantDoitApparaitre(String Message) throws InterruptedException {
		Thread.sleep(3000);
		validations.assertEquals(
			    NewsletterPage.getSubsribeResult(),
			    Message
			);
	}

	@When("Je saisis une adresse mail invalide mail {string}")
	public void jeSaisisUneAdresseMailInvalideMail(String mail) {
		actionsUtils.writeText(NewsletterPage.getNewLetterPageField(), mail);

	}

	@Then("le message Newsletter suivant doit apparaitre Message1 {string}")
	public void leMessageNewsletterSuivantDoitApparaitreMessage1(String Message1) throws InterruptedException {
		 WebElement message = waitUtils.waitForElementToBeVisible(
			        NewsletterPage.getSubsribeResult(),
			        5
			    );

			    validations.assertEquals(message, Message1);
			}

	}

