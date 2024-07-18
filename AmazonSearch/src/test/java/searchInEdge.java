import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class searchInEdge {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\anindita.bhowmick\\eclipse_wp_UTA\\AmazonSearch\\Drivers\\EdgeBrowser\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	element.sendKeys("iphone");
	element.submit();
	element=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	String str=element.getText();
	String str1=str.substring(0, 12);
	System.out.println("Original value of first search result: "+str);
	if(str1.contains("Apple iPhone"))
	
		System.out.println("First value of search result is as expected: " +str1);
	else
		System.out.println("First value of search result is as not expected: " +str1);
	driver.quit();
	}
	

}
