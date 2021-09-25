package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

interface Assessor{
           void update(Item item);
    }

class GildedRose {
    Item[] items;

    Map<String,Assessor> assessors = new HashMap<>();

    public GildedRose(Item[] items) {
        this.items = items;
        assessors.put("Sulfuras, Hand of Ragnaros",GildedRose::updateSulfurus);
        assessors.put("Aged Brie",GildedRose::updateAgedBrie);
        assessors.put("Backstage passes to a TAFKAL80ETC concert",GildedRose::updateBackstagePasses);

    }

    public void updateQuality() {

        for (Item item : items) {
            assessors.getOrDefault(item.name,GildedRose::update).update(item);
        }
    }


    private static void update(Item item) {
        decreaseSellIn(item);

        if (item.sellIn >= 0) {
            decreaseQuality(item, 1);
        } else {
            decreaseQuality(item, 2);
        }
    }
    private static void updateSulfurus(Item item) {

    }

    private static void updateBackstagePasses(Item item) {
        decreaseSellIn(item);

        if (item.sellIn <0) {
            wipeOutQuality(item);
        }else

        if (item.sellIn < 5) {
            increaseQuality(item, 3);
        }else
        if (item.sellIn < 10) {
            increaseQuality(item, 2);
        } else {
            increaseQuality(item, 1);
        }
    }

    private static void updateAgedBrie(Item item) {
        decreaseSellIn(item);
        if (item.sellIn >= 0) {
            increaseQuality(item, 1);

        } else {
            increaseQuality(item, 2);

        }
    }

    private static void decreaseQuality(Item item, int by) {

            item.quality = Math.max(item.quality - by,0);

    }

    private static void increaseQuality(Item item, int by) {

            item.quality = Math.min( item.quality + by,50);

    }

    private static void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private static void wipeOutQuality(Item item) {
        item.quality = 0;
    }

}
