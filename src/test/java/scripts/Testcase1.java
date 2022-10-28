package scripts;

import org.testng.annotations.Test;

import PomPages.AddtocartPage1;
import PomPages.SkillraryDemoLogin1;
import PomPages.SkillraryLoginPage1;
import generallib.BaseClass1;

public class Testcase1 extends BaseClass1 {
	@Test

	public void tc1() {
		SkillraryLoginPage1 s = new SkillraryLoginPage1(driver);
		s.gearsButton();
		s.SkillraryDemoApp();
       
		SkillraryDemoLogin1 sd= new SkillraryDemoLogin1(driver);
		driverutiles.switchTabs(driver);
		driverutiles.mouseHover(driver,sd.getCoursetab());
		sd.selenium();
		
		AddtocartPage1 ad= new AddtocartPage1(driver);
		driverutiles.doubleClick(driver,ad.getAddbtn());
		ad.addtocartbutton();
		driverutiles.alertpopup(driver);
        
      
	}
}
