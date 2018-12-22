package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\GULBARGA UNIVERSITY\\eclipse-workspace\\HybridDrivenFramework\\src\\com\\abc\\utilities\\Hybrid.properties");
		 Properties p=new Properties();
		 p.load(fis);
		 String url=p.getProperty("url");
		 String username=p.getProperty("username");
		 String password=p.getProperty("password");
		 
		 String myacc=p.getProperty("myacc");
		 String email=p.getProperty("email");
		 String pwd=p.getProperty("pwd");
		 String login=p.getProperty("login");
		 String logout=p.getProperty("logout");
		 
		 System.out.println(url);
		  System.out.println(username);
		 System.out.println(password);
		 System.out.println(myacc);
		 System.out.println(email);
		 System.out.println(pwd);
		 System.out.println(login);
		 System.out.println(logout);
		 
		 ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
		 
		 driver.findElement(By.xpath(myacc)).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath(email)).sendKeys(username);
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath(pwd)).sendKeys(password);
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath(login)).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath(logout)).click();
		 Thread.sleep(4000);
		 
		 FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\GULBARGA UNIVERSITY\\\\eclipse-workspace\\\\HybridDrivenFramework\\\\src\\\\com\\\\abc\\\\utilities\\\\Hybrid.properties");
		 p.setProperty("car", "swift");
		 p.save(fos, "swift car is avearge!!!");
		  
		driver.close();
		

	}

}
