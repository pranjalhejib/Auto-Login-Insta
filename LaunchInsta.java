package selenium_basic;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;  


class LaunchInsta {

	public static void main(String[] args) throws InterruptedException {
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\SeleniumDemo\\AmazonAuto\\driver\\chromedriver.exe");  
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        // Instantiate action object
        Actions action = new Actions(driver);
        
        // Launch Website  
        driver.navigate().to("https://www.instagram.com/");  
          
        //Maximize the browser  
        driver.manage().window().maximize();  
                  
        //find user-name text field
        WebElement user_name_element = driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input"));
        user_name_element.sendKeys("user-name");
  
        //find password text field
        WebElement password_element = driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input"));
        password_element.sendKeys("password");
       
        
        //click on log-in
        driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(3)")).click();
        Thread.sleep(2000);
           	     		
	}

}