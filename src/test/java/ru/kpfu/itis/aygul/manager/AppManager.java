package ru.kpfu.itis.aygul.manager;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.kpfu.itis.aygul.helpers.AddShelfHelper;
import ru.kpfu.itis.aygul.helpers.LoginHelper;
import ru.kpfu.itis.aygul.helpers.SearchHelper;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class AppManager {

    public WebDriver driver;
    public String baseUrl;
    public String loginUrl;
    public LoginHelper loginHelper;
    public SearchHelper searchHelper;
    public AddShelfHelper addShelfHelper;
    public StringBuffer verificationErrors = new StringBuffer();

    public AppManager() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + "/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "https://www.e-reading.club/";
        loginUrl = "https://www.e-reading.pw/login.php";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginHelper = new LoginHelper(this);
        searchHelper = new SearchHelper(this);
        addShelfHelper = new AddShelfHelper(this);
    }

    public void getBasePage() {
        driver.get(baseUrl);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public StringBuffer getVerificationErrors() {
        return verificationErrors;
    }

    public void setVerificationErrors(StringBuffer verificationErrors) {
        this.verificationErrors = verificationErrors;
    }

}