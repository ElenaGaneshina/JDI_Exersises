package epam.testAuto.entities;

import com.epam.commons.DataClass;

import java.util.Arrays;
import java.util.List;

public class DatesPageEntity extends DataClass {
    public String name = null;
    public String lastName = null;
    public String description = null;
    public String period = null;
    public String time = null;
    public String leftRange1 = null;
    public String rightRange1 = null;

    public DatesPageEntity(String name, String lastName, String leftRange1, String rightRange1) {
        this.name = name;
        this.lastName = lastName;
        this.leftRange1 = leftRange1;
        this.rightRange1 = rightRange1;
    }

    public  DatesPageEntity() {
    }

    public DatesPageEntity(String description, String period, String time) {
        this.description = description;
        this.period = period;
        this.time = time;
    }

    public DatesPageEntity(String name, String lastName, String description, String period, String time, String leftRange1, String rightRange1){
        this.name = name;
        this.lastName = lastName;
        this.description = description;
        this.period = period;
        this.time = time;
        this.leftRange1 = leftRange1;
        this.rightRange1 = rightRange1;
    }

    public List<String> toList(){
        return Arrays.asList(name, lastName, description, period, time, leftRange1, rightRange1);
    }
}
