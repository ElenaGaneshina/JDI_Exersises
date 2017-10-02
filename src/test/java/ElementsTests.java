import com.epam.web.matcher.testng.Assert;
import enums.Colors;
import enums.Elements;
import enums.MainMenu;
import enums.Numbers;
import org.testng.annotations.Test;

public class ElementsTests extends ExtensionForTests {
    private String[] textLines = {"l1", "l2"};

    //1. Text Area
    // +Button +Log
    @Test
    public void textAreaButtonTest() {
        JDIEpamSite.contactPage.open();
        JDIEpamSite.contactPage.description.inputLines(textLines);
        Assert.arrayEquals(JDIEpamSite.contactPage.description.getLines(), textLines);
        JDIEpamSite.contactPage.contactSubmit.click();
        Assert.contains(JDIEpamSite.actionsLog.getText(0), "button clicked");

    }

    //2. Text Field
    @Test
    public void textFieldTest() {
        JDIEpamSite.datesPage.open();
        JDIEpamSite.datesPage.name.sendKeys("Elena");
        Assert.areEquals(JDIEpamSite.datesPage.name.getText(), "Elena");
    }

    //3. Label
    @Test
    public void lableTest() {
        JDIEpamSite.homePage.open();
        Assert.areEquals(JDIEpamSite.homePage.mainTitle.getText(), "EPAM FRAMEWORK WISHES…");
    }

    //4. Menu
    @Test
    public void openContactFormTest() {
        JDIEpamSite.header.headerItems.clickOn(MainMenu.CONTACT_FORM.menuItem.toUpperCase());
        JDIEpamSite.contactPage.checkOpened();
    }

    //5. Text
    @Test
    public void textTest() {
        JDIEpamSite.homePage.open();
        Assert.areEquals(JDIEpamSite.homePage.mainText.getText(), "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");
    }

    //6. CheckBox -??? Why checked == unchecked
    @Test
    public void testCheckBox() {
        JDIEpamSite.differentElementPage.open();
        JDIEpamSite.differentElementPage.elementsCheckBoxes.get(Elements.WIND.element).click();
        Assert.isFalse(JDIEpamSite.differentElementPage.elementsCheckBoxes.get(Elements.WIND.element).isChecked());
    }

    //7. DataPicker
    @Test
    public void testDataPickerAndFileInput() {
        JDIEpamSite.datesPage.open();
        JDIEpamSite.datesPage.period.sendKeys("09/29/2017");
        JDIEpamSite.datesPage.lastName.clickCenter();
        Assert.areEquals(JDIEpamSite.datesPage.period.getText(), "09/29/2017");
    }

    //8. Image(How to do cycle for Image?)
    @Test
    public void imageTest() {
        JDIEpamSite.homePage.checkOpened();
        JDIEpamSite.homePage.benefitIcons.get(0).isDisplayed();
        JDIEpamSite.homePage.benefitIcons.get(1).isDisplayed();
        JDIEpamSite.homePage.benefitIcons.get(2).isDisplayed();
        JDIEpamSite.homePage.benefitIcons.get(3).isDisplayed();
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
        JDIEpamSite.differentElementPage.open();
        JDIEpamSite.differentElementPage.colors.select(enums.Colors.GREEN.color);
        Assert.areEquals(JDIEpamSite.differentElementPage.colors.getText(), Colors.GREEN.color);
    }

    //11.Checklist - Why result is True == is False
    @Test
    public void checkListTest() {
        JDIEpamSite.metalAndColorPage.open();
        JDIEpamSite.metalAndColorPage.elementsCheckBoxes.select(Elements.EARTH.element);
        Assert.isFalse(JDIEpamSite.metalAndColorPage.elementsCheckBoxes.isSelected(Elements.EARTH.element));
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
        JDIEpamSite.metalAndColorPage.open();
        JDIEpamSite.metalAndColorPage.colorsDropdown.select(Colors.RED.color);
        Assert.areEquals(JDIEpamSite.metalAndColorPage.colorsDropdown.getText(), Colors.RED.color);
    }

    //14.List<Element>
    @Test
    public void listElementTest() {
        JDIEpamSite.homePage.open();
        Assert.areEquals(JDIEpamSite.homePage.benefitIcons.size(), 4);
        JDIEpamSite.homePage.benefitIcons.get(0).isDisplayed();

    }

    //15.Elements
    @Test
    public void elementsTest() {
        JDIEpamSite.differentElementPage.open();
        JDIEpamSite.differentElementPage.elementsCheckBoxes.setValue(Elements.EARTH.element);
        Assert.contains(JDIEpamSite.actionsLog.getText(0), "Earth: condition changed to true");
    }

    //16.Table
    @Test
    public void tableTest() {

    }

    //17.Menu
    @Test
    public void menuTest() {
        JDIEpamSite.leftSiteSection.leftSectionItems.clickOn(MainMenu.CONTACT_FORM.menuItem);
        JDIEpamSite.contactPage.checkOpened();
    }

    //18.RadioButtons - How to check that it's selected-?Override getSelectedAction or place locator to <select> tag
    @Test
    public void radioButtonsTest() {
        JDIEpamSite.metalAndColorPage.open();
        JDIEpamSite.metalAndColorPage.summaryRadioButtonsEven.select(Numbers.EIGHT);
        Assert.contains(JDIEpamSite.actionsLog.getText(0), "Summary (Even): value changed to 8");
    }
}

