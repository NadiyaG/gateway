package gateway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gateway {
	
	WebDriver driver;
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testgateway.emsigner.com/");
		driver.manage().window().maximize();
		/*WebElement dropdown=driver.findElement(By.xpath("//*[@name='FileType']"));
		Select s=new Select(dropdown);
		Thread.sleep(3000);
		s.selectByIndex(0);
		
		WebElement uploadbtn=driver.findElement(By.xpath("//*[@id='btnFileUpload']"));
		uploadbtn.click();
		Thread.sleep(3000);
		uploadbtn.sendKeys("C:\\Users\\admin\\Downloads\\aboutspaceinjava.pdf");*/
		driver.findElement(By.xpath("//*[@class='statustext']")).click();
		driver.findElement(By.xpath("//*[@name='Name']")).sendKeys("Nadiya");
		driver.findElement(By.xpath("//*[@id='txtAuthToken']")).sendKeys("b0a41c84-c2da-4773-b2cc-58773ed4ef11");
		driver.findElement(By.xpath("//*[@id='ReferenceNumber']")).sendKeys("ty");
		WebElement esignDropdown=driver.findElement(By.xpath("//*[@name='SignatureType']"));
		Select s1=new Select(esignDropdown);
		s1.selectByIndex(4);
		WebElement selectpage=driver.findElement(By.xpath("//*[@name='SelectPage']"));
		Select s3=new Select(selectpage);
		s3.selectByValue("FIRST");
		WebElement signposition=driver.findElement(By.xpath("//*[@name='SignaturePosition']"));
		Select s4=new Select(signposition);
		s4.selectByValue("Top-Center");
		driver.findElement(By.xpath("//*[@class='form-box']/div[6]/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@class='form-box']/div[6]/div[2]/div/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@class='form-box']/div[6]/div[2]/div/div[8]/input")).click();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
	}


}
