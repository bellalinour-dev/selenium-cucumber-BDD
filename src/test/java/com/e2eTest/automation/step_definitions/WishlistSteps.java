package com.e2eTest.automation.step_definitions;


import com.e2eTest.automation.page_objects.WishlistPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;

import com.e2eTest.automation.utils.Validations;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistSteps {

	WishlistPage wishlist = new WishlistPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();


	@When("Je clique sur le bouton wishlist")
	public void jeCliqueSurLeBoutonWishlist() {
		actionsUtils.click(WishlistPage.getWishlistButton());
	}


	@Then("le message Wishlist suivant doit apparaitre Message1 {string}")
	public void leMessageWishlistSuivantDoitApparaitre(String Message1) {
		validations.assertEquals(WishlistPage.getWishlistVideResult(), Message1);
	}



	
	




} 