package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = TestItemsProvider.initialItemsTestArray();
        Item[] itemsAfterOneday = TestItemsProvider.itemsAfterOneDay();
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
            Item item = items[i];

            assertEquals(item.quality,itemsAfterOneday[i].quality,i );
            assertEquals(item.sellIn,itemsAfterOneday[i].sellIn ,i);
            assertEquals(item.name,itemsAfterOneday[i].name ,"itemno: " + i);
        }

    }

}
