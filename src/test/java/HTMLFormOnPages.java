import model.InputData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;
import pages.SubmitPage;

public class HTMLFormOnPages {
    private final String URL = "testpages.eviltester.com/styled/basic-html-form-test.html"; // без https://
    private final String DROPDOWN_VALUE = "dd3";
    private InputData inputData = new InputData("Lalalala", "BUBUBU", 1234567890, "C:/Users/neDju/Desktop/Nadja.png");

    @Test
    public void successCheck() {               // successCheck - это метод
        BaseFunc baseFunc = new BaseFunc();     // baseFunc (объект) называется так же как класс baseFunc.
        // baseFunc (объект) это объект в котором содержится public функционал класса baseFunc
        baseFunc.openURL(URL);

        SubmitPage submitPage = new SubmitPage(baseFunc);

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
        homePage.fillInData(inputData);
        homePage.uploadFile(inputData.getFILE_DIRECTORY_FROM_INPUT_DATA());
//        homePage.clickOnCheckbox(1);              //    Если надо работать только с ОДНИМ Checkbox-ом
        homePage.clickOnCheckbox(new int[]{1, 2});  //    Если надо работать с ОДНИМ или НЕСКОЛЬКИМИ Checkbox-ами
        homePage.clickOnRadio(1);
        homePage.selectValueForDropdown(DROPDOWN_VALUE);
        homePage.clickSubmitBtn();


        Assertions.assertEquals(inputData.getNAME_INPUT_FROM_INPUT_DATA(), baseFunc.getText(submitPage.SUBMITTED_USER_NAME));
        Assertions.assertEquals(inputData.getPASSWORD_INPUT_FROM_INPUT_DATA(), baseFunc.getText(submitPage.SUBMITTED_PASSWORD));
        Assertions.assertEquals(String.valueOf(inputData.getCOMMENTS_INPUT_FROM_INPUT_DATA()), baseFunc.getText(submitPage.SUBMITTED_COMMENTS));
//        The java string valueOf() method converts different types of values into string.
//        Java String valueOf() method example:
//        public class StringValueOfExample{
//            public static void main(String args[]){
//                int value=30;
//                String sososo=String.valueOf(value);
//                System.out.println(sososo); // благодаря  String.valueOf() String теперь int
//            }}

    }
}
