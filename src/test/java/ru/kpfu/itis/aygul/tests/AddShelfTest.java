package ru.kpfu.itis.aygul.tests;

import org.junit.Test;

public class AddShelfTest extends TestBase {

    @Test
    public void testAddShelf() {
        appManager.addShelfHelper.clickAddShelf();
        appManager.addShelfHelper.addShelf(shelf);
        appManager.addShelfHelper.deleteShelf(shelf);
    }

}