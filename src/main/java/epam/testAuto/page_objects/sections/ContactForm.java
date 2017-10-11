package epam.testAuto.page_objects.sections;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import epam.testAuto.entities.ContactEntity;
import org.openqa.selenium.support.FindBy;

public class ContactForm extends Form<ContactEntity> {
    @FindBy(id = "Name")
    public TextField name;
    @FindBy(id = "LastName")
    public TextField lastName;
    @FindBy(id = "Description")
    public TextArea description;
    @FindBy(xpath = "//*[text()='Submit']")
    public IButton contactSubmit;
}
