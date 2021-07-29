import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
@Test
public void m1Test() {
	System.out.println("hd");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajeev.r\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();
	d.get("https://www.google.co.in/");
}
}
