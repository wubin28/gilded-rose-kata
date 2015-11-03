public enum QualityAndSellInCalculator {
    AgedBrie {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Aged Brie.");
            if (item.quality < 50) item.quality += 1;

            item.sellIn -= 1;

            if (item.sellIn < 0 && item.quality < 50) {
                item.quality += 1;
            }
        }
    },
    SulfurasHandOfRagnaros {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Sulfuras");
        }
    },
    BackStagePassesToATAFKAL80Concert {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Backstage");
            if (items[i].quality < 50) {
                items[i].quality += 1;

                if (items[i].sellIn < 11) {
                    if (items[i].quality < 50) {
                        items[i].quality += 1;
                    }
                }

                if (items[i].sellIn < 6) {
                    if (items[i].quality < 50) {
                        items[i].quality += 1;
                    }
                }
            }

            items[i].sellIn -= 1;

            if (items[i].sellIn < 0) {
                items[i].quality = 0;
            }

        }
    }
    ;

    public abstract void updateQualityAndSellIn(Item item);

}