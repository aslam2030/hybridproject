package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbt;

    @FindBy(xpath="//div[@class='pause-icon']")
    private WebElement pausebt;
    
    @FindBy(xpath="//span[text()='Add To Wishlist']")
    private WebElement addtowishlistbt;
    
    public WishlistPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    public void playbt() {
    	playbt.click();
    }
    public void pausebt() {
    	pausebt.click();
    }
    public void addtowishlistbutton() {
    	addtowishlistbt.click();
    }
}
 
