package epam.testAuto.page_objects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.Elements;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.web.matcher.testng.Assert;
import org.openqa.selenium.support.Colors;
import org.openqa.selenium.support.FindBy;
import epam.testAuto.page_objects.sections.ActionLog;
import epam.testAuto.page_objects.sections.Paginator;
import ru.yandex.qatools.allure.annotations.Step;

public class DifferentElementPage extends WebPage {

    //checkboxes for Elements
    @FindBy(css = ".label-checkbox")
    public Elements<CheckBox> elementsCheckBoxes;

    //RadioButton for Metals
    @FindBy(css = ".label-radio")
    public RadioButtons metalRadioButtons;

    //DDL for colors
    @FindBy(css = "select.uui-form-element")
    public IDropDown<Colors> colors;

    @FindBy(xpath = "*//button[text()='Default Button']")
    public IButton defaultButton;

    @FindBy(xpath = "*//button[text()='Button']")
    public IButton button;

    public Paginator paginator;

    public ActionLog actionLog;

    @Step("Assert Log")
    public void checkLog(String logValue){
     Assert.contains(actionLog.logActions.getTextList().toString(), logValue);
    }
}


