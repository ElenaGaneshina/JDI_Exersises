package epam.testAuto;

import epam.testAuto.entities.DatesPageEntity;
import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static epam.testAuto.enums.DatesFormEnum.*;
import static epam.testAuto.page_objects.JDIEpamSite.datesPage;

public class DatesFormTests extends ExtensionForTests {

    @BeforeMethod
    public void beforeTest() {
        datesPage.open();
    }

    //To fill all fields ans Submit
    @Test
    public void allFieldsSubmitTest() {
        DatesPageEntity entity = new DatesPageEntity();
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
                TIME.datesFormValue, RANGE2_LEFT.datesFormValue, RANGE2_RIGHT.datesFormValue, MOVE_TO_RANGE2.datesFormValue);
        datesPage.datesForm.submit(entity);
        datesPage.resultLog.checkNotMandatoryFieldsInResult(entity);
    }

    //Don't fill the fields and Submit
    @Test
    public void noFieldsSubmitTest() {
        DatesPageEntity entity = new DatesPageEntity(null, null, null, null, null, null, null, null, null, null);
        datesPage.datesForm.submit(entity);
        datesPage.resultLog.checkNoFieldsInResult(entity);
    }

}

