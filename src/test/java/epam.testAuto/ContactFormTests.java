package epam.testAuto;

import epam.testAuto.dataProviders.ContactProvider;
import epam.testAuto.entities.ContactEntity;
import epam.testAuto.page_objects.ExtensionForTests;
import org.testng.annotations.Test;

import static epam.testAuto.enums.MainMenu.CONTACT_FORM;
import static epam.testAuto.page_objects.JDIEpamSite.contactPage;
import static epam.testAuto.page_objects.JDIEpamSite.header;

public class ContactFormTests extends ExtensionForTests{

    @Test(dataProvider = "contacts", dataProviderClass = ContactProvider.class)
    public void sentContactForm(ContactEntity contactEntity){
        header.headerMenu.clickOn(CONTACT_FORM.menuItem.toUpperCase());
        contactPage.contactForm.submit(contactEntity);
        contactPage.resultLog.checkResult(contactEntity);
    }

}
