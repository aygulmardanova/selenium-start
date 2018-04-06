package ru.kpfu.itis.aygul;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    private WebDriver driver;
    private String baseUrl;
    private String loginUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + "/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "https://www.e-reading.club/";
        loginUrl = "https://www.e-reading.pw/login.php";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitled2() throws Exception {
        Thread.sleep(1000);
        driver.get(loginUrl);
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("d1057213@nwytg.com");
        driver.findElement(By.name("passwd")).clear();
        driver.findElement(By.name("passwd")).sendKeys("password123");
        driver.findElement(By.name("authlogin")).click();
        Thread.sleep(2000);
//        driver.get(baseUrl);
        WebElement input = driver.findElement(By.id("query"));
        input.click();
        input.clear();
        input.sendKeys("Пушкин");
        WebElement searchButton = driver.findElement(By.xpath("(//input[@value='искать'])"));
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(2000);
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}