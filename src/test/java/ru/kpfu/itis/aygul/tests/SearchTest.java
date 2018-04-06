package ru.kpfu.itis.aygul.tests;

import org.junit.Test;

public class SearchTest extends TestBase {

    @Test
    public void testSearch() {
        appManager.getBasePage();
        appManager.searchHelper.search(searchModel);
        appManager.searchHelper.clickSearch();
    }

}
