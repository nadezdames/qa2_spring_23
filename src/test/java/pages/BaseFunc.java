package pages;

import model.InputData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseFunc {
    // Конструктор выполняется принудительно в момент создания экземпляра объекта.
    // Конструктор - это метод содержимое которого выполняется в обязательном порядке при создании экземпляра объект
    // Конструктор всегда public. Никогда ничего не возвращает. Называется так же как класс
    // В конструкторе то, что должно быть выполнено ОБЯЗАТЕЛЬНО (например открытие браузерного окна)
    private WebDriver browser;
    private WebDriverWait wait;

    public BaseFunc() {
        // Расхлопываю окно
        browser = new ChromeDriver();                 // Переменная, которая создается внутри метода ( внутри {} ) принадлежит ТОЛЬКО этому методу и весь класс о ней не знает
        browser.manage().window().maximize();

        // Генерирую ожидание
        wait = new WebDriverWait(browser, Duration.ofSeconds(4));
    }

    public void openURL(String url) {                   // openURL - это метод/функция это блок кода который выполняет определенную задачу. У него есть область видимости (public/private),
                                                        // возвращаемый тип (void) и входящие параметры (String firstParam, int secondParam, boolean thirdParam)

//        //if TRUE
//        if (url.startsWith("http://") || url.startsWith("https://")) {        // logical operators: AND (&&) and OR (||)
//                                                                              // тут пусто - а так не принято! Ниже будет правильный if
//        } else {
//        //if FALSE
//            url = "http://" + url;
//        }

//        // еще один вариант написания:
//        if (url.startsWith("http://") == false && url.startsWith("https://") == false) {
//            url = "http://" + url;
//        }

        if (!url.startsWith("http://") && !url.startsWith("https://")) {    // logical operators: AND (&&) and OR (||)
            url = "http://" + url;
        }

        browser.get(url);
    }

    public WebElement findMyElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return browser.findElement(locator);
    }

    public void type(By locator, String text) {
        WebElement inputField = findMyElement(locator);
        inputField.clear();
        inputField.sendKeys(text);
    }

    public void type(By locator, int text) {
        type(locator, String.valueOf(text));
    }

    public void selectByValue(By locator, String value) {
        Select select = new Select(findMyElement(locator));
        select.selectByValue(value);
    }

    public void selectByText(By locator, String text) {
        Select select = new Select(findMyElement(locator));
        select.selectByVisibleText(text);
    }

    public String getText(By locator) {
        WebElement submittedValue = findMyElement(locator);
        String submittedText = submittedValue.getText();
        return submittedText;
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    //    Если надо работать только с ОДНИМ Checkbox-ом
//    public void getFromTheList(By locator, int index) {
//        List<WebElement> list = browser.findElements(locator);                        // создали лист WebElement-ов и назвали его list
//        for (WebElement oneElement : list) {                                          // для каждого WebElement-а (которое обозвали oneElement) из списка list выполняем то,что в {} скобках
//            if (oneElement.isSelected()) {                                            // ЕСЛИ (if) oneElement выбран (isSelected), ТО (далее в {} скобках) !!Это надо сделать,чтоб снять галочку, если она уже стоит. Метод clear не работает
//                oneElement.click();                                                   // ТО oneElement надо нажать (метод click)
//            }
//        }
//        list.get(index).click();                                                      // берем из list-а элемент по индексу и кликаем
//    }

    //    Если надо работать с ОДНИМ или НЕСКОЛЬКИМИ Checkbox-ами
    public void selectFromTheCheckboxList(By locator, int[] indexes) {                             // By locator -> (это общий локатор для всех элементов из листа), int[] -> создали массив, чтоб можно было передать один ИЛИ несколько индексов, indexes -> дали имя массиву данных
        List<WebElement> list = browser.findElements(locator);
        for (WebElement oneCheckboxElement : list) {
            if (oneCheckboxElement.isSelected()) {
                oneCheckboxElement.click();
            }
        }
        for (int index : indexes) {
            list.get(index).click();
        }
    }

    public void selectFromTheRadioList(By locator, int index) {
        List<WebElement> list = browser.findElements(locator);
        for (WebElement oneRadioElement : list) {
        }
        list.get(index).click();
    }

    public void uploadFile(By locator, String path) {
        WebElement uploadSomeFile = findMyElement(locator);
        uploadSomeFile.sendKeys(path);
    }
}
