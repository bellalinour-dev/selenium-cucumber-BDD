 package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class WishlistPage extends BasePage {

	
	@FindBy(how = How.CSS, using = "a[class='ico-wishlist'] span[class='cart-label']")
    private static WebElement wishlistButton;
	
	@FindBy(how = How.CSS, using = "div[class='page-title'] h1")
    private static WebElement wishlist;

	@FindBy(how = How.CSS , using = ".wishlist-content")
	private static WebElement wishlistVideResult ;
	
	public WishlistPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getWishlistButton() {
		return wishlistButton;
	}
	
	public static WebElement getWishlist() {
		return wishlist;
	}
	
	public static WebElement getWishlistVideResult() {
		return wishlistVideResult;
	}
}