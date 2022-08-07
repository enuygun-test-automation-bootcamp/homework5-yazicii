package testng;

import org.testng.Assert;
import org.testng.annotations.*;


public class ContactManagerTestNG extends BaseTest {

    @Test(priority = 0)
    public void openAddContactOnOreo() throws NullPointerException, InterruptedException {

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    //User checks title whether it is "Add Contact"
    @Test(priority = 1)
    public void checkAddContactTitle() {
        Assert.assertEquals(addContactPage.getTitle().getText(), "Add Contact");
    }


    //User adds a work account successfully
    //User check the account whether it is correct
    @Test(priority = 2)
    public void addWorkAccountSuccessfully() throws InterruptedException {
        String name = "oguzhan";
        addContactPage.getContactNameField().sendKeys(name);
        addContactPage.getContactPhoneField().click();
        addContactPage.getContactPhoneField().sendKeys("5335616161");
        addContactPage.getContactPhoneDropDown().click();
        addContactPage.getPhoneWorkDropDown().click();
        addContactPage.getContactEmailField().click();
        addContactPage.getContactEmailField().sendKeys("tester.o1yazicii@gmail.com");
        addContactPage.getContactEmailDropDown().click();
        addContactPage.getEmailWorkDropDown().click();
        addContactPage.getSaveButton().click();
        Assert.assertEquals(addContactPage.getCheckAdd().getText(), "oguzhan");

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    //User adds a mobile account successfully
    //User check the account whether it is correct
    @Test(priority = 3)
    public void addMobileAccountSuccessfully() throws InterruptedException {
        addContactPage.getContactNameField().sendKeys("yazici");
        addContactPage.getContactPhoneField().click();
        addContactPage.getContactPhoneField().sendKeys("5335616161");
        addContactPage.getContactPhoneDropDown().click();
        addContactPage.getPhoneMobileDropDown().click();
        addContactPage.getContactEmailField().click();
        addContactPage.getContactEmailField().sendKeys("tester.o1yazicii@gmail.com");
        addContactPage.getContactEmailDropDown().click();
        addContactPage.getEmailMobileDropDown().click();
        addContactPage.getSaveButton().click();
        Assert.assertEquals(addContactPage.getCheckAdd2().getText(), "yazici");

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);

    }

    //User checks number limit for contact phone field
    @Test(priority = 4)
    public void numberLimit() throws InterruptedException {
        addContactPage.getContactNameField().sendKeys("+90561561616161");
        addContactPage.getContactPhoneField().click();
        addContactPage.getContactPhoneField().sendKeys("+90561561616161");
        addContactPage.getSaveButton().click();
        Assert.assertEquals(addContactPage.getCheckAdd3().getText(), "+90561561616161");

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    //User checks email format for contact email field
    @Test(priority = 5)
    public void emailFormatTest() throws InterruptedException {
        addContactPage.getContactEmailDropDown().click();
        Assert.assertEquals(addContactPage.getSelectTitle().getText(), "Select label");
        addContactPage.getEmailHomeDropDown().click();
        addContactPage.getContactEmailDropDown().click();
        addContactPage.getEmailWorkDropDown().click();
        addContactPage.getContactEmailDropDown().click();
        addContactPage.getEmailMobileDropDown().click();
        addContactPage.getContactEmailDropDown().click();
        addContactPage.getEmailOtherDropDown().click();

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    //User adds a home account successfully
    @Test(priority = 5)
    public void homeAccountSuccessfully() throws InterruptedException {

        addContactPage.getContactNameField().sendKeys( "home");
        addContactPage.getContactPhoneField().click();
        addContactPage.getContactPhoneField().sendKeys("5555616161");
        addContactPage.getContactPhoneDropDown().click();
        addContactPage.getPhoneHomeDropDown().click();
        addContactPage.getContactEmailField().click();
        addContactPage.getContactEmailField().sendKeys("tester.o1yazicii@gmail.com");
        addContactPage.getContactEmailDropDown().click();
        addContactPage.getEmailHomeDropDown().click();
        addContactPage.getSaveButton().click();
        Assert.assertEquals(addContactPage.getCheckAdd5().getText(), "home");

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    //User checks required fields for add account page
    @Test(priority = 6)
    public void checkInput() throws InterruptedException {
        addContactPage.getSaveButton().click();
        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    //User checks whether contact name accepts number and digit
    @Test(priority = 7)
    public void checkNameNumberDigit() throws InterruptedException {
        String name = "ogi61'";
        addContactPage.getContactNameField().sendKeys(name);
        addContactPage.getSaveButton().click();
        Assert.assertEquals(addContactPage.getCheckAdd7().getText(),"ogi61'");

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    //User adds a home account with home email successfully
    @Test(priority = 8)
    public void homeAccountEmailSucces() throws InterruptedException {

        addContactPage.getContactNameField().sendKeys("homeEmail");
        addContactPage.getContactEmailField().click();
        addContactPage.getContactEmailField().sendKeys("tester.o1yazicii@gmail.com");
        addContactPage.getContactEmailDropDown().click();
        addContactPage.getEmailHomeDropDown().click();
        addContactPage.getSaveButton().click();
        Assert.assertEquals(addContactPage.getCheckAdd8().getText(),"homeEmail");
        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    //User checks special characters limit for contact phone field
    @Test(priority = 9)
    public void phoneSpecialCharacterLimit() throws InterruptedException {
        String name = "special character";
        addContactPage.getContactNameField().sendKeys(name);
        addContactPage.getContactPhoneField().click();
        addContactPage.getContactPhoneField().sendKeys("+905335616161");
        addContactPage.getSaveButton().click();
        Assert.assertEquals(addContactPage.getCheckAdd9().getText(),"special character'");
        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    //User checks special characters limit for contact name
    @Test(priority = 10)
    public void nameSpecialCharacterLimit() {
        String name = "=??-#!";
        addContactPage.getContactNameField().sendKeys(name);
        addContactPage.getSaveButton().click();
        Assert.assertEquals(addContactPage.getCheckAdd10().getText(),"=??-#!");
    }

}
