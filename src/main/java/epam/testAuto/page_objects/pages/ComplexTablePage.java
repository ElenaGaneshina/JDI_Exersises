package epam.testAuto.page_objects.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;
import epam.testAuto.page_objects.sections.Paginator;

public class ComplexTablePage extends WebPage {
    //Complex Table
    //DropDown Checklist
    public Paginator paginator;

    @FindBy(xpath = "*//button[text()='Reestablish']")
    public IButton reestablishButton;
    @FindBy(xpath = "*//button[text()='Apply']")
    public IButton applyButton;



}
