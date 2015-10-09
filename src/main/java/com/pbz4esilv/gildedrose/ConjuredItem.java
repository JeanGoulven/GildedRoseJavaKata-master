package com.pbz4esilv.gildedrose;


public class ConjuredItem extends Item implements Conjured {
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        if(getSellIn()>=0){
            setQuality(getQuality() - 2);
        }
        else{
            setQuality(getQuality() - 4);
        }
        setSellIn(getSellIn() - 1);
        if(getQuality()<=0) setQuality(getQuality() - getQuality());
    }


}
