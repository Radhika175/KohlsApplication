package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

 public class Homepage {

        WebDriver driver;

        public Homepage(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }


        @FindBy(how= How.ID,using="search")
        private WebElement searchBox;



        public void search(String keyword){
            searchBox.sendKeys(keyword);
            searchBox.sendKeys(Keys.ENTER);
        }

    }

