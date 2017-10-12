package epam.testAuto.page_objects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.ComboBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JComboBox;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import epam.testAuto.enums.Colors;
import epam.testAuto.enums.Elements;
import epam.testAuto.enums.Numbers;
import epam.testAuto.enums.Vegetables;
import org.openqa.selenium.support.FindBy;

public class MetalAndColorPage extends WebPage {

    //radioButtons
    @FindBy(xpath =".//*[@id='odds-selector']//label")
    public RadioButtons<Numbers> summaryRadioButtonsOdd;

    @FindBy(xpath = ".//*[@id='even-selector']//label")
    public RadioButtons<Numbers> summaryRadioButtonsEven;

    @FindBy(xpath = "//button[@id='calculate-button']")
    public IButton calculateBtn;

    @FindBy(css ="#elements-checklist>p" )
    public CheckList<Elements>  elementsCheckBoxes;

    @FindBy(xpath = ".//*[@id='salad-dropdown']//li")
    public CheckList<Vegetables> vegetablesCheckList;

    @FindBy(id = "salad-dropdown")
    public Label vegetablesLable;

    @FindBy(id="submit-button")
    public Button submitBtn;

    @JComboBox(
            root = @JFindBy(css = ".metals"),
            list = @JFindBy(tagName = "li"),
            value = @JFindBy(css = ".filter-option"),
            expand = @JFindBy(css = ".caret") )
    public ComboBox metalsComboBox;

    @JDropdown(
            root =  @FindBy(css = ".colors"),
            value = @FindBy(css = ".filter-option"),
            list = @FindBy(tagName = "li" )
    )
    public IDropDown<Colors> colorsDropdown;


}
