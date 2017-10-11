package epam.testAuto.entities;

import com.epam.commons.DataClass;

import static epam.testAuto.enums.FormEnum.*;

public class ContactEntity extends DataClass {
    public String name = NAME.formValue;
    public String lastName = LAST_NAME.formValue;
    public String description = DESCRIPTION.formValue;

    public ContactEntity(String name, String lastName, String description) {
        this.name = name;
        this.lastName = lastName;
        this.description = description;
    }


    public ContactEntity() { }
}
