public enum QualityAndSellInCalculator {
    AgedBrie {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Aged Brie.");
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
        }
    }
    ;

    public abstract void updateQualityAndSellIn(Item item);

}