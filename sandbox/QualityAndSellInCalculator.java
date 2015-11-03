public enum QualityAndSellInCalculator {
    Aged_Brie {
        @Override
        public void updateQualityAndSellIn(Item item) {
            if (item.quality < 50) item.quality += 1;

            item.sellIn -= 1;

            if (item.sellIn < 0 && item.quality < 50) {
                item.quality += 1;
            }
        }
    },
    Sulfuras_Hand_Of_Ragnaros {
        @Override
        public void updateQualityAndSellIn(Item item) {
        }
    },
    Backstage_Passes_To_A_TAFKAL80ETC_Concert {
        @Override
        public void updateQualityAndSellIn(Item item) {
            if (item.quality < 50) {
                item.quality += 1;

                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality += 1;
                    }
                }

                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality += 1;
                    }
                }
            }

            item.sellIn -= 1;

            if (item.sellIn < 0) {
                item.quality = 0;
            }

        }
    },
    Conjured_Mana_Cake {
        @Override
        public void updateQualityAndSellIn(Item item) {
            if (items[i].quality > 0) {
                items[i].quality -= 2;
            }

            items[i].sellIn -= 1;

            if (items[i].sellIn < 0) {
                if (items[i].quality > 0) {
                    items[i].quality -= 1;
                }
            }
        }
    }
    ;

    public abstract void updateQualityAndSellIn(Item item);

}