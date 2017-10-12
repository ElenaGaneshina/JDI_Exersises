package epam.testAuto.dataProviders;

import org.testng.annotations.DataProvider;

import static epam.testAuto.enums.Elements.*;

public final class ElementsCheckBoxProvider {
    public ElementsCheckBoxProvider() {
    }

    @DataProvider(name ="elements")
    public Object[][] elements(){
        return  new Object[][]{{WATER},{EARTH},{WIND},{FIRE}};}

}
