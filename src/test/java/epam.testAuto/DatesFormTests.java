package epam.testAuto;

import epam.testAuto.entities.DatesPageEntity;
import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static epam.testAuto.enums.FormEnum.*;
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
        datesPage.datesForm.fill(new DatesPageEntity(NAME.formValue, LAST_NAME.formValue,
                RANGE1_LEFT.formValue, RANGE1_RIGHT.formValue));
    }

    //To fill not mandatory fields and Submit
    @Test
    public void notMandatorySubmit() {
        DatesPageEntity entity = new DatesPageEntity(DESCRIPTION.formValue,  PERIOD.formValue,
                TIME.formValue, RANGE2_LEFT.formValue, RANGE2_RIGHT.formValue, MOVE_TO_RANGE2.formValue);
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

