import org.junit.*;
import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void quality_of_normal_item_should_degrade_by_1_at_the_end_of_each_day() {
        // Given
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(19, items[0].quality);
    }

    @Test
    public void quality_of_normal_item_should_not_degrade_to_be_negative() {
        // Given
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 0) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(0, items[0].quality);
    }

    @Test
    public void quality_of_aged_brie_should_increase_at_the_end_of_each_day() {
        // Given
        Item[] items = new Item[] {
            new Item("Aged_Brie", 10, 20) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(21, items[0].quality);
    }

    @Test
    public void quality_of_aged_brie_should_increase_up_to_50() {
        // Given
        Item[] items = new Item[] {
            new Item("Aged_Brie", 10, 50) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(50, items[0].quality);
    }

    @Test
    public void quality_of_backstage_passes_should_increase_by_1_if_sellIn_is_more_than_10() {
        // Given
        Item[] items = new Item[] {
            new Item("Backstage_Passes_To_A_TAFKAL80ETC_Concert", 11, 20) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(21, items[0].quality);
    }

    @Test
    public void quality_of_backstage_passes_should_increase_by_2_if_sellIn_is_more_than_5_and_less_than_11() {
        // Given
        Item[] items = new Item[] {
            new Item("Backstage_Passes_To_A_TAFKAL80ETC_Concert", 6, 20) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(22, items[0].quality);
    }

    @Test
    public void quality_of_backstage_passes_should_increase_by_3_if_sellIn_is_more_than_0_and_less_than_6() {
        // Given
        Item[] items = new Item[] {
            new Item("Backstage_Passes_To_A_TAFKAL80ETC_Concert", 5, 20) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(23, items[0].quality);
    }

    @Test
    public void quality_of_backstage_passes_should_increase_up_to_50() {
        // Given
        Item[] items = new Item[] {
            new Item("Backstage_Passes_To_A_TAFKAL80ETC_Concert", 5, 50) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(50, items[0].quality);
    }

    @Test
    public void sellIn_of_sulfuras_should_never_be_changed() {
        // Given
        Item[] items = new Item[] {
            new Item("Sulfuras_Hand_Of_Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(80, items[0].quality);
    }

    @Test
    public void sellIn_of_item_other_than_sulfuras_should_degrade_at_the_end_of_each_day() {
        // Given
        Item[] items = new Item[] {
            new Item("Aged Brie", 0, 20),
            new Item("Backstage_Passes_To_A_TAFKAL80ETC_Concert", 10, 20),
            new Item("+5 Dexterity Vest", -1, 50),
            };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(-1, items[0].sellIn);
        assertEquals(9, items[1].sellIn);
        assertEquals(-2, items[2].sellIn);
    }

    @Test
    public void quality_of_normal_item_should_degrade_by_2_if_sellIn_is_less_than_or_equal_to_0() {
        // Given
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 0, 20)
            };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(18, items[0].quality);
    }

    @Test
    public void quality_of_backstage_passes_should_degrade_to_be_0_if_sellIn_is_less_than_or_equal_to_0() {
        // Given
        Item[] items = new Item[] {
            new Item("Backstage_Passes_To_A_TAFKAL80ETC_Concert", 0, 20)
            };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(0, items[0].quality);
    }

    @Test
    public void quality_of_aged_brie_should_increase_by_2_if_sellIn_is_less_than_or_equal_to_0() {
        // Given
        Item[] items = new Item[] {
            new Item("Aged_Brie", 0, 20)
            };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(22, items[0].quality);
    }

    @Test
    public void quality_of_conjured_item_should_degrade_by_2_at_the_end_of_each_day() {
        // Given
        Item[] items = new Item[] {
            new Item("Conjured_Mana_Cake", 10, 20) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(18, items[0].quality);
    }

    @Test
    public void quality_of_conjured_item_should_degrade_by_4_if_sellIn_is_less_than_or_equal_to_0() {
        // Given
        Item[] items = new Item[] {
            new Item("Conjured_Mana_Cake", 0, 20) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(16, items[0].quality);
    }


    @Test
    public void quality_of_conjured_item_should_not_degrade_to_be_negative() {
        // Given
        Item[] items = new Item[] {
            new Item("Conjured_Mana_Cake", 0, 1) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(0, items[0].quality);
    }

}
