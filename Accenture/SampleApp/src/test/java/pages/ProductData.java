package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductData {
	WebDriver driver;
	By startdate = By.id("startdate");
	By insurancesum = By.id("insurancesum");
	By meritrating = By.id("meritrating");
	By damageinsurance = By.id("damageinsurance");
	By EuroProtection = By.xpath("//*[@id='EuroProtection']/following-sibling::span");
	By LegalDefenseInsurance = By.xpath("//*[@id='LegalDefenseInsurance']/following-sibling::span");
	By courtesycar = By.id("courtesycar");
	By nextselectpriceoption = By.id("nextselectpriceoption");
	
	public ProductData(WebDriver driver)
	{
		this.driver=driver;
		}
	public void fillInProductDataForm()  {
	driver.findElement(startdate).sendKeys(Keys.chord(Environment.startdate));
	driver.findElement(insurancesum).sendKeys(Keys.chord(Environment.insurancesum));
	driver.findElement(meritrating).sendKeys(Keys.chord(Environment.meritrating));
	driver.findElement(damageinsurance).sendKeys(Keys.chord(Environment.damageinsurance));
	if (Environment.OptionalProducts=="EuroProtection") {
		driver.findElement(EuroProtection).click();	
	}
	else if(Environment.OptionalProducts=="LegalDefenseInsurance") {
		driver.findElement(LegalDefenseInsurance).click();
		}
	driver.findElement(courtesycar).sendKeys(Keys.chord(Environment.courtesycar));
	driver.findElement(nextselectpriceoption).click();
	}



}
