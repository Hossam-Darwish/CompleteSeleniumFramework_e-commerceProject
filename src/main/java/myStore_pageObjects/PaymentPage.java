package myStore_pageObjects;

import myStore_actionDriver.Action;
import myStore_base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseClass {

    Action action= new Action();

    @FindBy(xpath = "//a[contains(text(),'Pay by bank wire')]")
    private WebElement bankWireMethod;

    @FindBy(xpath = "//a[contains(text(),'Pay by check')]")
    private WebElement payByCheckMethod;

    public PaymentPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public OrderSummary clickOnPaymentMethod() throws Throwable {
        action.click(getDriver(), bankWireMethod);
        return new OrderSummary();
    }

}
