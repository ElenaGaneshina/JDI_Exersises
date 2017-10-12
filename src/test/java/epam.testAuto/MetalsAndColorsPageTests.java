package epam.testAuto;

import com.epam.web.matcher.testng.Assert;
import epam.testAuto.dataProviders.*;
import epam.testAuto.enums.*;
import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static epam.testAuto.page_objects.JDIEpamSite.*;

public class MetalsAndColorsPageTests extends ExtensionForTests {
    //Test for all controls on Metals and Colors Page

    @BeforeMethod
    public  void openMetalsAndColorsPage(){
    header.headerMenu.clickOn(MainMenu.METAL_AND_COLORS.menuItem.toUpperCase());
    }

    @Test(dataProvider = "radioButtons", dataProviderClass = NumbersRadioBtnsProvider.class)
    public void radioButtonTest(Numbers odd,Numbers even, int result){
        metalAndColorPage.shouldBeOpened();
        metalAndColorPage.summaryRadioButtonsEven.select(even);
        metalAndColorPage.summaryRadioButtonsOdd.select(odd);
        metalAndColorPage.calculateBtn.click();
        Assert.areEquals(resultLog.getFirstText(), "Summary: "+result);
    }

    @Test(dataProvider = "colors", dataProviderClass = ColorsDropDownProvider.class)
    public void colorTest(Colors color){
        metalAndColorPage.shouldBeOpened();
        metalAndColorPage.colorsDropdown.select(color);
        metalAndColorPage.submitBtn.click();
        Assert.contains(resultLog.getTextList().toString(),"Color: "+ color.color);
    }

    @Test(dataProvider = "vegetables", dataProviderClass = VegetablesListProvider.class)
    public void vegetableTest(Vegetables veg){
        metalAndColorPage.shouldBeOpened();
        metalAndColorPage.vegetablesLable.click();
        metalAndColorPage.vegetablesCheckList.check(veg);
        metalAndColorPage.submitBtn.click();
        Assert.contains(resultLog.getTextList().toString(),"Vegetables: ");
        Assert.contains(resultLog.getTextList().toString(), veg.vegetables);
    }

    @Test(dataProvider = "elements", dataProviderClass = ElementsCheckBoxProvider.class)
    public void elementsTest(Elements elements){
        metalAndColorPage.shouldBeOpened();
        metalAndColorPage.elementsCheckBoxes.check(elements);
        metalAndColorPage.submitBtn.click();
        Assert.contains(resultLog.getTextList().toString(),"Elements: ");
        Assert.contains(resultLog.getTextList().toString(), elements.element);
    }

    @Test(dataProvider = "metals", dataProviderClass = MetalsComboBoxProvider.class)
    public void metalTest(Metals metal){
        metalAndColorPage.shouldBeOpened();
        metalAndColorPage.metalsComboBox.select(metal);
        metalAndColorPage.submitBtn.click();
        Assert.contains(resultLog.getTextList().toString(),"Metal: "+ metal.metal);
    }
}
