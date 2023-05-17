package homeWork2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsFor1A {
    private final By COOKIE_BTN = By.xpath(".//a[@class='c-button']");
    private final By GOODS_RECEIPT_POINTS = By.xpath(".//i[@class='icon-svg icon-location site-top__menu-right-icon']");
    private final By LV_LANGUAGE_BTN = By.xpath(".//a[@hreflang='lv']");
    private final By RU_LANGUAGE_BTN = By.xpath(".//a[@hreflang='ru']");
    private final By LOGO = By.className("main-logo");
    private final By SEARCH_BTN = By.className("main-search-submit");
    private final By CART_BTN = By.xpath(".//div[@class='cart-block']");
    private final By GIFT_ICON = By.xpath(".//img[contains(@src, 'gift')]");
    private final By LEFT_MENU = By.xpath(".//a[@href='#menu']");


    @Test
    public void homeWorkLocators() {
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.get("http://www.1a.lv/");
        chromeBrowser.manage().window().maximize();

        chromeBrowser.findElement(COOKIE_BTN).click();
//        chromeBrowser.findElement(GOODS_RECEIPT_POINTS).click();
//        chromeBrowser.findElement(LV_LANGUAGE_BTN).click();
//        chromeBrowser.findElement(RU_LANGUAGE_BTN).click();
//        chromeBrowser.findElement(LOGO).click();
//        chromeBrowser.findElement(SEARCH_BTN).click();
//        chromeBrowser.findElement(CART_BTN).click();
//        chromeBrowser.findElement(GIFT_ICON).click();
//        chromeBrowser.findElement(LEFT_MENU).click();
    }
}
