package ru.kpfu.itis.aygul.helpers;

import org.openqa.selenium.By;
import ru.kpfu.itis.aygul.manager.AppManager;
import ru.kpfu.itis.aygul.models.AccountData;

public class LoginHelper extends HelperBase {

    public LoginHelper(AppManager appManager) {
        super(appManager);
    }

    public void getLoginPage() {
        driver.get(appManager.loginUrl);
    }

    public void logout() throws InterruptedException {
        Thread.sleep(2000);
        findBy(By.linkText("выход")).click();
    }

    public void login(AccountData user) {
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys(user.getUsername());
        driver.findElement(By.name("passwd")).clear();
        driver.findElement(By.name("passwd")).sendKeys(user.getPassword());
        driver.findElement(By.name("authlogin")).click();
    }
}
