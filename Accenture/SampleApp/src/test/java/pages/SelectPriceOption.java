package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectPriceOption {
	WebDriver driver;
	By silver = By.xpath("//*[@id='selectsilver']/following-sibling::span");
	By gold = By.xpath("//*[@id='selectgold']/following-sibling::span");
	By platinum  = By.xpath("//*[@id='selectplatinum']/following-sibling::span");
	By ultimate = By.xpath("//*[@id='selectultimate']/following-sibling::span");
	By nextsendquote = By.id("nextsendquote");
	
	public SelectPriceOption(WebDriver driver)
	{
		this.driver=driver;
		}
	public void fillInPriceOptionDataForm()  {
		switch (Environment.priceOption) {
		case "silver":
			driver.findElement(silver).click();
			break;
		case "gold":
			driver.findElement(gold).click();
			break;
		case "platinum":
			driver.findElement(platinum).click();
			break;
		case "ultimate":
			driver.findElement(ultimate).click();
			break;
			}
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(nextsendquote));
		driver.findElement(nextsendquote).click();
	}
	

}
