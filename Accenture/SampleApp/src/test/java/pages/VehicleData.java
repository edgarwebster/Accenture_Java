package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class VehicleData {
	WebDriver driver;
		By make = By.id("make");
		By model = By.id("model");
		By cylindercapacity = By.id("cylindercapacity");
		By engineperformance = By.id("engineperformance");
		By dateofmanufacture =  By.id("dateofmanufacture");
		By numberofseats = By.id("numberofseats");
		By yes = By.xpath("//*[@id='righthanddriveyes']/following-sibling::span");
		By no = By.xpath("//*[@id='righthanddriveno']/following-sibling::span");
		By numberofseatsmotorcycle = By.id("numberofseatsmotorcycle");
		By fuel = By.id("fuel");
		By payload = By.id("payload");
		By totalweight = By.id("totalweight");
		By listprice = By.id("listprice");
		By licenseplatenumber = By.id("licenseplatenumber");
		By annualmileage = By.id("annualmileage"); 
		By nextenterinsurantdata = By.id("nextenterinsurantdata");
	
	public VehicleData(WebDriver driver)
	{
		this.driver=driver;
		}
	
	public void fillInVehicleDataForm(){
	new Select(driver.findElement(make)).selectByVisibleText(Environment.make);
	new Select(driver.findElement(model)).selectByVisibleText(Environment.model);
	driver.findElement(cylindercapacity).sendKeys(Keys.chord(Environment.cylindercapacity));
	driver.findElement(engineperformance).sendKeys(Keys.chord(Environment.engineperformance));
	driver.findElement(dateofmanufacture).sendKeys(Keys.chord(Environment.dateofmanufacture));
	new Select(driver.findElement(numberofseats)).selectByVisibleText(Environment.numberofseats);
	if (Environment.RightHandDrive=="yes") {
		driver.findElement(yes).click();	
	}
	else if(Environment.RightHandDrive=="no") {
		driver.findElement(no).click();
		}
	new Select(driver.findElement(numberofseatsmotorcycle)).selectByVisibleText(Environment.numberofseatsmotorcycle);
	new Select(driver.findElement(fuel)).selectByVisibleText(Environment.fuel);
	driver.findElement(payload).sendKeys(Keys.chord(Environment.payload));
	driver.findElement(totalweight).sendKeys(Keys.chord(Environment.totalweight));
	driver.findElement(listprice).sendKeys(Keys.chord(Environment.listprice));
	driver.findElement(licenseplatenumber).sendKeys(Keys.chord(Environment.licenseplatenumber));
	driver.findElement(annualmileage).sendKeys(Keys.chord(Environment.annualmileage));
	driver.findElement(nextenterinsurantdata).click();
	}

}
