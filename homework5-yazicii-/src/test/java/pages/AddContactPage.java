package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;

import static testng.ContactManagerTestNG.Driver;

@Data
public class AddContactPage {

    public AddContactPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver), this);
    }

    @AndroidFindBy(id = "android:id/title")
    private MobileElement title;

    @AndroidFindBy(id = "accountSpinner")
    private MobileElement targetAccountField;

    @AndroidFindBy(id = "contactNameEditText")
    private MobileElement contactNameField;

    @AndroidFindBy(id = "contactPhoneEditText")
    private MobileElement contactPhoneField;

    @AndroidFindBy(id = "contactEmailEditText")
    private MobileElement contactEmailField;

    @AndroidFindBy(id = "contactPhoneTypeSpinner")
    private MobileElement contactPhoneDropDown;

    @AndroidFindBy(id = "android:id/alertTitle")
    private MobileElement selectTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[1]")
    private MobileElement phoneHomeDropDown;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[2]")
    private MobileElement phoneWorkDropDown;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[3]")
    private MobileElement phoneMobileDropDown;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[4]")
    private MobileElement phoneOtherDropDown;

    @AndroidFindBy(id = "contactEmailTypeSpinner")
    private MobileElement contactEmailDropDown;

    @AndroidFindBy(id = "android:id/alertTitle")
    private MobileElement emailSelectTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[1]")
    private MobileElement emailHomeDropDown;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[2]")
    private MobileElement emailWorkDropDown;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[3]")
    private MobileElement emailMobileDropDown;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[4]")
    private MobileElement emailOtherDropDown;

    @AndroidFindBy(id = "contactSaveButton")
    private MobileElement saveButton;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"false\"])[6]")
    private MobileElement checkAdd;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"false\"])[9]")
    private MobileElement checkAdd2;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"false\"])[1]")
    private MobileElement checkAdd3;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"false\"])[3]")
    private MobileElement checkAdd5;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"false\"])[5]")
    private MobileElement checkAdd7;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"false\"])[4]")
    private MobileElement checkAdd8;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"false\"])[8]")
    private MobileElement checkAdd9;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"false\"])[2]")
    private MobileElement checkAdd10;
}
