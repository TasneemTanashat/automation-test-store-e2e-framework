package myTestCases;


import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class myTestCase2 {
	
    WebDriver driver = new ChromeDriver();
	
	String myWebsite="https://automationteststore.com/";
	
	String LoginPage= "https://automationteststore.com/index.php?rt=account/login";
	String SignupPage = "https://automationteststore.com/index.php?rt=account/create";
	
	String username="toto";
	Random rand =new Random();
	
	
	// generate random first name

	String[] firstnames = { "Lina", "Farah", "Mariam" };
	int randomIndexfortheFirstNames = rand.nextInt(firstnames.length);

	String firstname = firstnames[randomIndexfortheFirstNames];

	// generate random last name

	String[] lastnames = { "Omar", "Ameer", "Yousef" };

	int randomIndexfortheLastNames = rand.nextInt(lastnames.length);

	String lastname = lastnames[randomIndexfortheLastNames];
	
	// generate a random big number of emails
	
	int randomBigNumberOfEmails = rand.nextInt(24665);
	
	String TheEmail = firstname+lastname+randomBigNumberOfEmails+"@gmail.com";
	
	String phone = "07" + (10000000 + rand.nextInt(90000000));
	String faxNumber = "06" + (1000000 + rand.nextInt(9000000));
	String companyName = "Company" + rand.nextInt(1000);

	
	// generate an address
	 
	String Address1="address1";
	String Address2="address2";
	String City="city";
	String postcode="11181";
	
	String loginname = firstname+randomBigNumberOfEmails;
	String Password ="AcS@!554";
	String ConfirmPassword="AcS@!554";
	
	// for the two selectors
	
	
	int randomIndexfortheCountry = rand.nextInt(1, 10);
	int randomIndexfortheState = rand.nextInt(1, 2);

	// logout link
	
	String logout = "https://automationteststore.com/index.php?rt=account/logout";
	
	// home page
	
	String homePage= "https://automationteststore.com/";
	
	// random Index for the Color Selector
	int randomIndexfortheColor = rand.nextInt(1, 2);
	
	// random Index for the Fragrance Size Selector
	int randomIndexforFragranceSizeSelector= rand.nextInt(1, 3);
	
	// random Index for the Heel Selector
//	int HeelSelector= rand.nextInt(0, 3);
	
	
	
	
	// cart Page
	String  cartPage ="https://automationteststore.com/index.php?rt=checkout/cart";
	
	
	
	
	
	

	public void BeforeTestSetUp() {
		
		driver.get(myWebsite);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		
		
	}
	
	

}

