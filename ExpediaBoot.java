package Boot.FinalBoot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaBoot {
WebDriver driver;

//POM :Create separate class for each page of the application
//1.locate Elements using @Find
//2.Create the page factory constructor
//3.create methods according to the action for each element

//ii.	Fill the form to search flight for roundtrip and click on search button
	//Leaving from Washington (IAD - Washington Dulles Intl.)  Going to Toronto (YTZ - Billy Bishop Toronto City)

	@FindBy(xpath="//span[text()='Flights']") WebElement FlightsLink;
	@FindBy(xpath="((//div[@class=\"uitk-field has-floatedLabel-label has-icon has-placeholder\"] )[1]") WebElement LeavingFrom;
	@FindBy(xpath="//input[@id=\'location-field-leg1-origin\']") WebElement WhereLeg1;
	@FindBy(xpath="//strong[text()='Washington (IAD - Washington Dulles Intl.)']") WebElement Leg1OriginSelection;
	@FindBy(xpath="(//div[@class=\"uitk-field has-floatedLabel-label has-icon has-placeholder\"] )[2]") WebElement GoingTo;
	@FindBy(xpath="//strong[text()='Toronto (YTZ - Billy Bishop Toronto City)']") WebElement WhereLeg2;
	@FindBy(xpath="//li[@data-index=\"1\"]") WebElement Leg2OriginSelection;
	
	
	@FindBy(xpath="(//div[@class=\"uitk-field has-floatedLabel-label has-icon has-placeholder\"] )[3]") WebElement Departing;
	@FindBy(xpath="//button[@data-day=\"20\"]") WebElement StartDate;
	
	//@FindBy(xpath="//span[text()='End date']") WebElement EndDate;
	@FindBy(xpath="//button[@data-day=\"27\"] ") WebElement EndingtDate;
	@FindBy(xpath="(//button[text()='Done'])[2]") WebElement DoneBut;
	@FindBy(xpath="//button[text()='1 traveler']") WebElement Travelers;
	@FindBy(xpath="(//button[@class=\"uitk-layout-flex-item uitk-step-input-touch-target\"])[2]") WebElement Adults;
	@FindBy(xpath="//button[text()=\"Done\"]") WebElement DoneTravellers;
	@FindBy(xpath="//button[text()=\"Search\"]") WebElement Search;
	
	
	
	public ExpediaBoot(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
	
	public void ClickFlights() {
		FlightsLink.click();
	}
	
	public void LeavingFrom() {
		LeavingFrom.click();
	}

	public String WhereLeg1(String str) {
		//WhereLeg1.click();
		WhereLeg1.sendKeys(str);
		return str;
	}
	public void Leg1OriginSelection() {
		Leg1OriginSelection.click();
	}
	
	public void GoingTo() {
		GoingTo.click();
	}
	public String WhereLeg2(String str1) {
	//	WhereLeg2.click();
		WhereLeg2.sendKeys(str1);
		 return str1;
	}
	public void Leg2OriginSelection() {
		Leg2OriginSelection.click();
	}
	
	public void Departing() {
		Departing.click();
	}
	public void StartDate() {
		StartDate.click();
	}
//	public void EndDate() {
//		EndDate.click();
//	}
	public void EndingtDate() {
		EndingtDate.click();
	}
	public void DoneBut() {
		DoneBut.click();
	}
	public void Travelers() {
		Travelers.click();
	}
	public void Adults() {
		Adults.click();
	}
	public void DoneTravellers() {
		DoneTravellers.click();
	}
	public void Search() {
		Search.click();
	}
	

	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

