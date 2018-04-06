package ru.kpfu.itis.aygul.tests;

import org.junit.After;
import org.junit.Before;
import ru.kpfu.itis.aygul.manager.AppManager;
import ru.kpfu.itis.aygul.models.AccountData;
import ru.kpfu.itis.aygul.models.SearchModel;
import ru.kpfu.itis.aygul.models.Shelf;

public class TestBase {

    protected AppManager appManager;
    protected AccountData user;
    protected Shelf shelf;
    protected SearchModel searchModel;

    @Before
    public void setUp() throws Exception {
        appManager = new AppManager();
        appManager.getBasePage();
        appManager.loginHelper.getLoginPage();
        user = new AccountData("d1057213@nwytg.com", "password123");
        shelf = new Shelf("Моя первая полка", true);
        searchModel = new SearchModel("Пушкин");
        appManager.loginHelper.login(user);
    }

    @After
    public void tearDown() throws Exception {
        appManager.loginHelper.logout();
        appManager.tearDown();
    }

}