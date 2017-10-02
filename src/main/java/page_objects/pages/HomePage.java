package page_objects.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Image;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.complex.Elements;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.web.matcher.testng.Assert;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends WebPage {
    @FindBy(css = ".main-title")
    public Label mainTitle;

    @FindBy(css = ".main-txt")
    public Text mainText;

    @FindBy(css = ".icons-benefit")
    public List<Image> benefitIcons;

    @FindBy(css = ".benefit-txt")
    public Elements<Text> benefitTexts;

    //Methods
    public void checkContainsElements(){
        mainTitle.isDisplayed();
        mainText.isDisplayed();
        Assert.areEquals(benefitIcons.size(), 4);
        Assert.areEquals(benefitTexts.size(),4);
    }
}
