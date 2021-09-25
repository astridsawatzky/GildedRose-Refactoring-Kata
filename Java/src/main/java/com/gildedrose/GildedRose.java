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
            ) {
                decreaseSellIn(item);
                if (item.sellIn >= 0) {
                    increaseQuality(item, 1);

                } else {
                    increaseQuality(item, 2);

                }
            } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
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


            } else {
                decreaseSellIn(item);

                if (item.sellIn >= 0) {
                    decreaseQuality(item, 1);
                } else {
                    decreaseQuality(item, 2);
                }

            }

        }
    }

    private void decreaseQuality(Item item, int by) {

            item.quality = Math.max(item.quality - by,0);

    }

    private void increaseQuality(Item item, int by) {

            item.quality = Math.min( item.quality + by,50);

    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void wipeOutQuality(Item item) {
        item.quality = 0;
    }

}
