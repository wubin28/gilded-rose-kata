public enum QualityAndSellInCalculator {
    AgedBrie {
        @Override
        public void updateQualityAndSellIn(Item item) {
        }
    },
    Sulfuras("Sulfuras, Hand of Ragnaros") {
        @Override
        public void updateQualityAndSellIn(Item item) {
        }
    },
    BackStagePasses {
        @Override
        public void updateQualityAndSellIn(Item item) {
        }
    }
    ;
    
    public abstract void updateQualityAndSellIn(Item item);
}