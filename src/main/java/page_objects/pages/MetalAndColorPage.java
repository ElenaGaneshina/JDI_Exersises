package page_objects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.ComboBox;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import enums.Colors;
import enums.Metals;
import enums.Numbers;
import enums.Vegetables;
import org.openqa.selenium.support.FindBy;

public class MetalAndColorPage extends WebPage {


    //radioButtons
    @FindBy(css ="#odds-selector")
    public RadioButtons<Numbers> summaryRadioButtonsOdd;

    @FindBy(xpath = ".//*[@id='even-selector']//label")
    public RadioButtons<Numbers> summaryRadioButtonsEven;

    @FindBy(xpath = "//*[text()='Calculate']")
    public IButton calculateBtn;

    @FindBy(css ="#elements-checklist>p" )
    public CheckList<enums.Elements>  elementsCheckBoxes;

    @FindBy(xpath = ".//*[@id='salad-dropdown']//li")
    public ComboBox<Vegetables> vegetablesComboBox;

    @JDropdown(
            root =  @FindBy(css = "#metals-combobox"),
            //value = @FindBy(css = ""),
            list = @FindBy(tagName = "option" )
    )
    public IDropDown<Metals> metalsDropdown;

    @JDropdown(
            root =  @FindBy(css = ".colors"),
            value = @FindBy(css = ".filter-option"),
            list = @FindBy(tagName = "li" )
    )
    public IDropDown<Colors> colorsDropdown;


}
