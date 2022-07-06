package Boot.FinalBootTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Boot.FinalBoot.ExpediaBoot;

public class ExpediaBootTest {
	
		WebDriver driver;
		 @Test
		public void Test() throws InterruptedException {
			ExpediaBoot obj=new ExpediaBoot(driver);
			obj.ClickFlights();
			Thread.sleep(5000);
			
		
			obj.LeavingFrom();
			obj.WhereLeg1("Washington");
			Thread.sleep(5000);
			obj.Leg1OriginSelection();
			
			
			obj.GoingTo();
			obj.WhereLeg2("Toronto");
			Thread.sleep(5000);
			obj.Leg2OriginSelection();
		
			Thread.sleep(2000);
			obj.Departing();
			
			obj.StartDate();
			Thread.sleep(2000);
			//obj.EndDate();
			obj.EndingtDate();
			Thread.sleep(2000);
			obj.DoneBut();
			obj.Travelers();
			Thread.sleep(2000);
			obj.Adults();
			obj.DoneTravellers();
			Thread.sleep(2000);
			obj.Search();
		}
	
		 @BeforeClass
		 public void beforeClass() {
		 	  
		 	  //enter the name of the desired browser in the argument
		 	  Browsers("chrome");	
		 }

	   @AfterClass

		 public void afterClass() {
		 	  driver.close();
		 }
		   
		   
		   public void Browsers(String window) {
		 		if(window.equalsIgnoreCase("Chrome")) {
		 			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\git\\repositorytoframework\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		 			driver=new ChromeDriver();
		 			driver.navigate().to("https://www.expedia.com/");
		 			driver.manage().window().maximize();
		 	
		 			
		 		}else if(window.equalsIgnoreCase("edge")){
		 			 System.setProperty("webdriver.edge.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
		 			 driver=new EdgeDriver();
		 			 driver.navigate().to("https://www.expedia.com/");
		 			 driver.manage().window().maximize();
		 		}else if(window.equalsIgnoreCase("Firefox")) {
		 			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
		 			driver=new FirefoxDriver();
		 			driver.navigate().to("https://www.expedia.com/");
		 			driver.manage().window().maximize();
		 		}
}
}
