package Amazon_DemoPOM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Serach_Page {
	
	public WebDriver driver;
	@FindBy(xpath="//span[.='Sort by:']")
	private WebElement shortbybotton;
	@FindBy(xpath="//a[.='Price: Low to High']")
	private WebElement lowtohigh;
@FindBy(xpath="//span[@class=\"a-price-whole\"]")
private List <WebElement> shorting;
@FindBy(xpath="//span[contains(text(),'New Apple iPhone')]")
private List<WebElement> phonename;
@FindBy(xpath="//span[.='Apple']")
private WebElement cheakBox;
public Serach_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	
}
public void shortbutton() {
	shortbybotton.click();	
}
public void lowtohigh() {
	lowtohigh.click();
}
public void cheakBoxmethod() {
	cheakBox.click();
}
public void shortingmethod() {
	//int amount;
	ArrayList<Integer>actual=new ArrayList<>();
	
		
	for(int i=0;i<shorting.size();i++) {
	 String fav=shorting.get(i).getText();
	 System.out.println(fav);
		/*
		 * int amount= Integer.parseInt(fav.replaceAll("[,]","").toString());
		 * actual.add(amount);
		 */
	 Integer val;
	 if(NumberUtils.isCreatable(fav)) {
		val =Integer.valueOf(fav);
	 System.out.println("hii");
	 }
	 else {
		int amount= Integer.parseInt(fav.replaceAll("[,]","").toString());
		actual.add(amount);
			
				}
	}		
	
	Collections.sort(actual);
	System.out.println(actual);
	for(int i=0;i<shorting.size();i++) {
		String str=shorting.get(i).getText();
		int amount=Integer.parseInt(str.replaceAll("[,]","").toString());
		if(actual.get(0)==amount) {
			System.out.println(actual.get(0));
			shorting.get(i).click();
         break;

 
	/*
	 * for(int j=0;j<=actual.size();j++) { for(int z=1;z<=actual.size()-2;z++) {
	 * if(actual.get(j)<actual.get(z)) { shorting.get(j).click(); } } }
	 */
}
}}}
	/*
		System.out.println(actual);
	Collections.sort(actual);
	int lowest=actual.get(0);
	*/
	
	
		
		
	
	



	


