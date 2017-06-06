import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by zhenqingzhao on 6/6/17.
 */
public class GoogleDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.google.com");
        webDriver.findElement(By.id("olpOfferList"));
    }
}
