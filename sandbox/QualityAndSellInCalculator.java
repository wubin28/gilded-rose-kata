public enum QualityAndSellInCalculator {
    AgedBrie("Aged Brie") {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Aged Brie.");
        }
        @Override
        public String toString() {
            return super.displayName;
        }
    },
    Sulfuras("Sulfuras, Hand of Ragnaros") {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Sulfuras");
        }
        @Override
        public String toString() {
            return super.displayName;
        }
    },
    BackStagePasses("Backstage passes to a TAFKAL80ETC concert") {
        @Override
        public void updateQualityAndSellIn(Item item) {
            System.out.println(">>>In Backstage");
        }
        @Override
        public String toString() {
            return super.displayName;
        }
    }
    ;

    private String displayName;

    QualityAndSellInCalculator(String displayName) {
        this.displayName = displayName;
    }
    
    public abstract void updateQualityAndSellIn(Item item);

}