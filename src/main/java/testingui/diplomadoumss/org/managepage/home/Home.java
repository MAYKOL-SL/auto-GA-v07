package testingui.diplomadoumss.org.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

public class Home extends BasePage {

    @FindBy(xpath = "//a[@id='button-home']")
    private WebElement emailButtonHome;

    @FindBy(xpath = "//a[@id='button-acerca']")
    private WebElement emailButtonAcerca;

    public void initBrowser() {
        webDriver.get(PropertyAccesor.getInstance().getBrowserProject());
    }

    public void pressHome() {
        emailButtonHome.click();
    }

    public void pressAcerca() {
        emailButtonAcerca.click();
    }

    public void finish() {
        webDriver.quit();
    }
}
