package logincom.stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefine {
	
	public WebDriver d;
    public WebElement username;
    public WebElement password;
    public WebElement login;
    public ChromeOptions opt;
    
	@Given("^Launched the site$")
	public void launched_the_site() {
		opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		d=new ChromeDriver(opt);
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		
		 
	       


	   
	}
	@When("^Enter username$")
	public void enter_username()  {
      
		username=d.findElement(By.xpath("//*[@id='email']"));
		username.sendKeys("sonusunita90@yahoo.com");
		System.out.println("username enter");
	  
	}

	@When("^Enter password$")
	public void enter_password()  {
		
		password=d.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys("Masura@1979");
		System.out.println("password enter");
	   
	}

	@When("^Click on login button$")
	public void click_on_login_button()  {
		
		//password.submit();
		login=d.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
	    System.out.println("clicked on login");
	   
	    
	   
	}

	@Then("^Site should be login successfully$")
	public void site_should_be_login_successfully()  {
		
		String title=d.getTitle();
		System.out.println(title);
	
	    
	   
	}



}
