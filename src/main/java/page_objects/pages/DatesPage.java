package page_objects.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

public class DatesPage extends WebPage {

    @FindBy(css= "#Name")
    public TextField name;

    @FindBy(css= "#LastName")
    public TextField lastName;

    @FindBy(css= "#Description")
    public TextArea description;

    @FindBy(css= ".date.uui-datepicker>input")
    public DatePicker period;

    @FindBy(css= ".fa.fa-upload")
    public FileInput imageInput;

    @FindBy(css= ".uui-button.dark-blue.m-t35")
    public Button submit;

    @FindBy(css = ".filename")
    public Label fileUploadedLabel;
    //Time
    //Range 1
    //Range 2
    //Pagination
}
