package Amazon_DemoTc;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.management.AttributeValueExp;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_DemoPOM.Demo_HomePage;
import Amazon_DemoPOM.Serach_Page;
import Amazon_DemoPOM.loginpage;
import Readconfilit.XLUtils;


public class TC_001Demo extends BaseClass{
	
	

	@Test()
	
	  public void loginMethod() throws InterruptedException { 
		Demo_HomePage page=new Demo_HomePage(driver); 
	   page.login();
	}
	@Test(priority=2,dataProvider="LoginName")
	public void logindata(String user,String pwd) {
	   loginpage loginpage=new loginpage(driver);
	   loginpage.loginusertextmethod(user);
	   loginpage.clickloginmethod();
	  
	}

			
		
		
	
	 
	
	
	
	@DataProvider(name="LoginName")
	public String[][]getData() throws IOException{
		
		String path="C:\\Users\\User 1\\Desktop\\New Microsoft Office Excel Worksheet.xlsx";
	
		int rownum=XLUtils.getRowCount("Sheet1" );
		int cellcount=XLUtils.getCellcount("Sheet1",rownum );
		String loginData[][]=new String [rownum][cellcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;i<cellcount;j++) {
				String logindata=XLUtils.getCellData( "Sheet1", i, j);
				
				
			}
		}
		return loginData;
	}
	

}
