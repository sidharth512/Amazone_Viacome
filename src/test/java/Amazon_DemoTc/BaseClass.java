package Amazon_DemoTc;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Readconfilit.*;

public class BaseClass {
	public WebDriver driver;
	Readtheurl read=new Readtheurl();
  public String baseurl=read.AmazoneURL();
  public String chromedriver=read.Chrome();
 
	
	@Parameters("browser")
	@BeforeClass
	public void startofurl(String br) {
		if (br.contains("chrome")){
	System.setProperty("webdriver.chrome.driver",chromedriver );
	 driver=new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.edge.driver",read.Edge() );
		 driver=new EdgeDriver();	
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseurl);
			
	}
	
	 public void ScreenShort(WebDriver driver,String tname) throws IOException {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File target=new File(System.getProperty("user.dir")+"\\Screenshorts\\"+tname+".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshort taken");
			
		}

	
}
