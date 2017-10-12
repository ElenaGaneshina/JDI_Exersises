package epam.testAuto.dataProviders;

import org.testng.annotations.DataProvider;

import static epam.testAuto.enums.Metals.*;

public final class MetalsComboBoxProvider {
    public MetalsComboBoxProvider() {
    }

    @DataProvider(name ="metals")
    public Object[][] metals(){
        return  new Object[][]{{GOLD},{SILVER},{BRONZE},{SELEN}};}

}
