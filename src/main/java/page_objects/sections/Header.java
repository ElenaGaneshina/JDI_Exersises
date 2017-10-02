package page_objects.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.User;
import enums.MainMenu;
import enums.ServiceMenu;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class Header extends Section {

    @FindBy(css = ".profile-photo")
    public Label profilePhoto;

    public Login loginForm;

    //Header Items
    @FindBy(css = ".uui-navigation.nav.navbar-nav.m-l8>li>a")
    public Menu<MainMenu> headerItems;
    //Service menu
    @FindBy(css = "ul[class=dropdown-menu]>li")
    public Menu<ServiceMenu> serviceMenuElements;

    @Step
    public void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }
}
