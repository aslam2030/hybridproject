package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage1 {

	
	@FindBy(xpath=" //a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	
	@FindBy(xpath=" (//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement  demoapp;
	
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath ="//input[@value='go']")
	private WebElement searchbtn;
	
	public SkillraryLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void gearsButton() {
		gearsbtn.click();
	}
	public void SkillraryDemoApp() {
		demoapp.click();
	}
	
	
	public void searchtb(String name) {
		searchtb.sendKeys(name);
	}
	public void searchbtn() {
		searchbtn.click();
	}
}
