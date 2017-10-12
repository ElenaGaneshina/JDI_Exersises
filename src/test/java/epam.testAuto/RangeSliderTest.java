package epam.testAuto;

import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.Test;

import static epam.testAuto.enums.MainMenu.SERVICE;
import static epam.testAuto.enums.ServiceMenu.DATES;
import static epam.testAuto.page_objects.JDIEpamSite.datesPage;
import static epam.testAuto.page_objects.JDIEpamSite.header;

public class RangeSliderTest extends ExtensionForTests {

    @Test
    public void checkSlider(){
        header.checkDisplayedUserName();
        header.headerMenu.select(SERVICE);
        header.serviceMenuElements.select(DATES.serviceItem.toUpperCase());
        datesPage.shouldBeOpened();

        //move to the most left and right position (0,100)%
        datesPage.datesForm.moveSlider(-20,0,"L");
        datesPage.datesForm.checkValuesOnSlider(0,100);

        //move all to the most left position(0,0)%
        datesPage.datesForm.moveSlider(0,-100,"L");
        datesPage.datesForm.checkValuesOnSlider(0,0);

        //move all to the most right position (100,100)%
        datesPage.datesForm.moveSlider(100,100,"R");
        datesPage.datesForm.checkValuesOnSlider(100,100);

        //move to (30,70)%
        datesPage.datesForm.moveSlider(-70,-30,"L");
        datesPage.datesForm.checkValuesOnSlider(30,70);

    }
}
