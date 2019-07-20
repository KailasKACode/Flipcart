import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void openBrowser() {
		ChromeOptions option = new ChromeOptions();

		WebDriver driver = new ChromeDriver(option.addArguments("--disable-notifications"));
		driver.get("https://www.flipkart.com");

	}
	@Test
	public void enterUserName() {
		// TODO Auto-generated method stub

	}
	@Test
	public void enterpassword() {
		// TODO Auto-generated method stub

	}
	@Test
	public void clickOnLogin() {
		// TODO Auto-generated method stub

	}

}
