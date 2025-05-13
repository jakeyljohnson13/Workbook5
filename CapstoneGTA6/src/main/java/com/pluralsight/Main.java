package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            Warrior player = new Warrior("YearUp Warrior", 40, 8);
            Enemy monster = new Enemy("NullPointerException", 30, 6);

            System.out.println(" Welcome to the Code Dungeon!");
            System.out.println("A wild " + monster.name + " appears!\n");

            while (player.isAlive() && monster.isAlive()) {
                System.out.println("\nYour HP: " + player.hp + " | Enemy HP: " + monster.hp);
                System.out.println("Choose an action:");
                System.out.println("1. Attack");
                System.out.println("2. Fireball");
                System.out.println("3. Heal");
                System.out.println("4. HP Spin Attack");
                System.out.println("5. Run");

                String choice = input.nextLine();
    }
}