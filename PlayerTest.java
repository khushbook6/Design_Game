//package com.example.MagicalArena;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private Player player;

    public void setUp() {
        player = new Player(50, 5, 10);
    }

    public void testPlayerInitialization() {
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    public void testTakeDamage() {
        player.takeDamage(20);
        assertEquals(30, player.getHealth());
        player.takeDamage(40);
        assertEquals(0, player.getHealth());
    }

    public void testIsAlive() {
        assertTrue(player.isAlive());
        player.takeDamage(50);
        assertFalse(player.isAlive());
    }
}