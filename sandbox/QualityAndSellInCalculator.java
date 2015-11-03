public enum QualityAndSellInCalculator {
    AgedBrie("Aged Brie") {
        @Override
        public void updateQualityAndSellIn(Item item) {
        }
    },
    Sulfuras("Sulfuras, Hand of Ragnaros") {
        @Override
        public void updateQualityAndSellIn(Item item) {
        }
    },
    BackStagePasses("Backstage passes to a TAFKAL80ETC concert") {
        @Override
        public void updateQualityAndSellIn(Item item) {
        }
    }
    ;

    private String displayName;

    QualityAndSellInCalculator(String displayName) {
        this.displayName = displayName;
    }
    
    public abstract void updateQualityAndSellIn(Item item);
}