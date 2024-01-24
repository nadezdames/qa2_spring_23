package pages;

import model.InputData;

public class SubmitPage {
    private final String NAME_INPUT = "TestTostTast";
    private final String PASSWORD_INPUT = "Password1234";

    private BaseFunc baseFunc;              // После написания этой строки конструктор (ниже) можно сгенерить автоматически

    public SubmitPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

}
