package com.demoqa.automation.steps;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.TextBoxPage;
import com.demoqa.automation.utils.Javascript;
import com.demoqa.automation.utils.Times;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Step;

public class TextBoxPageSteps {

    TextBoxPage textBoxPage = new TextBoxPage();
    DataInjection dataInjection = new DataInjection();
    Robot robot = new Robot();

    public TextBoxPageSteps() throws AWTException{

    }

    @Step
    public void openBrowser(){
        textBoxPage.open();


    }
    @Step
    public void fillTexBox() throws InterruptedException {
        textBoxPage.getDriver().manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        textBoxPage.setUserNameInput (dataInjection.getUsername());
        textBoxPage.setEmailInput(dataInjection.getEmail());
        textBoxPage.setCurrentAddressInput(dataInjection.getCurrentAddress());
        textBoxPage.setPermanentAddressInput(dataInjection.getPermanentAddress());
        Times.waitFor(5000);

        Javascript.clickJS(textBoxPage.getDriver(),textBoxPage.submitButton);
        Times.waitFor(5000);

    }
}
