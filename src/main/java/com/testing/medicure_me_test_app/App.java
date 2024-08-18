package com.testing.medicure_me_test_app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Hello world!
 *
 */
public class App 
{
	

    public static void main( String[] args ) throws InterruptedException
    {
//initialize the chrome driver
    	
    	
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless");
    	
	 	WebDriver driver = new ChromeDriver(options);
    	//WebDriver driver = new ChromeDriver();
	 	
	 	//open the web application
        driver.get("http://34.229.179.190:8082/contact.html");
        
        
        String title = driver.getTitle();
        System.out.println(title);
        
        //1. Locate and Enter Name
        //WebElement name = driver.findElement(By.id("inputName"));
        //name.sendKeys("Shubham");
        WebElement name = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
        name.sendKeys("Apurve");
        
        //String printName = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input")).getText();
        
        System.out.println();
        
        //2. Locate and Enter Contact
        //WebElement number = driver.findElement(By.id("inputNumber"));
        //number.sendKeys("999999999");
        WebElement number = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
        number.sendKeys("999999999");
        System.out.println(number.getText().toString());
        
        //3. Locate Email and Enter Email
        //WebElement mail = driver.findElement(By.id("inputMail"));
        //mail.sendKeys("shubham@xyz.com");
        WebElement mail = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
        mail.sendKeys("apurve@xyz.com");
        System.out.println(mail.getText());
        
        //4. Locate Message and Enter Message
        //WebElement message = driver.findElement(By.id("inputMessage"));
        WebElement message = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
        message.sendKeys("Hello, How are you ?");
        System.out.println(message.getText());
        
        Thread.sleep(2000);
        
        //5. Locate Send Button and click to send the message.
        //WebElement sendButton = driver.findElement(By.id("my-button"));
        WebElement sendButton = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
        sendButton.click();
        Thread.sleep(2000);
        
        //String response = driver.findElement(By.id("response")).getText();
        String response = driver.findElement(By.id("message")).getText();
        System.out.println(response);
        
        
        driver.quit();

        
    }
}
