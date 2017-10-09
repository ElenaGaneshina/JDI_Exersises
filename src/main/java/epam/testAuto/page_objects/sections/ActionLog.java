package epam.testAuto.page_objects.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

public class ActionLog extends Section {
    @FindBy(css=".logs>li")
    public  TextList<Enum> logActions;
}
