package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class materialPage{
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement master;

	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[3]")
	public static WebElement material;
	
@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[3]")
	public static WebElement materialState;
//	@FindBy(xpath = "//div[@class='sc-dnqmqq fyMRQD']")
//	public static WebElement materialState; 
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/button")
public static WebElement addMaterial;
     
       
   
	
       
	
	
}