package Amazon_DemoPOM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_HomePage {
	public WebDriver driver;
	@FindBy(xpath="//span[@class=\"nav-action-inner\"]")
	private WebElement singinbutton;
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbar;
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
	private WebElement loginButton;
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement singoutbutton;
	public Demo_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;

	}
	public void singinmethod() {
		singinbutton.click();
	}
	public void login() {
		loginButton.click();
	}
	public void serachpbject() throws InterruptedException, AWTException {
		searchbar.sendKeys("iPhone");
		Thread.sleep(3000);
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		
		//  r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(3000);
		//  r.keyPress(KeyEvent.VK_DOWN); Thread.sleep(3000);
		//  r.keyPress(KeyEvent.VK_DOWN);
		 
		  r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_ENTER);
	}
	
public void singoutmethod() {
	singoutbutton.click();
}
}
