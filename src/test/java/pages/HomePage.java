package pages;

import model.InputData;
import org.openqa.selenium.By;

public class HomePage {
    //    public final String URL_TWO = "testpages.eviltester.com/styled/basic-html-form-test.html"; // без https:// ДЛЯ ПРИМЕРА, чтоб вызвать в другом классе
    private final By USERNAME_FIELD = By.xpath(".//input[@name='username']");
    private final By PASSWORD_FIELD = By.xpath(".//input[@name='password']");
    private final By TEXT_AREA_FIELD = By.xpath(".//textarea[@name='comments']");
//    private final String NAME_INPUT = "TestTostTast";
//    private final String PASSWORD_INPUT = "Password1234";
//    private final int COMMENTS_INPUT = 123123123;
    private final By DROPDOWN_FIELD = By.xpath(".//select[@name='dropdown']");
    private final By SUBMIT_BTN = By.xpath(".//input[@value='submit']");

    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    private InputData inputData;

    public HomePage(InputData inputData) {
        this.inputData = inputData;
    }

    public void fillInData(InputData inputData) {                                           //  в fillInData() в скобках есть возможность указать входные параметры через запятую.
                                                                                            // Например: (String firstName, String lastName, int vatNumber)
                                                                                            // Но есть строк для заполнения много в тесте -- этого лучше не делать, а создать отдельный объект и передать его
        baseFunc.type(USERNAME_FIELD, inputData.getNAME_INPUT_FROM_INPUT_DATA());
        baseFunc.type(PASSWORD_FIELD, inputData.getPASSWORD_INPUT_FROM_INPUT_DATA());
        baseFunc.type(TEXT_AREA_FIELD, inputData.getCOMMENTS_INPUT_FROM_INPUT_DATA());
    }

    public void selectValueForDropdown(String dropdownValue) {
        baseFunc.selectByValue(DROPDOWN_FIELD, dropdownValue);
    }

    public void clickSubmitBtn() {
        baseFunc.click(SUBMIT_BTN);
    }
}
