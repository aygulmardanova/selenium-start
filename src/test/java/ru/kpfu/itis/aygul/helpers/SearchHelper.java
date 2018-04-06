package ru.kpfu.itis.aygul.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.kpfu.itis.aygul.manager.AppManager;
import ru.kpfu.itis.aygul.models.SearchModel;

public class SearchHelper extends HelperBase {


    public SearchHelper(AppManager appManager) {
        super(appManager);
    }

    public void search(SearchModel searchModel) {
        WebElement input = driver.findElement(By.id("query"));
        input.click();
        input.clear();
        input.sendKeys(searchModel.getSearchField());
    }

    public void clickSearch() {
        WebElement searchButton = driver.findElement(By.xpath("(//input[@value='искать'])"));
        searchButton.click();
    }
}
