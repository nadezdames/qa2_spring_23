package pages;

import model.InputData;
import org.openqa.selenium.By;

public class HomePage {
    //    public final String URL_TWO = "testpages.eviltester.com/styled/basic-html-form-test.html"; // без https:// ДЛЯ ПРИМЕРА, чтоб вызвать в другом классе
    private final By USERNAME_FIELD = By.xpath(".//input[@name='username']");
    private final By PASSWORD_FIELD = By.xpath(".//input[@name='password']");
    private final By TEXT_AREA_FIELD = By.xpath(".//textarea[@name='comments']");
    private final By FILENAME_FIELD = By.xpath(".//input[@type='file']");
    private final By CHECKBOX_ITEMS_FIELD = By.xpath(".//input[@type='checkbox']");
    private final By RADIO_ITEMS_FIELD = By.xpath(".//input[@type='radio']");
    private final By DROPDOWN_FIELD = By.xpath(".//select[@name='dropdown']");
    private final By SUBMIT_BTN = By.xpath(".//input[@value='submit']");

    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void fillInData(InputData inputData) {                                           //  в fillInData() в скобках есть возможность указать входные параметры через запятую.
                                                                                            // Например: (String firstName, String lastName, int vatNumber)
                                                                                            // Но есть строк для заполнения много в тесте -- этого лучше не делать, а создать отдельный объект и передать его
        baseFunc.type(USERNAME_FIELD, inputData.getNAME_INPUT_FROM_INPUT_DATA());
        baseFunc.type(PASSWORD_FIELD, inputData.getPASSWORD_INPUT_FROM_INPUT_DATA());
        baseFunc.type(TEXT_AREA_FIELD, inputData.getCOMMENTS_INPUT_FROM_INPUT_DATA());
    }

    public void uploadFile(String path) {
        baseFunc.uploadFile(FILENAME_FIELD, path);
    }

//    Если надо работать только с ОДНИМ Checkbox-ом
//    public void clickOnCheckbox(int index) {
//        baseFunc.getFromTheList(CHECKBOX_ITEMS_FIELD, index);
//    }

    public void clickOnCheckbox(int[] indexes) {                        //    Если надо работать с ОДНИМ или НЕСКОЛЬКИМИ Checkbox-ами
        baseFunc.selectFromTheCheckboxList(CHECKBOX_ITEMS_FIELD, indexes);
    }

    public void clickOnRadio(int index) {
        baseFunc.selectFromTheRadioList(RADIO_ITEMS_FIELD,index);
    }

    public void selectValueForDropdown(String dropdownValue) {
        baseFunc.selectByValue(DROPDOWN_FIELD, dropdownValue);
    }

    public void clickSubmitBtn() {
        baseFunc.click(SUBMIT_BTN);
    }

}
