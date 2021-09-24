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
        AssertArraysAreEqual(items, itemsAfterOneDay);

        Item[] itemsAfter2days = TestItemsProvider.itemsAfter2Days();
        app.updateQuality();
        AssertArraysAreEqual(items, itemsAfter2days);
        for (int i = 0; i < 8; i++) {
            app.updateQuality();
        }
        Item[] itemsAfter10days = TestItemsProvider.itemsAfter10Days();
        AssertArraysAreEqual(items, itemsAfter10days);
    }

    private void AssertArraysAreEqual(Item[] items, Item[] otherItems) {
        for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
            Item item = items[i];

            assertItemsAreEqual(i, item, otherItems[i]);
        }
    }

    private void assertItemsAreEqual(int i, Item item, Item item1) {
        assertEquals(item.quality, item1.quality, "item No: " + i);
        assertEquals(item.sellIn, item1.sellIn, "item No: " + i);
        assertEquals(item.name, item1.name, "item No: " + i);

    }

}
