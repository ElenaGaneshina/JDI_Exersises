package page_objects.pages;

import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.core.interfaces.complex.ISelector;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;
import page_objects.sections.Paginator;

public class TableWithPagesPage extends WebPage {

    public Paginator paginator;

    @FindBy(css = "[type=\"search\"]")
    public ITextField search;

    @FindBy(name = "DataTables_Table_0_length")
    public ISelector rowsNumberInPageDD;

    //paginator for table


}
