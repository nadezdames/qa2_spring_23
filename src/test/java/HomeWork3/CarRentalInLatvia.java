package HomeWork3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// 1. Найти на главное странице лат регион 2. Кликнуть 3. Проверить,что переключилось на лат регион
public class CarRentalInLatvia {

    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@id='onetrust-accept-btn-handler']");
    private final By CHOSE_LANGUAGE = By.xpath("//*[contains(@class, 'choose-language')]");
    private final By LV_LANGUAGE = By.xpath(".//a[@data-iso-code= 'lv']");
    private final By LV_REGION = By.xpath(".//a[text()='Latvija']");
    private final By LV_TEXT = By.xpath(".//h1[text()='Auto noma Latvijā']");

    @Test
    public void confirmLvPage() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.manage().window().maximize();
        chromeBrowser.get("http://www.discovercars.com");

        WebDriverWait wait = new WebDriverWait(chromeBrowser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        chromeBrowser.findElement(ACCEPT_COOKIES_BTN).click();

        wait.until(ExpectedConditions.elementToBeClickable(CHOSE_LANGUAGE));
        chromeBrowser.findElement(CHOSE_LANGUAGE).click();

        wait.until(ExpectedConditions.elementToBeClickable(LV_LANGUAGE));
        chromeBrowser.findElement(LV_LANGUAGE).click();

        Actions actionScroll = new Actions(chromeBrowser);
        actionScroll.scrollByAmount(0, 2000).perform(); // scroll for 2000px
        wait.until(ExpectedConditions.elementToBeClickable(LV_REGION));
        chromeBrowser.findElement(LV_REGION).click();


        if (chromeBrowser.getPageSource().contains("Auto noma Latvijā")) {
            System.out.println("LV text present");
        } else {
            System.out.println("LV text missing");
        }


    }
}
