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
            if ("Aged Brie".equals(item.name)
                || "Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                    checkedIncreaseQuality(item);

                    if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                        if (item.sellIn < 11) {
                            checkedIncreaseQuality(item);
                        }

                        if (item.sellIn < 6)
                            checkedIncreaseQuality(item);
                    }

            } else if (item.quality > 0) {
                decreaseQuality(item);
            }


            decreaseSellIn(item);


            if (item.sellIn < 0) {
                if ("Aged Brie".equals(item.name)) {
                    checkedIncreaseQuality(item);
                } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
                    wipeOutQuality(item);
                } else if (item.quality > 0) {
                    decreaseQuality(item);
                }
            }
        }
    }

    private void checkedIncreaseQuality(Item item) {
        if (item.quality < 50) {
            increaseQuality(item);
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
