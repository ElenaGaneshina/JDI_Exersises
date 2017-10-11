package epam.testAuto.page_objects.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;
import epam.testAuto.page_objects.sections.DatesForm;
import epam.testAuto.page_objects.sections.ResultLogOfDatesPage;

public class DatesPage extends WebPage {
    //Section
    @FindBy(css = ".main-content")
    public DatesForm datesForm;

    @FindBy(css =".results")
    public ResultLogOfDatesPage resultLog;

    //Maybe not need

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

    @FindBy(xpath = ".//*[@id='timepicker']")
    public TextField time;

    @FindBy(xpath = "//div[@class='range-from overflow']//input[2]")
    public TextField rightRange1;

    @FindBy(xpath = "//div[@class='range-from overflow']//input[1]")
    public TextField leftRange1;

    //Pagination
    //Range 2
}
