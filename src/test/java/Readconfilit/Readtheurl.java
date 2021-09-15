package Readconfilit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readtheurl {
	Properties pro;
	public  Readtheurl()   {
	try {	
	FileInputStream fis	=new FileInputStream(".\\config");
	pro=new Properties();
      
		pro.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
	public String AmazoneURL() {
		String URL=pro.getProperty("BaseUrl");
		return URL;
	}
	public String Chrome() {
		String divr=pro.getProperty("ChromeDriver");
		return divr;
	}
	public String Edge() {
		String Egde=pro.getProperty("edgedriver");
		return Egde;
	}
}	
