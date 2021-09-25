package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

class GildedRose {
    Item[] items;
    Map<String, Assessor> assessors = new HashMap<>();

    public GildedRose(Item[] items) {
        this.items = items;
        assessors.put("Sulfuras, Hand of Ragnaros", sulfurus);
        assessors.put("Aged Brie", agedBrie);
        assessors.put("Backstage passes to a TAFKAL80ETC concert", backstagePasses);

    }

    public void updateQuality() {

        for (Item item : items) {
            assessors.getOrDefault(item.name, standard).update(item);
        }
    }
    interface Assessor {
        void update(Item item);
    }
    Assessor agedBrie = item -> {
        item.sellIn--;
        if (item.sellIn >= 0) {

            item.quality = increasedQuality(item, 1);

        } else {

            item.quality = increasedQuality(item, 2);

        }
    };

    Assessor backstagePasses = item -> {
        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.sellIn < 5) {

            item.quality = increasedQuality(item, 3);

        } else if (item.sellIn < 10) {

            item.quality = increasedQuality(item, 2);

        } else {

            item.quality = increasedQuality(item, 1);

        }
    };

    Assessor standard = item ->
    {
        item.sellIn--;

        if (item.sellIn >= 0) {

            item.quality = decreaseQuality(item, 1);

        } else {

            item.quality = decreaseQuality(item, 2);

        }
    };

    Assessor sulfurus = i -> {
    };

    private int increasedQuality(Item item, int i) {
        return Math.min(item.quality + i, 50);
    }

    private int decreaseQuality(Item item, int i) {
        return Math.max(item.quality - i, 0);
    }


}
