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
    BackstagePassesToATAFKAL80ETCConcert {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Backstage");
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
    }
    ;

    public abstract void updateQualityAndSellIn(Item item);

}