package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Caller {
	WebDriver driver;
	
@Before
public void setup() {
	System.out.println("Starting test!");
	System.setProperty(Environment.browser, Environment.webdriverLocation);
	driver = new ChromeDriver();
}
@After
public void teardown() {
	System.out.println("Starting teardown!");
	driver.quit();
}
		@Given("^Tricentis site is opened$")
		public void tricentis_site_is_opened()  {
		  driver.get(Environment.url);  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		@When("^user fill in Enter Vehicle Data Form$")
		public void user_fill_in_Enter_Vehicle_Data_Form()  {
	    VehicleData Vehicle = new VehicleData(driver);
	    Vehicle.fillInVehicleDataForm();
			
		}

		@When("^user fill in Enter Insurant Data Form$")
		public void user_fill_in_Enter_Insurant_Data_Form()  {
		InsurantData Insurant = new InsurantData(driver);
		Insurant.fillInInsurantDataForm();
	
		}

		@When("^user fill in Enter Product Data Form$")
		public void user_fill_in_Enter_Product_Data_Form()  {
		ProductData Product = new ProductData(driver);
		Product.fillInProductDataForm();

		}

		@When("^user select Price Option and Check$")
		public void user_select_Price_Option_and_Check() {
		SelectPriceOption Price = new SelectPriceOption(driver);
		Price.fillInPriceOptionDataForm();
		}

		@When("^user fill information and Send Quote$")
		public void user_fill_information_and_Send_Quote() {
		SendQuote Quote = new SendQuote(driver);	
		Quote.fillInSendQuoteDataForm();

		}

		@Then("^a sending e-mail success message is shown$")
		public void a_sending_e_mail_success_message_is_shown() {
		SendQuote Quote = new SendQuote(driver);	
		Quote.verifyEmailMessage();
		}
}
