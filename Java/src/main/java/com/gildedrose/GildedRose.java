package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (Item item : items) {

            if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {
                continue;
            }
            decreaseSellIn(item);
            if ("Aged Brie".equals(item.name)
            ) {
                increaseQuality(item);
            } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                increaseQuality(item);

                if (item.sellIn < 10) {
                    increaseQuality(item);
                }

                if (item.sellIn < 5) {
                    increaseQuality(item);
                }


            } else {
                decreaseQuality(item);
            }





            if (item.sellIn < 0) {
                if ("Aged Brie".equals(item.name)) {
                    increaseQuality(item);
                } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                    wipeOutQuality(item);
                } else {
                    decreaseQuality(item);
                }
            }
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void wipeOutQuality(Item item) {
        item.quality = 0;
    }

}
