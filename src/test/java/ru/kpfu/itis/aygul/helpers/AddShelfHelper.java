package ru.kpfu.itis.aygul.helpers;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import ru.kpfu.itis.aygul.manager.AppManager;
import ru.kpfu.itis.aygul.models.Shelf;

public class AddShelfHelper extends HelperBase{

    public AddShelfHelper(AppManager appManager) {
        super(appManager);
    }

    public void clickAddShelf() {
        driver.findElement(By.linkText("моя полка")).click();
        driver.findElement(By.linkText("добавить полку")).click();
    }

    public void addShelf(Shelf shelf) {
        driver.findElement(By.name("newshelf")).click();
        driver.findElement(By.name("newshelf")).clear();
        driver.findElement(By.name("newshelf")).sendKeys(shelf.getName());
        if (shelf.getPublic())
            driver.findElement(By.name("publicshelf")).click();
        driver.findElement(By.xpath("//input[@value=' добавить ']")).click();

    }

    public void deleteShelf(Shelf shelf) {
        driver.findElement(By.linkText(shelf.getName())).click();
        acceptNextAlert = true;
        driver.findElement(By.linkText("удалить полку \"" + shelf.getName() + "\"")).click();
        TestCase.assertTrue(closeAlertAndGetItsText().matches("^Удалить все книги с этой полки[\\s\\S]$"));
    }
}
