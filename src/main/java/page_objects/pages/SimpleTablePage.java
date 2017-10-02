package page_objects.pages;

import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JTable;
import org.openqa.selenium.support.FindBy;
import page_objects.sections.Paginator;

public class SimpleTablePage extends WebPage{

    public Paginator paginator;

    @JTable(
            root = @FindBy(tagName = "tbody"),
            row = @FindBy(xpath = ".//tr[%s]"),
            column = @FindBy(css= ".//td[%s]"))
    public Table simpleTable;
}
