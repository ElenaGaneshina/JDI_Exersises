package epam.testAuto.page_objects.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import epam.testAuto.entities.DatesPageEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;

import static com.epam.web.matcher.testng.Assert.assertFalse;
import static com.epam.web.matcher.testng.Assert.isTrue;
import static com.epam.web.matcher.testng.ScreenAssert.assertEquals;

public class ResultLog extends Section{

    private Text name;
    private Text lastName;
    private Text description;
    private Text period;
    private Text time;

    @FindBy(xpath = "//li[starts-with(text(), 'Range1')")
    private Text range1;

    public void checkAllFormFieldsInResult(DatesPageEntity datesPageEntity){
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Name')]")).getText(),"Name: " + datesPageEntity.name);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Last Name')]")).getText(),"Last Name: " + datesPageEntity.lastName);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Description')]")).getText(),"Description: " + datesPageEntity.description);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Period')]")).getText(),"Period: " + datesPageEntity.period);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Time')]")).getText(),"Time: " + datesPageEntity.time);
    }

    public void checkNotMandatoryFieldsInResult(DatesPageEntity datesPageEntity){
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Description')]")).getText(),"Description: " + datesPageEntity.description);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Period')]")).getText(),"Period: " + datesPageEntity.period);
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Time')]")).getText(),"Time: " + datesPageEntity.time);
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
