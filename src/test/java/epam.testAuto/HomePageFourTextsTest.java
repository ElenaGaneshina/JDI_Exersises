package epam.testAuto;

import epam.testAuto.dataProviders.FourTextsProvider;
import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.Test;

import static epam.testAuto.page_objects.JDIEpamSite.homePage;
import static org.testng.Assert.assertEquals;

public class HomePageFourTextsTest extends ExtensionForTests{
    @Test(dataProvider = "fourTexts", dataProviderClass = FourTextsProvider.class)
    public void fourTextsTest(int num, String text) {
        homePage.open();
        //Check Text under pictures
        assertEquals(homePage.benefitTexts.getTextList().get(num), text);
    }
}
