package epam.testAuto.page_objects.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.DatePicker;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import epam.testAuto.entities.DatesPageEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static com.epam.web.matcher.testng.Assert.assertFalse;
import static com.epam.web.matcher.testng.Assert.isTrue;
import static com.epam.web.matcher.testng.ScreenAssert.assertEquals;
import static epam.testAuto.page_objects.JDIEpamSite.datesPage;

public class ResultLogOfDatesPage extends Section{
    //Parts of section
    private TextField name;
    private TextField lastName;
    private TextArea description;
    private DatePicker period;
    private TextField time;
    private TextField leftRange1;
    private TextField rightRange1;

    public void checkAllFormFieldsInResult(DatesPageEntity datesPageEntity){
        int widthSlider = datesPage.datesForm.slider.getSize().getWidth();
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Name')]")).getText(),"Name: " + datesPageEntity.name);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Last Name')]")).getText(),"Last Name: " + datesPageEntity.lastName);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Description')]")).getText(),"Description: " + datesPageEntity.description);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Period')]")).getText(),"Period: " + datesPageEntity.period);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Time')]")).getText(),"Time: " + datesPageEntity.time);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Range 1')]")).getText(),"Range 1: from "+ datesPageEntity.leftRange1+" to "+ datesPageEntity.rightRange1);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Range 2')]")).getText(), "Range 2: from 0 to 100");
    }

    public void checkNotMandatoryFieldsInResult(DatesPageEntity datesPageEntity){
        int widthSlider = datesPage.datesForm.slider.getSize().getWidth();
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Description')]")).getText(),"Description: " + datesPageEntity.description);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Period')]")).getText(),"Period: " + datesPageEntity.period);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Time')]")).getText(),"Time: " + datesPageEntity.time);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Range 2')]")).getText(), "Range 2: from 0 to 100");
    }

    public void checkNoFieldsInResult(DatesPageEntity datesPageEntity){
        assertFalse(isElementPresent("//li[starts-with(text(), 'Name')]"));
        assertFalse(isElementPresent("//li[starts-with(text(), 'Last Name')]"));
        assertFalse(isElementPresent("//li[starts-with(text(), 'Description')]"));
        assertFalse(isElementPresent("//li[starts-with(text(), 'Period')]"));

        isTrue((get(By.xpath("//li[starts-with(text(), 'Time')]")).isDisplayed()));
        isTrue((get(By.xpath("//li[starts-with(text(), 'Range 2: from 20 to 100')]")).isDisplayed()));
    }

    public boolean isElementPresent(String locator) {
        try {
            getDriver().findElement(By.className(locator));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
