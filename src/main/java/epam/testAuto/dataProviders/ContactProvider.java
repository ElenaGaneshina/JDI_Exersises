package epam.testAuto.dataProviders;

import epam.testAuto.entities.ContactEntity;
import org.testng.annotations.DataProvider;

public final class ContactProvider {
    private ContactProvider() { }

    @DataProvider(name = "contacts")
    public static Object[][] contacts() {
        return new Object[][]{
                { new ContactEntity() },
                { new ContactEntity("Peter", "Gerasimov", "3 Fields are filled")},
                { new ContactEntity(null , null, null)},
                {new ContactEntity(null , null, "Description is only used")}
        };
    }
}
