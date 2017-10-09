package epam.testAuto.enums;

//Enum for Dates Page Test = value for Dates Form
public enum DatesFormEnum {
    NAME("Elena"),
    LAST_NAME("Ganeshina"),
    DESCRIPTION("Test Description"),
    PERIOD("10/11/2017"),
    TIME("5:21 PM"),
    RANGE1_LEFT("10"),
    RANGE1_RIGHT("20");

    public String datesFormValue;

    DatesFormEnum (String value){
        this.datesFormValue=value;
    }

}
