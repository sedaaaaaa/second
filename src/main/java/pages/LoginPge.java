package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPge {
	
	
	WebDriver driver;
	
	public LoginPge() {
		this.driver=driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement UseRname_element;

	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement paSSword_element;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement signin_element;

	public void enter_usernamee(String usernamee) {
		System.out.println("lgnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
		UseRname_element.sendKeys(usernamee);
		
		
	}
	public void enter_password(String passwordd ) {
		paSSword_element.sendKeys(passwordd);
	}

	public void clck_sgnin() {
		signin_element.click();
	}
//	sdsfgyuhdisJODKpl[;[fghplgjokhhpglfdsa

}
