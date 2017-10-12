package epam.testAuto.dataProviders;

import org.testng.annotations.DataProvider;

import static epam.testAuto.enums.Numbers.*;
import static epam.testAuto.enums.Numbers.EIGHT;

public class NumbersRadioBtnsProvider {
    @DataProvider(name ="radioButtons")
    public Object[][] radioButtons(){
        return  new Object[][]{{ONE ,TWO, 3},{THREE,FOUR, 7},{FIVE,SIX, 11},{SEVEN,EIGHT, 15}};}

}
