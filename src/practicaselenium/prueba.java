package practicaselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class prueba {
	
		public static void main (String[] args)throws InterruptedException {
			System.setProperty("webdriver.edge.driver","C://Selenium/msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.get("https://www.amazon.com/");
				//inserta tu código aquí
				Thread.sleep(5000);
			driver.quit();
		}
	
}
