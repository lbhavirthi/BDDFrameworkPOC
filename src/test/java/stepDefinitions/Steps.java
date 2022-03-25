package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps {
	WebDriver driver;

	@Given("^Open the Chrome browser and launch Facebook Signup page$")
	public void open_the_Chrome_browser_and_launch_Facebook_Signup_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"E://SG_DT_049_Data//Murty//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
	}

	@When("^Enter the required fileds with password length less than (\\d+) characters$")
	public void enter_the_required_fileds_with_password_length_less_than_characters(int arg1, DataTable arg2) throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,15);
		List<List<String>> data=arg2.raw();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(0));
		driver.findElement(By.name("lastname")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("reg_email__")).sendKeys(data.get(1).get(2));
		driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(1).get(3));
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByValue(data.get(1).get(4));

		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue(data.get(1).get(5));

		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue(data.get(1).get(6));

		driver.findElement(By.className("_58mt")).click();

	}

	@Then("^Validate invalid password Error message 	‘Your password must be at least (\\d+) characters long\\. Please try another\\.’$")
	public void validate_invalid_password_Error_message_Your_password_must_be_at_least_characters_long_Please_try_another(
			int arg1) throws Throwable {
		driver.findElement(By.name("websubmit")).click();

		String expval = "Your password must be at least 6 characters long. Please try another.";
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_58mo")));
		WebElement m = driver.findElement(By.className("_58mo"));
		String actval = m.getText();
		System.out.println("Error message is: "+ actval);
		//verify error message with Assertion
		Assert.assertEquals(expval, actval);

	}

}