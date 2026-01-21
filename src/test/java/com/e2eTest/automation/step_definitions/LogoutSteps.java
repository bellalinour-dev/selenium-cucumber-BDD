package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LogoutPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	
	LogoutPage logoutPage = new LogoutPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();
	
	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
	actionsUtils.click(LogoutPage.getLogoutButton());
	}
	
	
	@Then("Je me redirige vers la page home login {string}")
	public void jeMeRedirigeVersLaPageHomeLogin(String login) {
		validations.assertEquals(LogoutPage.getLoginPage(), login);
	}



}