package pages;

import model.InputData;
import org.openqa.selenium.By;

public class SubmitPage {

    public final By SUBMITTED_USER_NAME = By.id("_valueusername");
    public final By SUBMITTED_PASSWORD = By.id("_valuepassword");
    public final By SUBMITTED_COMMENTS = By.id("_valuecomments");
    public final By SUBMITTED_FILE = By.id("_valuefilename");

    private BaseFunc baseFunc;              // После написания этой строки конструктор (ниже) можно сгенерить автоматически

    public SubmitPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

}
