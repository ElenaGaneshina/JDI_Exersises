import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

public class ExtensionForTests extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(JDIEpamSite.class);
        JDIEpamSite.homePage.open();
        JDIEpamSite.header.login();
        Verify.getFails();
        logger.info("Run Tests");
}

    @AfterMethod
    public void tearDown() {
        Verify.getFails();
}}
