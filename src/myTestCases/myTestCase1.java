package myTestCases;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v146.css.model.CSSStyleSheetHeader;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCase1 extends myTestCase2 {

	@BeforeTest
	public void mySetup() {

		BeforeTestSetUp();

	}

	@Test(priority = 1, enabled = true)
	public void Signup() throws InterruptedException {

		driver.navigate().to(SignupPage);

		WebElement firstName = driver.findElement(By.xpath("//input[@id='AccountFrm_firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='AccountFrm_lastname']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='AccountFrm_email']"));
		WebElement telephone = driver.findElement(By.xpath("//input[@id='AccountFrm_telephone']"));
		WebElement fax = driver.findElement(By.xpath("//input[@id='AccountFrm_fax']"));
		WebElement company = driver.findElement(By.xpath("//input[@id='AccountFrm_company']"));
		WebElement address1 = driver.findElement(By.xpath("//input[@id='AccountFrm_address_1']"));
		WebElement address2 = driver.findElement(By.xpath("//input[@id='AccountFrm_address_2']"));
		WebElement city = driver.findElement(By.xpath("//input[@id='AccountFrm_city']"));
		WebElement state = driver.findElement(By.xpath("//select[@id='AccountFrm_zone_id']"));
		WebElement ZIPCode = driver.findElement(By.xpath("//input[@id='AccountFrm_postcode']"));
		WebElement Country = driver.findElement(By.xpath("//select[@id='AccountFrm_country_id']"));
		WebElement loginName1 = driver.findElement(By.xpath("//input[@id='AccountFrm_loginname']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='AccountFrm_password']"));
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='AccountFrm_confirm']"));

		// send the data

		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email.sendKeys(TheEmail);
		telephone.sendKeys(phone);
		fax.sendKeys(faxNumber);
		company.sendKeys(companyName);

		address1.sendKeys(Address1);
		address2.sendKeys(Address2);
		city.sendKeys(City);

		Select countrySelector = new Select(Country);

		countrySelector.selectByIndex(randomIndexfortheCountry);

		Thread.sleep(3000);

		Select stateSelector = new Select(state);
		stateSelector.selectByIndex(randomIndexfortheState);

		ZIPCode.sendKeys(postcode);

		loginName1.sendKeys(loginname);
		password.sendKeys(Password);
		confirmPassword.sendKeys(ConfirmPassword);

		WebElement Acceptterms = driver.findElement(By.xpath("//input[@id='AccountFrm_agree']"));
		Acceptterms.click();

		WebElement ContinueButton = driver.findElement(By.cssSelector(".btn.btn-orange.pull-right.lock-on-click"));
		ContinueButton.click();

		Thread.sleep(3000);

		String currentURL = driver.getCurrentUrl();
		AssertJUnit.assertEquals(currentURL.contains("success"), true);

		String title = driver.getTitle();
		AssertJUnit.assertEquals(title.contains("Your Account Has Been Created!"), true);

		String pagesource = driver.getPageSource();
		AssertJUnit.assertEquals(pagesource.contains(firstname), true);

	}

	@Test(priority = 2, enabled = true)
	public void Logout() {

		driver.navigate().to(logout);

		String currentURL = driver.getCurrentUrl();
		AssertJUnit.assertEquals(currentURL.contains("logout"), true);

		String title = driver.getTitle();
		AssertJUnit.assertEquals(title.contains("Account Logout"), true);

		String pagesource = driver.getPageSource();
		AssertJUnit.assertEquals(pagesource.contains("Account Logout"), true);

	}

	@Test(priority = 3, enabled = true)
	public void Login() throws InterruptedException {

		driver.navigate().to(LoginPage);

		WebElement Loginname2 = driver.findElement(By.xpath("//input[@id='loginFrm_loginname']"));
		WebElement PassWord = driver.findElement(By.xpath("//input[@id='loginFrm_password']"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@title='Login']"));

		Loginname2.sendKeys(loginname);
		PassWord.sendKeys(Password);
		loginbutton.click();

		Thread.sleep(2000);

		String currentURL = driver.getCurrentUrl();
		String title = driver.getTitle();
		String pageSource = driver.getPageSource();

		AssertJUnit.assertEquals(currentURL.contains("account/account"), true);
		AssertJUnit.assertEquals(title.contains("My Account"), true);
		AssertJUnit.assertEquals(pageSource.contains(firstname), true);

	}

	@Test(priority = 4, enabled = true)
	public void function1() throws InterruptedException, IOException {

		driver.navigate().to(homePage);

		int size = driver.findElements(By.cssSelector(".col-md-3.col-sm-6.col-xs-12")).size();

		for (int i = 0; i < size + 1; i++) {

			List<WebElement> items = driver.findElements(By.cssSelector(".col-md-3.col-sm-6.col-xs-12"));

			if (i >= items.size())
				break;

			items.get(i).click();

			driver.findElement(By.linkText("View")).click();

			String currentURL = driver.getCurrentUrl();

			if (currentURL.contains("id=53")) {
				WebElement Color = driver.findElement(By.xpath("//select[@id='option318']"));
				Select ColorSelector = new Select(Color);
				ColorSelector.selectByIndex(randomIndexfortheColor);

			} else if (currentURL.contains("id=116")) {

				WebElement TheDivOFTheRadioButton = driver
						.findElement(By.xpath("(//div[@class='input-group col-sm-10'])[1]"));

				List<WebElement> MyRadioButtonList = TheDivOFTheRadioButton.findElements(By.tagName("input"));

				int TotalInputs = MyRadioButtonList.size();

				int myRandomITem = rand.nextInt(TotalInputs - 1);

				MyRadioButtonList.get(myRandomITem).click();

				WebElement Color = driver.findElement(By.xpath("//select[@id='option345']"));
				Select ColorSelector = new Select(Color);
//				
//				for(int k=0 ; k<3 ;k++) {
//					if(k==0 || k==2) {
//						continue;
//					}
//					ColorSelector.selectByIndex(k);
//					
//				}
//				or

//				ColorSelector.selectByIndex(1); 

//              or
				ColorSelector.selectByValue("753");

			} else if (currentURL.contains("id=118")) {
				// input-group col-sm-10

				WebElement TheDivOFTheRadioButton = driver.findElement(By.cssSelector(".input-group.col-sm-10"));

				List<WebElement> MyRadioButtonList = TheDivOFTheRadioButton.findElements(By.tagName("input"));

				int TotalInputs = MyRadioButtonList.size();

				int myRandomITem = rand.nextInt(TotalInputs);

				MyRadioButtonList.get(myRandomITem).click();

			} else if (currentURL.contains("id=80")) {

				WebElement FragranceSize = driver.findElement(By.id("option321"));
				Select FragranceSizeSelector = new Select(FragranceSize);
				FragranceSizeSelector.selectByIndex(randomIndexforFragranceSizeSelector);

			}

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,100)");

			// take screenshots for each item
			Date mydate = new Date();

			String filename = mydate.toString().replace(":", "-");

			TakesScreenshot ts = (TakesScreenshot) driver;

			File file = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(file, new File("screenshots/" + filename + ".jpg"));

			driver.findElement(By.xpath("//a[@class='cart']")).click();

			Thread.sleep(2000);

			driver.navigate().to(homePage);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(
					ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".col-md-3.col-sm-6.col-xs-12")));
		}
	}

	@Test(priority = 5, enabled = true)
	public void Table() throws IOException {
		driver.navigate().to(cartPage);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100)");

		// take screenshot
		Date mydate = new Date();

		String filename = mydate.toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File file = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("screenshots/" + filename + ".jpg"));

		// table data
		WebElement TheTable = driver.findElement(By.cssSelector(".container-fluid.cart-info.product-list table"));

		List<WebElement> allRows = TheTable.findElements(By.tagName("tr"));

		for (int i = 1; i < allRows.size(); i++) {
			List<WebElement> cells = allRows.get(i).findElements(By.tagName("td"));

			if (cells.size() > 1) {
				System.out.println(cells.get(1).getText());
			}
		}

	}
	
	@Test(priority = 6, enabled = true)
	public void Cheakout() throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,2000)");
		
		// take screenshot
		Date mydate = new Date();

		String filename = mydate.toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File file = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("screenshots/" + filename + ".jpg"));
		
		WebElement CheakoutButton = driver.findElement(By.id("cart_checkout2"));
		CheakoutButton.click();
		
	}
	
	@Test(priority = 7, enabled = true)
	public void ConfirmOrder() throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1500)");
		
		// take screenshot
		Date mydate = new Date();

		String filename = mydate.toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File file = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("screenshots/" + filename + ".jpg"));
		
		WebElement ConfirmOrderButton = driver.findElement(By.id("checkout_btn"));
		ConfirmOrderButton.click();
		
	}
	@Test(priority = 8, enabled = true)
	public void GoToHomePage() throws IOException, InterruptedException {
		
		Thread.sleep(2000);
		
		// take screenshot
		Date mydate = new Date();

		String filename = mydate.toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File file = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("screenshots/" + filename + ".jpg"));
		
		WebElement ContinueButton = driver.findElement(By.linkText("Continue"));
		ContinueButton.click();
		
		mydate = new Date();
		filename = mydate.toString().replace(":", "-");
		file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("screenshots/" + filename + ".jpg"));
		
		
		
	}
	
	

}
