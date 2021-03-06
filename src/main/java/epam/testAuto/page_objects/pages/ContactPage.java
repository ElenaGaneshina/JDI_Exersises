package epam.testAuto.page_objects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import epam.testAuto.page_objects.sections.ContactForm;
import epam.testAuto.page_objects.sections.ResultLogOfContactPage;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends WebPage {
    //Sections
    @FindBy(css = ".form")
   public ContactForm contactForm;

    @FindBy(css = ".results")
    public ResultLogOfContactPage resultLog;


    @FindBy(id = "Name")
    public ITextField name;
    @FindBy(id = "LastName")
    public ITextField lastName;
    @FindBy(id = "Description")
    public TextArea description;
    @FindBy(xpath = "//*[text()='Submit']")
    public IButton contactSubmit;

    //radioButtons
    @FindBy(xpath = "//*[text()='Calculate']")
    public IButton calculateBtn;

    }
