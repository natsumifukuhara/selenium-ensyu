package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver"); 
		WebDriver driver = new ChromeDriver(); 
		
		//URLにアクセス
		driver.get("http://www.google.com/");
		
		//検索BOXに「selenium」と入力し検索
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		searchBox.submit();
		
		//検索結果の1番上のリンクの文言をコンソールに出力
		//String link = driver.findElement(By.className("LC20lb DKV0Md")).getText();
		String link = driver.findElement(By.tagName("h3")).getText();
		System.out.println(link);

	}

}
