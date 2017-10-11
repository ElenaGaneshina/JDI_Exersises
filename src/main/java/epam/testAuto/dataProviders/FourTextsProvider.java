package epam.testAuto.dataProviders;

import org.testng.annotations.DataProvider;

public final class FourTextsProvider {
    private FourTextsProvider(){}

    @DataProvider(name = "fourTexts")
    public static Object[][] fourTextsProvider() {
        return new Object[][]{
                {0, "To include good practices\n" +
                        "and ideas from successful\n" +
                        "EPAM project"},
                {1, "To be flexible and\n" +
                        "customizable"},
                {2, "To be multiplatform"},
                {3, "Already have good base\n" +
                        "(about 20 internal and\n" +
                        "some external projects),\n" +
                        "wish to get more…"}};
    }
}
