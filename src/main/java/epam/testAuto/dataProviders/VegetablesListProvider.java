package epam.testAuto.dataProviders;

import org.testng.annotations.DataProvider;

import static epam.testAuto.enums.Vegetables.CUCUMBER;
import static epam.testAuto.enums.Vegetables.ONION;
import static epam.testAuto.enums.Vegetables.TOMATO;

public final class VegetablesListProvider {
    public VegetablesListProvider() {
    }

    @DataProvider(name ="vegetables")
    public Object[][] vegetables(){
        return  new Object[][]{{CUCUMBER},{TOMATO},{ONION}};}

}
