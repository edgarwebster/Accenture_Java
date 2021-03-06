package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InsurantData {
	WebDriver driver;
	By firstname = By.id("firstname");
	By lastname = By.id("lastname");
	By birthdate = By.id("birthdate");
	By male = By.xpath("//*[@id='gendermale']/following-sibling::span");
	By female = By.xpath("//*[@id='genderfemale']/following-sibling::span");
	By streetaddress = By.id("streetaddress");
	By country = By.id("country");
	By zipcode = By.id("zipcode");
	By city = By.id("city");
	By occupation = By.id("occupation"); 
	By speeding = By.xpath("//*[@id='speeding']/following-sibling::span");
	By bungeeJumping = By.xpath("//*[@id='bungeejumping']/following-sibling::span");
	By cliffDiving = By.xpath("//*[@id='cliffdiving']/following-sibling::span");
	By skydiving = By.xpath("//*[@id='skydiving']/following-sibling::span");
	By other = By.xpath("//*[@id='other']/following-sibling::span");
	By website = By.id("website");
	By nextenterproductdata = By.id("nextenterproductdata");
	
	public InsurantData(WebDriver driver)
	{
		this.driver=driver;
		}
	
	public void fillInInsurantDataForm(){
		
		driver.findElement(firstname).sendKeys(Keys.chord(Environment.firstname));
		driver.findElement(lastname).sendKeys(Keys.chord(Environment.lastname));
		driver.findElement(birthdate).sendKeys(Keys.chord(Environment.birthdate));
		if (Environment.gender=="male") {
			driver.findElement(male).click();	
		}
		else if(Environment.gender=="female") {
			driver.findElement(female).click();
			}
		driver.findElement(streetaddress).sendKeys(Keys.chord(Environment.streetaddress));
		driver.findElement(country).sendKeys(Keys.chord(Environment.country));
		driver.findElement(zipcode).sendKeys(Keys.chord(Environment.zipcode));
		driver.findElement(city).sendKeys(Keys.chord(Environment.city));
		driver.findElement(occupation).sendKeys(Keys.chord(Environment.occupation));
		switch (Environment.hobbie) {
			case "speeding":
				driver.findElement(speeding).click();
				break;
			case "bungeeJumping":
				driver.findElement(bungeeJumping).click();
				break;
			case "cliffDiving":
				driver.findElement(cliffDiving).click();
				break;
			case "skydiving":
				driver.findElement(skydiving).click();
				break;
			case "other":
				driver.findElement(other).click();
				break;
			}
		driver.findElement(website).sendKeys(Keys.chord(Environment.website));		
		driver.findElement(nextenterproductdata).click();
		}
}
