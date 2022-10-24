package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	@Test    
    public void f(){
            //First session of WebDriver
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\gudip\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
}
 @Test    
    public void sandeal(){
            //First session of WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gudip\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://www.amazon.in");
}	
 @Test    
    public void flipkart(){
            //First session of WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gudip\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://www.flipkart.in");
}	 
}