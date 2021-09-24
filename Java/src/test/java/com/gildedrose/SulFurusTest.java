package com.gildedrose;

import org.junit.jupiter.api.Test;

public class SulFurusTest {

    @Test
    void sulfurus_never_changes() {

        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        };
        Item[] itemsAfter = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        };
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();

        TestItemsProvider.assertArraysAreEqual(itemsAfter, gr.items);

    }

}
