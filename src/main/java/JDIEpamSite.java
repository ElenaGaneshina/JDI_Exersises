import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.openqa.selenium.support.FindBy;
import page_objects.pages.*;
import page_objects.sections.Header;
import page_objects.sections.LeftSiteSection;

@JSite(domain = "https://epam.github.io/JDI/")
public class JDIEpamSite extends WebSite {

    //All Pages
    @JPage(url = "/index.htm", title = "Index Page")
    public static HomePage homePage;

    @JPage(url ="/page1.htm" , title = "Contact Form")
    public static ContactPage contactPage;

    @JPage(url ="/page2.htm" , title = "Metal and Colors")
    public static MetalAndColorPage metalAndColorPage;

    @JPage(url ="/page3.htm" , title = "Support")
    public static SupportPage supportPage;

    @JPage(url ="/page4.htm" , title = "Dates")
    public static DatesPage datesPage;

    @JPage(url ="/page5.htm" , title = "Complex Table")
    public static ComplexTablePage complexTablePage;

    @JPage(url ="/page6.htm" , title = "Simple Table")
    public static SimpleTablePage simpleTablePage;

    @JPage(url ="/page7.htm" , title = "Table with pages")
    public static TableWithPagesPage tableWithPagesPage;

    @JPage(url ="/page8.htm" , title = "Different Element")
    public static DifferentElementPage differentElementPage;

    //Sections and Forms
    @FindBy(css = "uui-header")
    public static Header header;

    @FindBy(css = "#mCSB_1")
    public static LeftSiteSection leftSiteSection;

    @FindBy(css=".logs>li")
    public static TextList<Enum> actionsLog;

    @FindBy(css =".results")
    public static TextList<Enum> resultsLog;





}
