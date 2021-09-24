package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = TestItemsProvider.initialItemsTestArray();
        Item[] itemsAfterOneDay = TestItemsProvider.itemsAfterOneDay();
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        TestItemsProvider.assertArraysAreEqual( itemsAfterOneDay,items);

        Item[] itemsAfter2days = TestItemsProvider.itemsAfter2Days();
        app.updateQuality();
        TestItemsProvider.assertArraysAreEqual(itemsAfter2days,items);
        for (int i = 0; i < 8; i++) {
            app.updateQuality();
        }
        Item[] itemsAfter10days = TestItemsProvider.itemsAfter10Days();
        TestItemsProvider.assertArraysAreEqual(itemsAfter10days,items);
    }


}
