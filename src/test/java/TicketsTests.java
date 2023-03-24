import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TicketsTests {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");

    private WebDriver chromeBrowser;
    private WebDriverWait wait;

    @Test
    public void reservationCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        chromeBrowser = new ChromeDriver();
        chromeBrowser.manage().window().maximize();
        chromeBrowser.get("http://www.qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(chromeBrowser, Duration.ofSeconds(5));

//        Select airportFrom = new Select(chromeBrowser.findElement(FROM));
//        airportFrom.selectByValue("RIX");

        select(FROM, "RIX");
        select(FROM, "SFO");

//        Select airportTo = new Select(chromeBrowser.findElement(TO));
//        airportTo.selectByValue("SFO");

        chromeBrowser.findElement(GO_BTN).click();

        chromeBrowser.findElement(FIRST_NAME).clear();
        chromeBrowser.findElement(FIRST_NAME).sendKeys("My First Name");

        chromeBrowser.findElement(LAST_NAME).clear();
        chromeBrowser.findElement(LAST_NAME).sendKeys("My Last Name");
    }

    private void select(By locator, String value) {      // В select мы передаем ПО КАКОМУ локатору будем работать, и КАКОЕ значение передадим
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    private void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }
}
