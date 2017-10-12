package epam.testAuto.dataProviders;

import org.testng.annotations.DataProvider;

import static epam.testAuto.enums.Colors.*;

public final class ColorsDropDownProvider {
    public ColorsDropDownProvider() {
    }

    @DataProvider(name ="colors")
    public Object[][] colors(){
        return  new Object[][]{{RED},{BLUE},{GREEN},{YELLOW}};}

}
