import org.junit.*;
import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void quality_of_normal_item_should_degrade_at_the_end_of_each_day() {
        // Given
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20) };
        GildedRose app = new GildedRose(items);

        // When
        app.updateQuality();

        // Then
        assertEquals(19, items[0].quality);
    }

    // TODO: quality_of_normal_item_should_not_degrade_to_be_negative
    // TODO: quality_of_aged_brie_should_increase_at_the_end_of_each_day
    // TODO: quality_of_aged_brie_should_increase_up_to_50
    // TODO: quality_of_backstage_passes_should_increase_by_1_if_sellIn_is_more_than_10
    // TODO: quality_of_backstage_passes_should_increase_by_2_if_sellIn_is_more_than_5_and_less_than_11
    // TODO: quality_of_backstage_passes_should_increase_by_3_if_sellIn_is_more_than_0_and_less_than_6
    // TODO: quality_of_backstage_passes_should_increase_up_to_50
    // TODO: sellIn_of_sulfuras_should_never_be_changed
    // TODO: sellIn_of_item_other_than_sulfuras_should_degrade_at_the_end_of_each_day
    // TODO: quality_of_normal_item_should_degrade_by_2_if_sellIn_is_less_than_0
    // TODO: quality_of_backstage_passes_should_degrade_to_be_0_if_sellIn_is_less_than_0
    // TODO: quality_of_aged_brie_should_increase_by_2_if_sellIn_is_less_than_0
}
