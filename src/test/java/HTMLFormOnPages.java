import model.InputData;
import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;

public class HTMLFormOnPages {
    private final String URL = "testpages.eviltester.com/styled/basic-html-form-test.html"; // без https://
    private final String DROPDOWN_VALUE = "dd3";
    private InputData info = new InputData("Lalalala", "BUBUBU", 1234567890);

    @Test
    public void successCheck () {               // successCheck - это метод
        BaseFunc baseFunc = new BaseFunc();     // baseFunc (объект) называется так же как класс baseFunc.
                                                // baseFunc (объект) это объект в котором содержится public функционал класса baseFunc
        baseFunc.openURL(URL);

//        // Если переменная (private final String URL) находилась бы в другом классе:
//        HomePage homepagEEE = new HomePage();   // Так происходит инициализация (что делают эти строки) >>
//                                                // HomePage -- название класса с которым работаю
//                                                // homepagEEE -- даю имя/уникальное название переменной
//                                                // new HomePage() -- этой записью мы говорим, что в этой переменной будет содержаться новая инстанция класса HomePage
//
//        baseFunc.openURL(homepagEEE.URL_TWO);   // Что делает эта строка >>
//                                                // Из класса BaseFunc, к которому мы обратились через baseFunc (объект), мы вызываем метод/функцию openURL
//                                                // Затем в метод/функцию openURL передаем параметр URL_TWO из класса HomePage к которому обратились через переменную homepagEEE

        HomePage homePage = new HomePage(baseFunc);
        homePage.fillInData(info);
        homePage.selectValueForDropdown(DROPDOWN_VALUE);
        homePage.clickSubmitBtn();

    }
}
