import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Kohls{

        public static void main(String rags[]) throws Exception{

            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver.exe");

            WebDriver driver = new ChromeDriver();


            driver.get("https://www.kohls.com/");

            String Str = (driver.getTitle());
            System.out.println("String=" +Str);

            Thread.sleep(5000);

            WebElement element = driver.findElement(By.id("search"));

            element.sendKeys("Womens shirts");

            element.sendKeys(Keys.ENTER);

            Thread.sleep(10000);

            System.out.println(driver.findElement(By.xpath("//*[@id='utility-nav']/ul/li[1]/a/div")).getText());
            driver.findElement(By.xpath(".//*[@id='utility-nav']/ul/li[1]/a")).click();

        }


    }

