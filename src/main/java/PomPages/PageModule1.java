package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageModule1 {

	@FindBy(id="Selenium Training")
	private WebElement selenium;
	
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class='fa fa-linkedin'])[2]")
	private WebElement linkedin;
	
	public PageModule1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSelenium() {
		return selenium;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getLinkedin() {
		return linkedin;
	}

     public void linkedinicon() {
    	 linkedin.click();
     }

}


