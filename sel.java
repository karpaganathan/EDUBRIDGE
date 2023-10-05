package seliium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class sel {
	public static void main(String[] args) throws InterruptedException{
		 
		 
		 System.setProperty("webdriver.chrome.driver","C:/Users/Karpaganathan/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		 WebDriver sk=new ChromeDriver();
		 sk.get("https://www.amazon.in/");
		 Thread.sleep(5000);
		 sk.findElement(By.id("twotabsearchtextbox")).sendKeys("sneakers");
		 sk.findElement(By.id("nav-search-submit-button")).click(); 
		 sk.navigate().to("https://www.linkedin.com/feed/");
		 String name=sk.getCurrentUrl();
		 System.out.println(name);
         sk.navigate().back();
		 sk.navigate().forward();
		 sk.navigate().refresh();
		 sk.close();
		
	}
}