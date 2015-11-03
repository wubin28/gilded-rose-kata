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

                System.out.println(">>>In IllegalArgumentException.");

                if (items[i].name.equals("Aged Brie")) {
                    if (items[i].quality < 50) items[i].quality += 1;

                    items[i].sellIn -= 1;

                    if (items[i].sellIn < 0 && items[i].quality < 50) {
                        items[i].quality += 1;
                    }
                    continue;
                }

                if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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

                    continue;
                }

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
