import org.junit.*;
import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    // TODO: both_sellIn_and_quality_of_normal_item_should_be_lowered_at_the_end_of_each_day
    // TODO: quality_of_normal_item_should_not_be_lowered_to_be_negative
    // TODO: quality_of_aged_brie_should_increase_at_the_end_of_each_day
    // TODO: quality_of_aged_brie_should_not_increase_to_be_more_than_50
    // TODO: quality_of_backstage_passes_should_increase_by_1_if_sellIn_is_more_than_10

}
