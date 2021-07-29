import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DowonloadFile {
     @Test
	public void dloadTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		d.get("http://www.leafground.com/");
		d.findElement(By.linkText("DownLoad Files")).click();
		d.findElement(By.linkText("Download Excel")).click();
		File f1 =new File("C:\\Users\\rajeev.r\\Downloads");
		File[] v_file =f1.listFiles();
	 for(File le: v_file) {
		 if(le.getName().equalsIgnoreCase("testleaf.xlsx")) {
		 System.out.println("file exist");
		 break;}
	 }
	}
}
