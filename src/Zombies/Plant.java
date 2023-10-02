package Zombies;

import java.util.List;

public abstract class Plant {
    String name;
    int hp;
    int damage;
    int price;
    int column, row;

    public Plant(String name, int hp, int damage, int price, int row, int col) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.price = price;
        this.row = row;
        this.column = col;
    }

    public abstract void attack(List<Zombie> zombies);

    @Override
    public String toString() {
        return name + " (" + hp + ") at lawn " + row + " col " + column;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            dies();
        }
    }

    private void dies() {
        System.out.println(name + " dies");
    }

}
