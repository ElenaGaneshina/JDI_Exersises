package epam.testAuto;

import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.Test;

import static epam.testAuto.enums.Colors.YELLOW;
import static epam.testAuto.enums.Elements.WATER;
import static epam.testAuto.enums.Elements.WIND;
import static epam.testAuto.enums.Log.*;
import static epam.testAuto.enums.MainMenu.SERVICE;
import static epam.testAuto.enums.Metals.SELEN;
import static epam.testAuto.enums.ServiceMenu.DIFFERENT_ELEMENTS;
import static epam.testAuto.page_objects.JDIEpamSite.*;

public class DifferentElementsPageTest extends ExtensionForTests {
    @Test
    public void checkDifferentElementsPage()
    {
        //1. Open demo site and perform login
            //extension for class
        homePage.open();

        //2. Check displayed User Name
        header.checkDisplayedUserName();

        //3. Check interface on Home page, it contains all needed elements
        homePage.checkContainsElements();

        //4. Check left Service menu
        leftSiteSection.checkLeftServiceMenu();

        //5.Open through the header menu Service -> Different Elements Page
        header.headerItems.select(SERVICE);
        header.checkHeaderServiceMenu();
        header.serviceMenuElements.select(DIFFERENT_ELEMENTS.serviceItem.toUpperCase());

        //6.Select checkboxes
        differentElementPage.elementsCheckBoxes.get(WIND.element).click();
        differentElementPage.elementsCheckBoxes.get(WATER.element).click();

        //7.Select radio
        differentElementPage.metalRadioButtons.select(SELEN.metal);

        //8.Select in dropdown
        differentElementPage.colors.select(YELLOW.color);

        //9.Assert Log
        differentElementPage.checkLog(WIND_TRUE.log);
        differentElementPage.checkLog(WATER_TRUE.log);
        differentElementPage.checkLog(SELEN_SET.log);
        differentElementPage.checkLog(YELLOW_SET.log);

        //10.Unselect checkboxes
        differentElementPage.elementsCheckBoxes.get(WATER.element).click();
        differentElementPage.elementsCheckBoxes.get(WIND.element).click();

        //11.Check in logs section unselected values and status (true|false)
        differentElementPage.checkLog(WIND_FALSE.log);
        differentElementPage.checkLog(WATER_FALSE.log);
    }
}
