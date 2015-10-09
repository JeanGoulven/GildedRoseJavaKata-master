package com.pbz4esilv.gildedrose;


public class Other extends Item implements Others{

    public Other(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }


    public void updateQuality() {
        if(getQuality()<50) setQuality(getQuality() + 1);
        setSellIn(getSellIn() - 1);
        if(getSellIn()<11 && getQuality()<50) setQuality(getQuality() + 1);
        if(getSellIn()<6 && getQuality()<50) setQuality(getQuality() + 1);
        if (getSellIn() < 0) setQuality(getQuality() - getQuality());
    }
}
