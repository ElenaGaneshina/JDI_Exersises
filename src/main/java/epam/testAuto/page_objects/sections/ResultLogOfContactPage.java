package epam.testAuto.page_objects.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import epam.testAuto.entities.ContactEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static com.epam.web.matcher.testng.Assert.assertFalse;
import static com.epam.web.matcher.testng.Assert.isTrue;
import static com.epam.web.matcher.testng.ScreenAssert.assertEquals;

public class ResultLogOfContactPage extends Section {
    //Parts of section
    private TextField name;
    private TextField lastName;
    private TextArea description;

public void checkResult(ContactEntity contactEntity){
    isTrue((get(By.xpath("//li[starts-with(text(), 'Summary: 3')]")).isDisplayed()));

    if (contactEntity.name == null){
        assertFalse(isElementPresent("//li[starts-with(text(), 'Name')]"));
    }else
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Name')]")).getText(),"Name: " + contactEntity.name);;

    if (contactEntity.lastName == null){
        assertFalse(isElementPresent("//li[starts-with(text(), 'Last Name')]"));
    }else
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Last Name')]")).getText(),"Last Name: " + contactEntity.lastName);

    if (contactEntity.description == null){
        assertFalse(isElementPresent("//li[starts-with(text(), 'Description')]"));
    }else
        assertEquals(get(By.xpath("//li[starts-with(text(), 'Description')]")).getText(),"Description: " + contactEntity.description);

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
