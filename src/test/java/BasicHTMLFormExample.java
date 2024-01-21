import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasicHTMLFormExample {
    private final By USERNAME_FIELD = By.xpath(".//input[@name='username']");
    private final String NAME_INPUT = "TestTostTast";
    private final By SUBMITTED_USER_NAME = By.id("_valueusername");
    private final By PASSWORD_FIELD = By.xpath(".//input[@name='password']");
    private final String PASSWORD_INPUT = "Password1234";
    private final By SUBMITTED_PASSWORD = By.id("_valuepassword");

//    private final By TEXTAREA_FIELD = By.xpath(".//textarea[@name='comments']");
//    private final By CHECKBOX_ITEMS_FIELD = By.xpath(".//input[@type='checkbox']");
//    private final By RADIO_ITEMS_FIELD = By.xpath(".//input[@type='radio']");
    private final By DROPDOWN_FIELD = By.xpath(".//select[@name='dropdown']");
    private final String DROPDOWN_VALUE = "dd3";
    private final By SUBMIT_BTN = By.xpath(".//input[@value='submit']");
    private final String URL = "https://testpages.eviltester.com/styled/basic-html-form-test.html";

//    private final String DEPARTURE_AIRPORT = "Tallina (TLL)";

    @Test
    public void reservationCheck() {
        // Open browser
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        //Open webpage
        browser.get(URL);

//        // Accept Cookies btn
//        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(4));
//        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
//        browser.findElement(ACCEPT_COOKIES_BTN).click();

        // Enter Username
        WebElement nameInputField = browser.findElement(USERNAME_FIELD);
        nameInputField.clear();
        nameInputField.sendKeys(NAME_INPUT);
//        browser.findElement(USERNAME_FIELD).sendKeys("My Last Name"); // Хардкодят только говнари

        // Enter Password
        WebElement passwordInputField = browser.findElement(PASSWORD_FIELD);
        passwordInputField.clear();
        passwordInputField.sendKeys(PASSWORD_INPUT);

        // Select value
        WebElement fromDropdown = browser.findElement(DROPDOWN_FIELD);
        Select fromSelect = new Select(fromDropdown);
        fromSelect.selectByValue(DROPDOWN_VALUE);

        //Press Submit btn
        browser.findElement(SUBMIT_BTN).click();

        // Check Username
//        List<WebElement> selectedUsername = browser.findElements(SUBMITTED_USER_NAME);  // Если работаем со списком
//        System.out.println("First Name: " + selectedUsername.get(0).getText());         // Если работаем со списком
//        System.out.println("First Name: " + selectedUsername.get(1).getText());         // Если работаем со списком
        WebElement usernameCheck = browser.findElement(SUBMITTED_USER_NAME);
        String usernameCheckText = usernameCheck.getText();

        WebElement passwordCheck = browser.findElement(SUBMITTED_PASSWORD);
        String passwordCheckText = passwordCheck.getText();

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.numberOfElementsToBe(SUBMITTED_USER_NAME,1));
        wait.until(ExpectedConditions.numberOfElementsToBe(SUBMITTED_PASSWORD,1));

        // Assertion
        Assertions.assertEquals(NAME_INPUT, usernameCheckText, "Wrong values! >> ");
//        if (usernameCheckText.equals(NAME_INPUT)) {
//            System.out.println("Text is the same! Before: " + NAME_INPUT + " >> After: " + usernameCheckText + ". Good Job! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
//        }
//        else {
//            System.out.println("Text is different! Before: " + NAME_INPUT + " >> After: " + usernameCheckText);
//        }
        Assertions.assertEquals(PASSWORD_INPUT, passwordCheckText, "Wrong values! >> ");

//        // Assertion (wrong values) // if AND else >> useless
//        Assertions.assertEquals(NAME_INPUT, passwordCheckText, "Text is different! Before: " + NAME_INPUT + " >> After: " + passwordCheckText);

    }
}
