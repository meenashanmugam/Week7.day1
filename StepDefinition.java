package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public ChromeDriver driver;
	@Given("open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@And("Load the application url")
	public void loadApplication() {
		driver.get("http://leaftaps.com/opentaps/control/login");

	}
	@Given("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
}
	@Given("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
}
@Then("Click on Login Button")
	public void clickButton()
	{
	driver.findElement(By.className("decorativeSubmit")).click();

	}
@When("Homepage should be displayed")
	public void clickDisplayed() {
		
	WebElement findElement = driver.findElement(By.linkText("CRM/SFA"));
	findElement.click();
	boolean displayed = findElement.isDisplayed();
		if(displayed)
		{
			System.out.println(displayed);
		
		}
		else 
		{
			System.out.println(displayed);

		}
}

@But("Error should be displayed")
		public void verifyErroeMessage() {
			boolean displayed = driver.findElement(By.id("errorDiv")).isDisplayed(); // true / false
			if(displayed) {
				System.out.println("Error message is displayed");
			}else {
				System.out.println("Error message is not displayed");
				
			}
	}

		@When("Click on CRMSFA link")
			public void clickCRMSFA() {
				driver.findElement(By.linkText("CRM/SFA")).click();
			

	}
	@Then("MyHomePage should be displayed")
			public void verifyMyHomePage() {
				boolean displayed = driver.findElement(By.xpath("//div[text()='My Home']")).isDisplayed();
				if (displayed) {
					System.out.println("My Homepage displayed");
				} else {
					System.out.println("My Homepage is not displayed");
				}

}
}

