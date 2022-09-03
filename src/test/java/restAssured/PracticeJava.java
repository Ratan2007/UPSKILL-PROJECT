package restAssured;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJava {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKRAT\\eclipse-workspace02\\RestAssuredProject\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		driver.close();
	}

}
