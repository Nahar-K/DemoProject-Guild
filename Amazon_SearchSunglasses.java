import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Amazon_SearchSunglasses {
	
	
	public static void main(String[] args) throws InterruptedException {
                        

    System.setProperty("webdriver.chrome.driver", "/Users/KamrunNahar/Downloads/chromedriver");
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

	                                               
	driver.get("https://www.amazon.com/");                 
	driver.manage().window().maximize();
             

	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oakley sunglasses");
	Thread.sleep(3000);

	                   
	driver.findElement(By.id("nav-search-submit-button")).click();
                  

	JavascriptExecutor js = (JavascriptExecutor)driver;

	                  
	js.executeScript("window.scrollBy(0, 800)", "");

	                   
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div[3]/div[2]/h2/a/span")).click();

	Thread.sleep(3000);
	
	Select quantity = new Select(driver.findElement(By.xpath("//*[@id=\"a-autoid-21-announce\"]")));
	quantity.selectByIndex(2);
	                   

	driver.findElement(By.id("add-to-cart-button")).click(); 
	Thread.sleep(5000);
	
	
	driver.close();
     

	}

}
