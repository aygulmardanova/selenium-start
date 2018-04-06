package ru.kpfu.itis.aygul.helpers;

import org.openqa.selenium.*;
import ru.kpfu.itis.aygul.manager.AppManager;

public class HelperBase {

    public AppManager appManager;
    public WebDriver driver;
    public boolean acceptNextAlert = true;


    public HelperBase(AppManager appManager) {
        this.appManager = appManager;
        this.driver = appManager.getDriver();
    }

    public WebElement findBy(By by) {
        return driver.findElement(by);
    }


    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (isAcceptNextAlert()) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            setAcceptNextAlert(true);
        }
    }

    public Boolean isAcceptNextAlert() {
        return acceptNextAlert;
    }

    public void setAcceptNextAlert(Boolean acceptNextAlert) {
        this.acceptNextAlert = acceptNextAlert;
    }
}
