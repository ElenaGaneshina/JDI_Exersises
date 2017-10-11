package epam.testAuto;

import epam.testAuto.dataProviders.FourTextsProvider;
import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.Test;

import static epam.testAuto.page_objects.JDIEpamSite.homePage;
import static org.testng.Assert.assertEquals;

public class HomePageFourTextsTest extends ExtensionForTests{

    @Test(dataProvider = "fourTexts", dataProviderClass = FourTextsProvider.class)
    public void fourTextsTest(int num, String text) {
        //Check Text under pictures
        homePage.open();
        assertEquals(homePage.benefitTexts.get(num).getText(), text);
    }
}
