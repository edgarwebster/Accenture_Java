package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuote {
	
	WebDriver driver;
	By email = By.id("email");
	By phone = By.id("phone");
	By username = By.id("username");
	By password = By.id("password");
	By confirmpassword = By.id("confirmpassword");
	By comments = By.id("Comments");
	By sendemail = By.id("sendemail");
	By showSweetAlert = By.xpath("//*[@class='sweet-alert showSweetAlert visible']//h2");	
	public SendQuote(WebDriver driver)
	{
		this.driver=driver;
		}
	public void fillInSendQuoteDataForm()  {
		driver.findElement(email).sendKeys(Keys.chord(Environment.email));
		driver.findElement(phone).sendKeys(Keys.chord(Environment.phone));
		driver.findElement(username).sendKeys(Keys.chord(Environment.username));
		driver.findElement(password).sendKeys(Keys.chord(Environment.password));
		driver.findElement(confirmpassword).sendKeys(Keys.chord(Environment.confirmpassword));
		driver.findElement(comments).sendKeys(Keys.chord(Environment.Comments));
		driver.findElement(sendemail).click();
	}
	public void verifyEmailMessage()  {
	new WebDriverWait(driver, 30).until(ExpectedConditions.textToBe(showSweetAlert, Environment.message));	
	if (new WebDriverWait(driver, 30).until(ExpectedConditions.textToBe(showSweetAlert, Environment.message))==true);
	{System.out.println("Message found!");}
	}

}
