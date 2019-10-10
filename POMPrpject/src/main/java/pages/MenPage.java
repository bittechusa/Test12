package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.shared.Shared;


public class MenPage extends LoadableComponent<MenPage>{
WebDriver dr;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[8]/div/div/div/div[1]/div/div[1]/div/a") WebElement watchOption;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[8]/div/div/div/div[1]/div/div[1]/div/a") WebElement cloneOption;
	public MenPage(WebDriver x)
	{
		dr=x;
		PageFactory.initElements(dr, this);
			
	}
	
	
	public WatchPage clickOnWatchOption()
	{
		dr.findElement(By.id("")).click();
		Shared.click(watchOption);
		return new WatchPage(dr);
	}
	public ClonePage clickOncloneOption()
	{
		Shared.click(cloneOption);
		return new ClonePage(dr);
	}


	@Override
	protected void load() {
		// TODO Auto-generated method stub
		dr.navigate().to("https://www.express.com/mens-clothing");
		Header h=new Header(dr);
	}


	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(dr.getCurrentUrl().equals("https://www.express.com/mens-clothing"));
		Header h=new Header(dr);
		h.verifyLink();
		
	}
	

}
