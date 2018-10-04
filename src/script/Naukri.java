package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto;
import generic.Excel;

public class Naukri implements Auto{

	
		static {
			 System.setProperty(key,value);
		}
		public static void main(String[] args) {
			 WebDriver driver=new ChromeDriver();
			 
			 String em=Excel.abc(excelpath, "sheet1", 0, 1);
			 String pwd=Excel.abc(excelpath, "sheet1", 0, 2);
			 
			    driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=http%3A%2F%2Fmy.naukri.com");
				driver.findElement(By.id("usernameField")).sendKeys(em);
				driver.findElement(By.id("passwordField")).sendKeys(pwd);
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				
				driver.close();
		}

	}


