package com.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TamagotchiTest {
    private Tamagotchi tamagotchi;
    
    @Before
    public void setUp() {
        tamagotchi = new Tamagotchi();
        
        tamagotchi.setStats(8, 5, 3, 5);
    }
    
    @Test
    public void testPlay() {
        tamagotchi.play();

        assertEquals("Mood should increase by 1 after playing", ":-)", tamagotchi.getMoodStat());
        assertEquals("Hunger should increase by 1 after playing", 6, tamagotchi.getHungerStat());
        assertEquals("Energy should decrease by 1 after playing", "(-_-)", tamagotchi.getEnergyStat());
    }
    
    @Test
    public void testFeed() {
        tamagotchi.feed();

        assertEquals("Hunger should decrease by 2 after feeding", 3, tamagotchi.getHungerStat());
        assertEquals("Energy should increase by 1 after feeding", ":-|", tamagotchi.getEnergyStat());
        assertEquals("Fullness should increase by 1 after feeding", 6, tamagotchi.getFullnessStat());
    }
    
    @Test
    public void testSleep() {
        tamagotchi.sleep();

        assertEquals("Energy should increase by 2 after sleeping", ":-|", tamagotchi.getEnergyStat());
        assertEquals("Hunger should increase by 1 after sleeping", 6, tamagotchi.getHungerStat());
    }
    
    @Test
    public void testPoop() {
        tamagotchi.poop();
        
        assertEquals("Fullness should decrease by 3 after pooping", 2, tamagotchi.getFullnessStat());

        tamagotchi.poop();
        
        assertEquals("Fullness should be 0 if already less than 3", 0, tamagotchi.getFullnessStat());
    }
    
    @Test
    public void testTimePasses() {
        tamagotchi.timePasses();
        
        assertEquals("Energy should decrease by 1 after time passes", "(-_-)", tamagotchi.getEnergyStat());
        assertEquals("Mood should decrease by 1 after time passes", ":-|", tamagotchi.getMoodStat());
        assertEquals("Hunger should increase by 1 after time passes", 6, tamagotchi.getHungerStat());
    }
}
