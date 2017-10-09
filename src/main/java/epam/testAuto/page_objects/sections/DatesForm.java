package epam.testAuto.page_objects.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import epam.testAuto.entities.DatesPageEntity;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatesForm extends Form<DatesPageEntity>{
    @FindBy(css= "#Name")
    private TextField name;

    @FindBy(css= "#LastName")
    private TextField lastName;

    @FindBy(css= "#Description")
    private TextArea description;

    @FindBy(css= ".date.uui-datepicker>input")
    private DatePicker period;

    @FindBy(css= ".uui-button.dark-blue.m-t35")
    private Button submit;

    @FindBy(xpath = ".//*[@id='timepicker']")
    private TextField time;

    @FindBy(xpath = "//div[@class='range-from overflow']//input[2]")
    private TextField rightRange1;

    @FindBy(xpath = "//div[@class='range-from overflow']//input[1]")
    private TextField leftRange1;

    //SLIDER MOVING IMPLEMENTATION

    @FindBy(css = ".uui-slider.blue a:nth-child(1)")
    private Link leftSliderHandle;

    @FindBy(css = ".uui-slider.blue a:nth-child(3)")
    private Link rightSliderHandle;

    //Width of slider
    @FindBy(css = ".uui-slider.blue")
    private WebElement slider;

    //Numbers on left and right sliders
    @FindBy(css = ".uui-slider.blue a:nth-child(1)>span")
    private Label leftSliderValue;

    @FindBy(css = ".uui-slider.blue a:nth-child(3)>span")
    private Label rightSliderValue;

    public void moveSlider(int leftPosition, int rightPosition, char side) {

        //JS for scroll web page down
        JavascriptExecutor js;
        if (getDriver() instanceof JavascriptExecutor) {
            ((JavascriptExecutor) getDriver()).executeScript("scroll(0, 250)");}


        int widthSlider = slider.getSize().getWidth();
        if (side == 'R') {
            rightSliderHandle.dragAndDropBy((rightPosition - 1) * widthSlider / 100, 0);
            leftSliderHandle.dragAndDropBy((leftPosition - 1) * widthSlider / 100, 0);

        } else {
            leftSliderHandle.dragAndDropBy((leftPosition - 1) * widthSlider / 100, 0);
            rightSliderHandle.dragAndDropBy((rightPosition - 1) * widthSlider / 100, 0);
        }}

        public void checkValuesOnSlider(int left, int right){
            leftSliderValue.getText().compareTo(String.valueOf(left));
            rightSliderValue.getText().compareTo(String.valueOf(right));
        }

}
