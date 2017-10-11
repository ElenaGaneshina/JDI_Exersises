package epam.testAuto.entities;

import com.epam.commons.DataClass;
import epam.testAuto.enums.FormEnum;
import epam.testAuto.page_objects.JDIEpamSite;

import static epam.testAuto.page_objects.JDIEpamSite.datesPage;

public class DatesPageEntity extends DataClass {
    public String name = FormEnum.NAME.formValue;
    public String lastName = FormEnum.LAST_NAME.formValue;
    public String description = FormEnum.DESCRIPTION.formValue;
    public String period = FormEnum.PERIOD.formValue;
    public String time = FormEnum.TIME.formValue;
    public String leftRange1 = FormEnum.RANGE1_LEFT.formValue;
    public String rightRange1 = FormEnum.RANGE1_RIGHT.formValue;
    public String leftRange2 = FormEnum.RANGE2_LEFT.formValue;
    public String rightRange2 = FormEnum.RANGE2_RIGHT.formValue;
    public String moveToRange2 = FormEnum.MOVE_TO_RANGE2.formValue;


    //for mandatory fields
    public DatesPageEntity(String name, String lastName, String leftRange1, String rightRange1) {
        this.name = name;
        this.lastName = lastName;
        this.leftRange1 = leftRange1;
        this.rightRange1 = rightRange1;
    }

    //default
    public  DatesPageEntity() {
        JDIEpamSite.datesPage.datesForm.moveSlider(Integer.parseInt(this.leftRange2),
                Integer.parseInt(this.rightRange2),this.moveToRange2);
    }

    //Not Mandatory
    public DatesPageEntity(String description, String period, String time,
                           String leftRange2, String rightRange2, String moveToRange2) {
        this.description = description;
        this.period = period;
        this.time = time;
        this.leftRange2 = leftRange2;
        this.rightRange2 = rightRange2;
        this.moveToRange2 = moveToRange2;
        datesPage.datesForm.moveSlider(Integer.parseInt(this.leftRange2),
                Integer.parseInt(this.rightRange2),this.moveToRange2);
    }

    public DatesPageEntity(String name, String lastName, String description, String period,
                           String time, String leftRange1, String rightRange1,String leftRange2,
                           String rightRange2, String moveToRange2 ){
        this.name = name;
        this.lastName = lastName;
        this.description = description;
        this.period = period;
        this.time = time;
        this.leftRange1 = leftRange1;
        this.rightRange1 = rightRange1;
        this.leftRange2 = leftRange2;
        this.rightRange2 = rightRange2;
        this.moveToRange2 = moveToRange2;
    }
}

