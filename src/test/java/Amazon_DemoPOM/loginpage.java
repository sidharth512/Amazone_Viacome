package Amazon_DemoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public WebDriver driver;
	@FindBy(xpath="//input[@type=\"email\"]")
	private WebElement usertextbox;
	@FindBy(id="continue")
	private WebElement loginbutton;
	@FindBy (xpath="//input[@type=\"password\"]")
	private WebElement pwddbox;
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
	private WebElement suggectionofsingout;
	@FindBy(id="id=\"signInSubmit\"")
	private WebElement singinbutton;
	@FindBy(xpath="(//span[.='All'])[2]")
	private WebElement Allbutton;



public loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	// TODO Auto-generated constructor stub
}
public void Allmethod() {
	Allbutton.click();
}
public void loginusertextmethod(String uname) {
	usertextbox.sendKeys(uname);
}
public void clickloginmethod() {
	loginbutton.click();
}
public void pwdtextmethod(String pwd) {
	
	pwddbox.sendKeys(pwd);
	
}
public void suggectionbox() {
	Actions act=new Actions(driver);
	act.moveToElement(suggectionofsingout).perform();
}
public void singmethod() {
	singinbutton.click();
}
}
