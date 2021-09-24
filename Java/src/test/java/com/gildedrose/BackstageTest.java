package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BackstageTest {

    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

    @Test
    void backstages_with_sellin_13_add_1() {

    Item[] items =      new Item[]{new Item(BACKSTAGE, 13, 22)};

    Item[] itemsAfter = new Item[]{new Item(BACKSTAGE, 12, 23)};
    GildedRose gr = new GildedRose(items);
        gr.updateQuality();
        assertEquals(itemsAfter[0].toString(), items[0].toString());


}
    @Test
    void backstages_with_sellin_5_add_3() {

        Item[] items =      new Item[]{new Item(BACKSTAGE, 5, 22)};

        Item[] itemsAfter = new Item[]{new Item(BACKSTAGE, 4, 25)};
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();

        assertEquals(itemsAfter[0].toString(), items[0].toString());
    }
    @Test
    void backstages_with_sellin_10_add_2() {

        Item[] items =      new Item[]{new Item(BACKSTAGE, 10, 22)};

        Item[] itemsAfter = new Item[]{new Item(BACKSTAGE, 9, 24)};
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();

        assertEquals(itemsAfter[0].toString(), items[0].toString());
    }
    @Test
    void backstages_with_sellin_1_add_3() {

        Item[] items =      new Item[]{new Item(BACKSTAGE, 1, 22)};

        Item[] itemsAfter = new Item[]{new Item(BACKSTAGE, 0, 25)};
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();

        assertEquals(itemsAfter[0].toString(), items[0].toString());
    }
    @Test
    void backstages_with_sellin_0_wipe() {

        Item[] items =      new Item[]{new Item(BACKSTAGE, 0, 22)};

        Item[] itemsAfter = new Item[]{new Item(BACKSTAGE, -1, 0)};
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();

        assertEquals(itemsAfter[0].toString(), items[0].toString());
    }
}
