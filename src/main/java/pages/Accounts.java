package pages;

import com.sun.jna.platform.win32.Advapi32Util;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class Accounts {
    WebDriver driver;

    public Accounts(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.XPATH,using=".//*[@id='utility-nav']/ul/li[1]/a")
    public WebElement lnkAcct;


    // System.out.println(driver.findElement(By.xpath("//*[@id='utility-nav']/ul/li[1]/a/div")).getText());
    //  driver.findElement(By.xpath(".//*[@id='utility-nav']/ul/li[1]/a")).click();
    public void account(){

        lnkAcct.getText();
        System.out.println(lnkAcct.getText());
        lnkAcct.click();

//        System.out.println(driver.findElement(By.xpath("//*[@id='utility-nav']/ul/li[1]/a/div")).getText());
//        driver.findElement(By.xpath(".//*[@id='utility-nav']/ul/li[1]/a")).click();

    }
}
