package epam.testAuto;

import com.epam.web.matcher.testng.Assert;
import epam.testAuto.enums.Log;
import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.Test;

import static epam.testAuto.enums.Colors.GREEN;
import static epam.testAuto.enums.Colors.RED;
import static epam.testAuto.enums.DatesFormEnum.NAME;
import static epam.testAuto.enums.DatesFormEnum.PERIOD;
import static epam.testAuto.enums.Elements.EARTH;
import static epam.testAuto.enums.Elements.WIND;
import static epam.testAuto.enums.Log.BUTTON_CLICKED;
import static epam.testAuto.enums.Log.EARTH_TRUE;
import static epam.testAuto.enums.MainMenu.CONTACT_FORM;
import static epam.testAuto.enums.Numbers.EIGHT;
import static epam.testAuto.enums.Texts.MAIN_TEXT;
import static epam.testAuto.enums.Texts.MAIN_TITLE;
import static epam.testAuto.page_objects.JDIEpamSite.*;

public class ElementsTests extends ExtensionForTests {
    private String[] textLines = {"l1", "l2"};

    //1. Text Area
    // +Button +Log
    @Test
    public void textAreaButtonTest() {
        contactPage.open();
        contactPage.description.inputLines(textLines);
        Assert.arrayEquals(contactPage.description.getLines(), textLines);
        contactPage.contactSubmit.click();
        Assert.contains(actionLog.logActions.getText(0), BUTTON_CLICKED.log);
    }

    //2. Text Field
    @Test
    public void textFieldTest() {
        datesPage.open();
        datesPage.name.sendKeys(NAME.datesFormValue);
        Assert.areEquals(datesPage.name.getText(), NAME.datesFormValue);
    }

    //3. Label
    @Test
    public void lableTest() {
        homePage.open();
        Assert.areEquals(homePage.mainTitle.getText(), MAIN_TITLE.text);
    }

    //4. Menu
    @Test
    public void openContactFormTest() {
        header.headerItems.clickOn(CONTACT_FORM.menuItem.toUpperCase());
        contactPage.checkOpened();
    }

    //5. Text
    @Test
    public void textTest() {
        homePage.open();
        Assert.areEquals(homePage.mainText.getText(), MAIN_TEXT.text);
    }

    //6. CheckBox -??? Why checked == unchecked
    @Test
    public void testCheckBox() {
        differentElementPage.open();
        differentElementPage.elementsCheckBoxes.get(WIND.element).click();
        Assert.isFalse(differentElementPage.elementsCheckBoxes.get(WIND.element).isChecked());
    }

    //7. DataPicker
    @Test
    public void testDataPickerAndFileInput() {
        datesPage.open();
        datesPage.period.sendKeys(PERIOD.datesFormValue);
        datesPage.lastName.clickCenter();
        Assert.areEquals(datesPage.period.getText(), PERIOD.datesFormValue);
    }

    //8. Image(How to do cycle for Image?)
    @Test
    public void imageTest() {
        homePage.open();
        homePage.benefitIcons.get(0).isDisplayed();
        homePage.benefitIcons.get(1).isDisplayed();
        homePage.benefitIcons.get(2).isDisplayed();
        homePage.benefitIcons.get(3).isDisplayed();
    }

    //9.File input - don't understand how to use
    @Test
    public void inputFileTest() {
        //JDIEpamSite.datesPage.open();
        //JDIEpamSite.datesPage.imageInput
    }

    //10.DropDown
    @Test
    public void dropDownTest() {
        differentElementPage.open();
        differentElementPage.colors.select(GREEN.color);
        Assert.areEquals(differentElementPage.colors.getText(), GREEN.color);
    }

    //11.Checklist - Why result is True == is False
    @Test
    public void checkListTest() {
        metalAndColorPage.open();
        metalAndColorPage.elementsCheckBoxes.select(EARTH.element);
        Assert.isFalse(metalAndColorPage.elementsCheckBoxes.isSelected(EARTH.element));
    }

    //12.Combobox - How to work with Combobox?
    @Test
    public void comboBoxTest() {
//JDIEpamSite.metalAndColorPage.open();
//JDIEpamSite.metalAndColorPage.vegetablesComboBox.select(Vegetables.CUCUMBER.vegetables);

    }

    //13.DropList
    @Test
    public void dropListTest() {
        metalAndColorPage.open();
        metalAndColorPage.colorsDropdown.select(RED.color);
        Assert.areEquals(metalAndColorPage.colorsDropdown.getText(), RED.color);
    }

    //14.List<Element>
    @Test
    public void listElementTest() {
        homePage.open();
        Assert.areEquals(homePage.benefitIcons.size(), 4);
        homePage.benefitIcons.get(0).isDisplayed();

    }

    //15.Elements
    @Test
    public void elementsTest() {
        differentElementPage.open();
        differentElementPage.elementsCheckBoxes.setValue(EARTH.element);
        Assert.contains(actionLog.logActions.getText(0), EARTH_TRUE.log);
    }

    //16.Table
    @Test
    public void tableTest() {

    }

    //17.Menu
    @Test
    public void menuTest() {
        leftSiteSection.leftSectionItems.clickOn(CONTACT_FORM.menuItem);
        contactPage.checkOpened();
    }

    //18.RadioButtons - How to check that it's selected-?Override getSelectedAction or place locator to <select> tag
    @Test
    public void radioButtonsTest() {
        metalAndColorPage.open();
        metalAndColorPage.summaryRadioButtonsEven.select(EIGHT);
        Assert.contains(actionLog.logActions.getText(0), Log.EIGHT.log);
    }
}

