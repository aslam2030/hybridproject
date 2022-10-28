package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.CoreJavaPage1;
import PomPages.SkillraryLoginPage1;
import PomPages.WishlistPage;
import generallib.BaseClass1;

public class Testclass3 extends BaseClass1{
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage1 s1= new SkillraryLoginPage1(driver);
		s1.searchtb(pdata.getData("search"));
		s1.searchbtn();
		
		CoreJavaPage1 c1= new CoreJavaPage1(driver);
		c1.corejavacourse();
			
		WishlistPage w1= new WishlistPage(driver);
		driverutiles.switchFrame(driver);
		w1.playbt();
		Thread.sleep(5000);
		w1.pausebt();
		driverutiles.switchBack(driver);
		w1.addtowishlistbutton();
	}

	
}
