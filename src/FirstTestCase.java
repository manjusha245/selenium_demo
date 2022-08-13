import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	WebDriver driver;
	
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/nikhi/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).sendKeys("wikipedia");
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	}
	
	
	public void search()
	{	
		
		driver.navigate().to("https://www.wikipedia.org/");
		driver.findElement(By.name("search")).sendKeys("selenium software");
		driver.findElement(By.cssSelector("#search-form > fieldset > button")).click();
		
	}
	
	public void createAccount() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#pt-createaccount > a > span")).click();
		Thread.sleep(1000);
	}

	public void navigateback()
	{
		driver.navigate().back();
		driver.navigate().to("https://en.wikipedia.org/wiki/Special:Search?search=selenium+software&go=Go&ns0=1");
		
		
	}
	
	public void openSelenium() throws InterruptedException
	{
		driver.findElement(By.cssSelector("driver.findElement(By.cssSelector(\"#search-form > fieldset > button\")).click();")).click();
		driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[3]/ul/li[1]/div[1]/a")).click();
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirstTestCase obj= new FirstTestCase();
		obj.launchBrowser();
		obj.search();
		obj.createAccount();
		obj.navigateback();
		obj.openSelenium();
	}

}
