public enum QualityAndSellInCalculator {
    Aged_Brie {
        @Override
        public void updateQualityBeforeDecreasingSellIn(Item item) {
            if (item.quality < 50) item.quality += 1;
        }

        @Override
        public void updateQualityAfterDecreasingSellIn(Item item) {
            if (item.sellIn < 0 && item.quality < 50) {
                item.quality += 1;
            }
        }
    },
    Sulfuras_Hand_Of_Ragnaros {
        @Override
        public void updateQualityBeforeDecreasingSellIn(Item item) {
        }

        @Override
        public void updateQualityAfterDecreasingSellIn(Item item) {
        }
    },
    Backstage_Passes_To_A_TAFKAL80ETC_Concert {
        @Override
        public void updateQualityBeforeDecreasingSellIn(Item item) {
            if (item.sellIn > 10) {
                item.quality = (item.quality < 50 ? item.quality + 1 : 50);
                return;
            }
            if (item.sellIn > 5) {
                item.quality = (item.quality < 50 ? item.quality + 2 : 50);
                return;
            }
            item.quality = (item.quality < 50 ? item.quality + 3 : 50);
        }

        @Override
        public void updateQualityAfterDecreasingSellIn(Item item) {
            if (item.sellIn < 0) {
                item.quality = 0;
            }
        }
    },
    Conjured_Mana_Cake {
        @Override
        public void updateQualityBeforeDecreasingSellIn(Item item) {
            if (item.quality > 0) {
                item.quality -= 2;
                if (item.quality < 0) item.quality = 0;
            }
        }

        @Override
        public void updateQualityAfterDecreasingSellIn(Item item) {
            if (item.sellIn < 0) {
                if (item.quality > 0) {
                    item.quality -= 2;
                    if (item.quality < 0) item.quality = 0;
                }
            }
        }
    }
    ;

    public void updateQualityAndSellIn(Item item){
        updateQualityBeforeDecreasingSellIn(item);
        decreaseSellIn(item);
        updateQualityAfterDecreasingSellIn(item);
    }
    
    protected abstract void updateQualityBeforeDecreasingSellIn(Item item); 

    protected void decreaseSellIn(Item item) {
        item.sellIn -= 1;
    }

    protected abstract void updateQualityAfterDecreasingSellIn(Item item); 
}