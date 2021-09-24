package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestItemsProvider {
    static Item[] initialItemsTestArray() {
        return new Item[]{
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            //new Item("Conjured Mana Cake", 3, 6)
            };
    }
    static Item[] itemsAfterOneDay() {
        return new Item[]{
            new Item("+5 Dexterity Vest", 9, 19), //
            new Item("Aged Brie", 1, 1), //
            new Item("Elixir of the Mongoose", 4, 6), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50),
            new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50),
            // this conjured item does not work properly yet
            //new Item("Conjured Mana Cake", 3, 6)
        };
    }

    public static Item[] itemsAfter10Days() {
        return new Item[]{
            new Item("+5 Dexterity Vest",  0, 10), //
            new Item("Aged Brie", -8, 18), //
            new Item("Elixir of the Mongoose", -5, 0), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 35),
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50),
            new Item("Backstage passes to a TAFKAL80ETC concert", -5, 0),
            // this conjured item does not work properly yet
            //new Item("Conjured Mana Cake", 3, 6)
        };
    }

public static Item[] itemsAfter2Days() {
    return new Item[]{
        new Item("+5 Dexterity Vest", 8, 18), //
        new Item("Aged Brie", 0, 2), //
        new Item("Elixir of the Mongoose", 3, 5), //
        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        new Item("Backstage passes to a TAFKAL80ETC concert", 13, 22),
        new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50),
        new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50),
        // this conjured item does not work properly yet
        //new Item("Conjured Mana Cake", 3, 6)
    };
}

    static void assertArraysAreEqual(Item[] items, Item[] otherItems) {
    for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
        Item item = items[i];

        assertEquals(item.toString(), otherItems[i].toString(), "item No: " + i);


    }
}
}
