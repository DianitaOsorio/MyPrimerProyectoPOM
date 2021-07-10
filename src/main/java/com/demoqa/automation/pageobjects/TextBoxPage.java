package com.demoqa.automation.pageobjects;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoqa.com/text-box")

public class TextBoxPage extends PageObject {

    public By userNameInput = By.id("userName");
    public By emailInput = By.id("userEmail");
    public By currentAddressInput = By.id("currentAddress");
    public By permanentAddressInput = By.id("permanentAddress");
    public By submitButton = By.id("submit");

    public void setUserNameInput (String string) {
        getDriver().findElement(userNameInput).sendKeys(string);
    }

    public void setEmailInput(String string ) {
        getDriver().findElement(emailInput).sendKeys(string);

    }

    public void setCurrentAddressInput(String string) {
        getDriver().findElement(currentAddressInput).sendKeys(string);
    }

    public void setPermanentAddressInput(String string) {
        getDriver().findElement(permanentAddressInput).sendKeys(string);
    }

    public void clickSubmitButton() {
        getDriver().findElement(submitButton).click();
    }
}
