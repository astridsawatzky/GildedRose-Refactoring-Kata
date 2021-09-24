package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if ("Aged Brie".equals(item.name)
                || "Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                    if (item.quality < 50) {
                        increaseQuality(item);

                        if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                            if (item.sellIn < 11 && item.quality < 50) {
                                increaseQuality(item);
                            }

                            if (item.sellIn < 6 && item.quality < 50) {
                                increaseQuality(item);
                            }
                        }
                    }
                } else {
                if (!"Sulfuras, Hand of Ragnaros".equals(item.name) && item.quality > 0) {
                    decreaseQuality(item);
                }
            }

            if (!"Sulfuras, Hand of Ragnaros".equals(item.name)) {
                decreaseSellIn(item);
            }

            if (item.sellIn < 0) {
                if ("Aged Brie".equals(item.name)) {
                    if (item.quality < 50) {
                        increaseQuality(item);
                    }
                } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                    wipeOutQuality(item);
                } else {
                    if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {

                    } else
                    if (item.quality > 0) {
                        decreaseQuality(item);
                    }
                }
            }
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void wipeOutQuality(Item item) {
        item.quality = 0;
    }

    private void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }

    private void increaseQuality(Item item) {
        item.quality = item.quality + 1;
    }
}
