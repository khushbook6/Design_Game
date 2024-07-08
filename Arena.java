//package com.example.MagicalArena;

public class Arena {
    private Player player1;
    private Player player2;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void fight() {
        Player attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        while (player1.isAlive() && player2.isAlive()) {
            performAttack(attacker, defender);

            if (defender.isAlive()) {
                // Swap roles
                Player temp = attacker;
                attacker = defender;
                defender = temp;
            }
        }

        System.out.println("Fight ended. Winner: " + (player1.isAlive() ? "Player 1" : "Player 2"));
    }

    private void performAttack(Player attacker, Player defender) {
        int attackRoll = attacker.rollAttackDie();
        int defenseRoll = defender.rollDefenseDie();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseValue = defender.getStrength() * defenseRoll;

        int netDamage = Math.max(0, attackDamage - defenseValue);
        defender.takeDamage(netDamage);

        System.out.println("Attacker (Health: " + attacker.getHealth() + ") rolls " + attackRoll + " for attack.");
        System.out.println("Defender (Health: " + defender.getHealth() + ") rolls " + defenseRoll + " for defense.");
        System.out.println("Net damage: " + netDamage);
        System.out.println("Defender's new health: " + defender.getHealth());
    }
}