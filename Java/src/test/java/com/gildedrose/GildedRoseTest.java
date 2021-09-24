package com.gildedrose;

import org.junit.jupiter.api.Test;

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

            assertItemsAreEqual(i, item, itemsAfterOneday[i]);
          }

        Item[] itemsAfter2days=   TestItemsProvider.itemsAfter2Days();
        app.updateQuality();
        for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
            Item item = items[i];


            assertItemsAreEqual(i, item, itemsAfter2days[i]);

        }
        for (int i =0;i<8;i++){
            app.updateQuality();
        }
        Item[] itemsAfter10days = TestItemsProvider.itemsAfter10Days();
        for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
            Item item = items[i];



            assertItemsAreEqual(i, item, itemsAfter10days[i]);

        }
    }

    private void assertItemsAreEqual(int i, Item item, Item item1) {
        assertEquals(item.quality, item1.quality, "itemno: "+i);
        assertEquals(item.sellIn, item1.sellIn,"itemno: "+ i);
        assertEquals(item.name,item1.name ,"itemno: " + i);

    }

}
