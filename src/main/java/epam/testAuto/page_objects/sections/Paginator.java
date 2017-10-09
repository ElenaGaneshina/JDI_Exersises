package epam.testAuto.page_objects.sections;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.composite.Pagination;
import org.openqa.selenium.support.FindBy;

public class Paginator extends Pagination{
    @FindBy(css = ".prev")
    public IButton previouspage;

    @FindBy(css = ".next")
    public IButton nextPage;

    @FindBy(css = ".first")
    public IButton firstPage;

    @FindBy(css = ".last")
    public IButton lastPage;

    //Need to realise pages 1 - 8
}
