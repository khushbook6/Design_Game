//package com.example.MagicalArena;

import java.util.Random;

public class Player {
    private int health;
    private int strength;
    private int attack;
    private Random random;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    public int rollAttackDie() {
        return random.nextInt(6) + 1;
    }

    public int rollDefenseDie() {
        return random.nextInt(6) + 1;
    }

    public boolean isAlive() {
        return health > 0;
    }
}