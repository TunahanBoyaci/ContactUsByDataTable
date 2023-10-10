package Pages;

import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends MyMethods {
    public DialogContent(){
        PageFactory.initElements(ParameterDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Contact')]")
    public WebElement contactUs;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[1]/input")
    public WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[2]/input")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[3]/input")
    public WebElement subjectInput;

    @FindBy(xpath = "//*[@id=\"message\"]")
    public WebElement messageInput;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[6]/input")
    public WebElement submitButton;
}
