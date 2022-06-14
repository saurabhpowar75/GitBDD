package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch 
{
		public WebDriver ldriver;

		public ProductSearch(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
		
		
		@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
		WebElement tx_searchbtn;
		
		
		@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
		WebElement enterproductname;
		
		@FindBy(xpath="//a[contains(text(),'realme Buds 2 Wired Headset')]")
		WebElement btn_clickproduct;


			
			
		 public void searchProduct()
		 {
			 tx_searchbtn.click();
		 }

		
		
		
			public void enterProduct(String productName)
			{
				enterproductname.sendKeys(productName+Keys.ENTER);
			}
		
			
			
			public void clickonProduct()
			{
				btn_clickproduct.click();
			}

			
			
			
			
			
			
		}