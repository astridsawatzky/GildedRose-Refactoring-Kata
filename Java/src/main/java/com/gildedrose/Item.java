package com.gildedrose;

/**
 * Code is property of the goblin next door.
 * XXX: Do not change!
 */
public class Item {

    public String name;

    /**
     * number of days we have to sell the item.
     */
    public int sellIn;

    /**
     * value of the item.
     */
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
