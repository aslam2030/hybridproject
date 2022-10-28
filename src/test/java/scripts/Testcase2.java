package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PomPages.PageModule1;
import PomPages.SkillraryDemoLogin1;
import PomPages.SkillraryLoginPage1;
import generallib.BaseClass1;

@Test
public class Testcase2 extends BaseClass1{
public void tcc2() throws IOException {
	SkillraryLoginPage1 s = new SkillraryLoginPage1(driver);
	s.gearsButton();
	s.SkillraryDemoApp();
	
	SkillraryDemoLogin1 sd= new SkillraryDemoLogin1(driver);
	driverutiles.switchTabs(driver);
	driverutiles.dropdown(sd.getCoursedd(),pdata.getData("coursedd"));
	
	PageModule1 pg = new PageModule1(driver);
	driverutiles.draganddrop(driver, pg.getSelenium(),pg.getCartarea());
	
	WebElement l = pg.getLinkedin();
	Point b = l.getLocation();
	int x = b.getX();
	int y = b.getY();
	
	
	
	driverutiles.scrollBar(driver, x, y);
	pg.linkedinicon();
	
	
	
	
}}