package HomeWork4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonBooks {
// 1. Перейти на amazon.de
// 2. Вкладка Best Sellers
// 3. Слева выбираем Books
// 4. Запоминаем кол-во закрашенных звезд и комментариев у четвертой книги
// 5. Перехдим на отзывы по этой книге
// 6. Сравниваем звезды и комменты
// 7. Все комментарии посчитать, убедиться, что кол-во правильное

    private final By ACCEPT_COOKIES_BTN = By.xpath(".//input[@id='sp-cc-accept']");
    private final By CONTINUE_LV_REGION = By.xpath(".//input[@data-action-type='DISMISS']");
    private final By MAIN_PAGE_CONTAINER = By.xpath(".//div[@id='nav-xshop']");
    private final By MAIN_PAGE_CONTAINER_BEST_SELLERS = By.xpath(".//a[contains(@href, 'bestsellers')]");
    private final By BEST_SELLERS_LEFT_CONTAINER = By.xpath(".//div[@role='group']");
    private final By BOOKS_SECTION = By.xpath(".//a[contains(@href, 'books')]");
    private final By BOOK_TOP_FOUR = By.xpath(".//div[@id='p13n-asin-index-3']");
    private final By STARS_INNER_CONTAINER = By.xpath(".//i[contains(@class, 'star-small')]");
    //    private final By STARS_INNER_CONTAINER = By.tagName("i");
    private final By STARS_TITLE = By.xpath(".//a[contains(@title, 'stars')]");

    private final By STARS_ON_PREVIEW = By.xpath(".//span[@class='a-icon-alt']");
    private final By COMMENTS_ON_PREVIEW = By.xpath(".//span[@class='a-size-small']");

    @Test
    public void amazonDe() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.manage().window().maximize();
        chromeBrowser.get("http://www.amazon.de");

        WebDriverWait wait = new WebDriverWait(chromeBrowser, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        chromeBrowser.findElement(ACCEPT_COOKIES_BTN).click();

        wait.until(ExpectedConditions.elementToBeClickable(CONTINUE_LV_REGION));
        chromeBrowser.findElement(CONTINUE_LV_REGION).click();

        List<WebElement> mainPageContainer = chromeBrowser.findElements(MAIN_PAGE_CONTAINER);
        for (WebElement s : mainPageContainer) {
            WebElement l = s.findElement(MAIN_PAGE_CONTAINER_BEST_SELLERS);
//            System.out.println(l.getText());  // просто проверОчка на элемент
            l.click();
            break; // выйти из цикла
        }

        List<WebElement> leftSideContainer = chromeBrowser.findElements(BEST_SELLERS_LEFT_CONTAINER);
        for (WebElement s : leftSideContainer) {
            WebElement l = s.findElement(BOOKS_SECTION);
//            System.out.println(l.getText());
            l.click();
        }

        List<WebElement> starsOnTopPage = chromeBrowser.findElements(BOOK_TOP_FOUR);
        for (WebElement s : starsOnTopPage) {
            WebElement l = s.findElement(STARS_TITLE);
            String starsOnPreview = l.getAttribute("title");
            System.out.println(starsOnPreview);
        }
        List<WebElement> commentsOnTopPage = chromeBrowser.findElements(BOOK_TOP_FOUR);
        for (WebElement s : commentsOnTopPage) {
            WebElement l = s.findElement(COMMENTS_ON_PREVIEW);
            System.out.println(l.getText());
        }

//        @AfterEach
//        public void closeBrowser () {
//            chromeBrowser.quit();
//        }
    }
}