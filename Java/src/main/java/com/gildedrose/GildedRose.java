package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!"Aged Brie".equals(item.name)
                && !"Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                if (item.quality > 0) {
                    if (!"Sulfuras, Hand of Ragnaros".equals(item.name)) {
                        decreaseQuality(item);
                    }
                }
            } else {
                if (item.quality < 50) {
                    increaseQuality(item);

                    if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                increaseQuality(item);
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                increaseQuality(item);
                            }
                        }
                    }
                }
            }

            if (!"Sulfuras, Hand of Ragnaros".equals(item.name)) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!"Aged Brie".equals(item.name)) {
                    if (!"Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                        if (item.quality > 0) {
                            if (!"Sulfuras, Hand of Ragnaros".equals(item.name)) {
                                decreaseQuality(item);
                            }
                        }
                    } else {
                        wipeOutQuality(item);
                    }
                } else {
                    if (item.quality < 50) {
                        increaseQuality(item);
                    }
                }
            }
        }
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
