package epam.testAuto.page_objects.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.web.matcher.testng.Assert;
import epam.testAuto.enums.MainMenu;
import epam.testAuto.enums.ServiceMenu;
import org.openqa.selenium.support.FindBy;

import static java.util.Arrays.asList;

public class LeftSiteSection extends Section {
    @FindBy(css = ".sidebar-menu>li>a")
    public Menu<MainMenu> leftSectionItems;

    @FindBy(css = ".sub>li>a")
    public Menu<ServiceMenu> serviceLeftMenuElements;

    public void checkLeftServiceMenu() {
        leftSectionItems.clickOn(MainMenu.SERVICE.menuItem);
        Assert.areEquals(serviceLeftMenuElements.getNames(),
                asList(ServiceMenu.SUPPORT.serviceItem,
                        ServiceMenu.DATES.serviceItem,
                        ServiceMenu.COMPLEX_TABLE.serviceItem,
                        ServiceMenu.SIMPLE_TABLE.serviceItem,
                        ServiceMenu.TABLE_WITH_PAGES.serviceItem,
                        ServiceMenu.DIFFERENT_ELEMENTS.serviceItem
                ));
    }

}
