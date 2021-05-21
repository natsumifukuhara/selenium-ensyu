package sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ex02Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver"); 
		WebDriver driver = new ChromeDriver(); 
		
		//raku+にアクセス
		driver.get("https://rakuplus.jp/");
		
		//自分のID、PWでログイン
		WebElement idbox = driver.findElement(By.className("input"));
		idbox.sendKeys("---");
		
		WebElement passbox = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		passbox.sendKeys("---");
		
		driver.findElement(By.id("wp-submit")).click();
		
		//ログイン直後の画面をスクショ
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file.toPath(), new File("/Users/fukuharanatsumi/Desktop/screenshot/" + file.getName()).toPath());
	}

}
