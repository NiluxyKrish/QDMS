package Test;





import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.materialPage;

import base.initial;



  public class materialTest extends initial{
	
	
	 materialPage check=new  materialPage ();

	@Test	 
		 public void  Page() throws InterruptedException,IOException {
			 
			 PageFactory.initElements(driver, check);	 
			 Thread.sleep(2000);
			 materialPage.master.click();
			 
			 Thread.sleep(2000);
			 materialPage.material.click();
			 
			 Thread.sleep(2000);
			 materialPage. materialState.click();
			
//			 Thread.sleep(2000);
//			 materialPage.addMaterial.click();
//		
			SoftAssert sa = new SoftAssert();
			
			                 
			                  //Thread.sleep(2000);
			              //materialPage.addMaterial.click();      
			 //check the Text
            String txt= materialPage.addMaterial.getText();
            System.out.println("text:"+txt);
            String  expectedText="Add Material State";
            sa.assertEquals(txt,expectedText);           
       
			
			         //check the background color
			              String clour= materialPage.addMaterial.getCssValue("color");
			              System.out.println("clour:"+clour);
			              String  expectedclour="rgba(255, 255, 255, 1)";
			              sa.assertEquals(clour,expectedclour);           
			         
			            //check the position location

			              Point location= materialPage.addMaterial.getLocation();
			              System.out.println("location:"+location);
			              int x = location.getX();
			             int y = location.getY();
			               Point expectedLocation  =new Point(608, 93);
			               sa.assertEquals(location,expectedLocation);   
			               

			  			 //check the button size
			  			               Dimension buttonSize = materialPage.addMaterial.getSize();
			  			                 System.out.println("ButtonSize :"+buttonSize);
			  			                 Dimension expectedButtonSize = new Dimension(145, 32);
			  			                 sa.assertEquals(buttonSize,expectedButtonSize);
			              
//			  check the font size
			                 String fontSize = materialPage.addMaterial.getCssValue("font-size"); 
			                 System.out.println("Font Size: "+fontSize); 
			                 String expectedfontsSize ="14px";
			                 sa.assertEquals(fontSize,expectedfontsSize);             
//			               //  check the font clour
//			                
//			                 String fontColor = materialPage.addMaterial.getCssValue("font-color"); 
//			                 System.out.println("Font clour: "+fontColor); 
//			                 String expectedFontClour ="14px";
//			                 sa.assertEquals(fontColor,expectedFontClour);             

			                 
			                 sa.assertAll();         

			                 
			                 
			                 
			                 
			                 
			                 
			                 
			                 
			                 //			  
			                 
			                 
			                 //check the + size
//
//			         
//			                 String symbolSize = materialPage.materialState.getCssValue("font-size"); 
//			                 System.out.println("SymbolSize: "+ symbolSize); 
//			                 String expectedSymbolSize ="12px";
//			                 sa.assertEquals(symbolSize,expectedSymbolSize);        
//
//
//			 //Check + button color
//			                 
//			                 String symbolColour = materialPage.materialState.getCssValue("background-color");
//			                 System.out.println("SymbolClour :"+symbolColour );
//			                 String expectedSymbolColour = "rgba(247, 247, 247,1)";
//			                  sa.assertEquals(symbolColour ,expectedSymbolColour);
//			                
//			                  

			                    
			         
			     
			     }
			
	
	}

