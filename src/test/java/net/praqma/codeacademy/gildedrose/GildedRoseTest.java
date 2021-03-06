package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        
    }

    @Test
    public void bar() {
        Item[] items = new Item[] {new Item("bar", 2, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("bar", app.items[0].name);
    }

    @Test
    public void spam() {
        Item[] items = new Item[] {new Item("bar", 2, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("bar", app.items[0].name);
    }

    @Test
    public void otrhhuf() {
        Item[] items = new Item[] {new Item("bar", 2, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("bar", app.items[0].name);
    }

    @Test
    public void stuff() {
        Item[] items = new Item[] {new Item("bar", 2, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("bar", app.items[0].name);
    }

    @Test
    public void aVeryGoodTest() {
        Item[] items = new Item[] {new Item("test", 2, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("test", app.items[0].name);
    }

    @Test
    public void aVeryGoodNewTest() {
        Item[] items = new Item[] {new Item("test", 2, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("test", app.items[0].name);
    }

}
