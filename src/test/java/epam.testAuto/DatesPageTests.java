package epam.testAuto;

import epam.testAuto.entities.DatesPageEntity;
import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static epam.testAuto.enums.DatesFormEnum.*;
import static epam.testAuto.page_objects.JDIEpamSite.datesPage;

public class DatesPageTests extends ExtensionForTests {

    @BeforeMethod
    public void beforeTest() {
        datesPage.open();
    }

    //To fill all fields ans Submit
    @Test
    public void allFieldsSubmitTest() {
        DatesPageEntity entity = new DatesPageEntity(NAME.datesFormValue, LAST_NAME.datesFormValue,
                DESCRIPTION.datesFormValue, PERIOD.datesFormValue, TIME.datesFormValue,
                RANGE1_LEFT.datesFormValue, RANGE1_RIGHT.datesFormValue);
        datesPage.datesForm.submit(entity);
        datesPage.resultLog.checkAllFormFieldsInResult(entity);
    }

    //To fill mandatory fields
    @Test
    public void mandatoryFieldsNotSubmitTest() {
        datesPage.datesForm.fill(new DatesPageEntity(NAME.datesFormValue, LAST_NAME.datesFormValue,
                RANGE1_LEFT.datesFormValue, RANGE1_RIGHT.datesFormValue));
    }

    //To fill not mandatory fields and Submit
    @Test
    public void notMandatorySubmit() {
        DatesPageEntity entity = new DatesPageEntity(DESCRIPTION.datesFormValue,  PERIOD.datesFormValue,
                TIME.datesFormValue);
        datesPage.datesForm.submit(entity);
        datesPage.resultLog.checkNotMandatoryFieldsInResult(entity);
    }

    //Don't fiel the fields and Submit
    @Test
    public void noFieldsSubmitTest() {
        datesPage.datesForm.submit(new DatesPageEntity());
        datesPage.resultLog.checkNoFieldsInResult(new DatesPageEntity());
    }

}

