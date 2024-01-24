package HomeWork3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

// 1. Найти на главное странице список регионов 2. прописать локаторы 3. Вывести к консоль список доступных регионов на главной странице
public class CarRentalInAustria {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@id='onetrust-accept-btn-handler']");
    private final By LIST_OF_COUNTRIES = By.xpath(".//div[@class='tl-box']");

    private final By AUSTRIA = By.xpath(".//a[@href='https://www.discovercars.com/austria']");

    private final By LOCATIONS_IN_TLBOX = By.tagName("a");

    @Test
    public void confirmAustriaPage() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.manage().window().maximize();
        chromeBrowser.get("http://www.discovercars.com");

        WebDriverWait wait = new WebDriverWait(chromeBrowser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        chromeBrowser.findElement(ACCEPT_COOKIES_BTN).click();
////        -------------------------------(просто на память)-------------------------------
//        var listOfCountries = chromeBrowser.findElements(LIST_OF_COUNTRIES);
//        for (int i = 0; i < listOfCountries.size(); i++) {                                 // ++ это увеличение себя на один (0+1 потом 1+1 потом 2+1 и т.д. ; Если 0+1 , тут 0 это позиция на которой мы на данный момент, а 1 это то, на сколько нам надо увеличится, чтоб попасть на след. позицию
//            var country = listOfCountries.get(i);
//            var austria = country.findElements(AUSTRIA);
//
//            if (austria != null)
//                austria.click();
//            country.findElement(AUSTRIA).click();
//        }
////        -------------------------------(просто на память)-------------------------------

//        WebElement austria = chromeBrowser.findElement(AUSTRIA);
//        austria.click();

        List<WebElement> listOfCountries = chromeBrowser.findElements(LIST_OF_COUNTRIES);
        for (WebElement s : listOfCountries) {
           WebElement l = s.findElement(LOCATIONS_IN_TLBOX);
            System.out.println(l.getText());
        }
    }
    //nanana
}
