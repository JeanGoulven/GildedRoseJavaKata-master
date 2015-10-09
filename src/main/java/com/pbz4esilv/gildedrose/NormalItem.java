package com.pbz4esilv.gildedrose;


public class NormalItem extends Item implements Normal {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        setQuality(getQuality() - 1);
        setSellIn(getSellIn() - 1);
        if(getSellIn() < 0) setQuality(getQuality() - 2);
        if(getQuality()<0) setQuality(getQuality() - getQuality());
    }
}
