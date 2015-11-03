class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            try {
                QualityAndSellInCalculator.valueOf(items[i].name).updateQualityAndSellIn(items[i]);
            } catch (IllegalArgumentException illegalArgumentException) {
                if (items[i].quality > 0) {
                    items[i].quality -= 1;
                }

                items[i].sellIn -= 1;

                if (items[i].sellIn < 0) {
                    if (items[i].quality > 0) {
                        items[i].quality -= 1;
                    }
                }
            }

        }
    }
}
