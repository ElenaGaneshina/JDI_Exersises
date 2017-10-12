package epam.testAuto.page_objects.pages;

import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JTable;
import org.openqa.selenium.support.FindBy;

public class SupportPage extends WebPage {
    @JTable(
            size = "3x6",
            root = @FindBy(tagName = "tbody"),
            row = @FindBy(xpath = ".//tr[%s]"),
            column = @FindBy(xpath= ".//td[%s]"),
            header ={"Type", "Now", "Plans"})
    public Table supportTable;
}
