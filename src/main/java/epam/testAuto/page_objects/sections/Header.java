package epam.testAuto.page_objects.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.web.matcher.testng.Assert;
import epam.testAuto.entities.User;
import epam.testAuto.enums.MainMenu;
import epam.testAuto.enums.Names;
import epam.testAuto.enums.ServiceMenu;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static java.util.Arrays.asList;

public class Header extends Section {

    @FindBy(css = ".profile-photo")
    public Label profilePhoto;

    public Login loginForm;

    //Header Items
    @FindBy(css = ".uui-navigation.nav.navbar-nav.m-l8")
    public Menu<MainMenu> headerMenu;

    //Service menu
    @FindBy(css = "ul[class=dropdown-menu]>li")
    public Menu<ServiceMenu> serviceMenuElements;

    @Step("Perform login")
    public void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }

    @Step("Check that User Name displayed in the right-top side of the screen")
    public void checkDisplayedUserName() {
        Assert.areEquals(profilePhoto.getText(),Names.USER_NAME.name);
    }

    @Step("Check Header Service Menu")
    public void checkHeaderServiceMenu(){
         Assert.areEquals(serviceMenuElements.getNames(),
                asList(ServiceMenu.SUPPORT.serviceItem.toUpperCase(),
                        ServiceMenu.DATES.serviceItem.toUpperCase(),
                        ServiceMenu.COMPLEX_TABLE.serviceItem.toUpperCase(),
                        ServiceMenu.SIMPLE_TABLE.serviceItem.toUpperCase(),
                        ServiceMenu.TABLE_WITH_PAGES.serviceItem.toUpperCase(),
                        ServiceMenu.DIFFERENT_ELEMENTS.serviceItem.toUpperCase()
                        ));
    }
}
