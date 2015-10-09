package com.pbz4esilv.gildedrose;


public class Cheese extends Item {

    public Cheese(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void updateQuality(){
        if(getQuality()<50) setQuality(getQuality() + 1);
        setSellIn(getSellIn() - 1);
    }
}
