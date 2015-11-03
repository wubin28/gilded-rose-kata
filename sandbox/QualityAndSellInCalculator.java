public enum QualityAndSellInCalculator {
    AgedBrie("Aged Brie") {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Aged Brie.");
        }
    },
    Sulfuras("Sulfuras, Hand of Ragnaros") {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Sulfuras");
        }
    },
    BackStagePasses("Backstage passes to a TAFKAL80ETC concert") {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Backstage");
        }
    }
    ;

    private String displayName;

    QualityAndSellInCalculator(String displayName) {
        this.displayName = displayName;
    }
    
    public abstract void updateQualityAndSellIn(Item item);

    @Override
    public String toString() {
        return this.displayName;
    }
}