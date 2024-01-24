import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstSeleniumTest {

    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@id = 'onetrust-accept-btn-handler']");

    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe"); // 1. Определить версию хрома на компе 2. Скачать chromedriver под эту версию 3. Закинуть архив на комп и из архива перенести .ехе фаил на диск С:// например 4. System.setProperty указываем адрес драйвера
        WebDriver browser = new ChromeDriver(); // WebDriver является частью библиотеки Selenium и отвечает за БРАУЗЕРНОЕ ОКНО. new ChromeDriver (new FirefoxDriver) - это новое браузерное окно
        browser.manage().window().maximize(); // расхлопнуть браузерное окно
        browser.get("http://www.discovercars.com"); // метод get() вводит в нашу браузерную строку конкретный адрес и нажимает Enter

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10)); // сконфигурировали ожидание

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN)); // ждем, когда элемент станет кликабельный

        browser.findElement(ACCEPT_COOKIES_BTN).click(); //открыть браузер > найти кнопку ACCEPT_COOKIES > нажать на нее

    }
}
