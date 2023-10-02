package Zombies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public abstract class Zombie {
    String name;
    int hp;
    double speed;
    int dps;
    double column;
    int row;

    public Zombie(String name, int hp, double speed, int dps) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.dps = dps;
        column = 10;
        Random r = new Random();
        row = r.nextInt(5) + 1;
    }

    public void takeDamage(int damage) {
        if (this instanceof Shielders && ((Shielders) this).hasShield()) {
            Shielders s = (Shielders) this;
            s.shieldTakeDamage(damage);
        } else {
            hp -= damage;
            if (hp <= 0) {
                die();
            }
        }
    }

    private void die() {
        System.out.println("Zombie dies");
    }

    public boolean move(ArrayList<Plant> plants) {
        if (plantsAtFront(plants) != null) {
            attack(plantsAtFront(plants));
        }
        column -= (1/speed);
        if (column < 0) {
            System.out.println("Zombie ate your brains!");
            return true;
        }
        return false;
    }

    private void attack(Plant plant) {
        plant.takeDamage(dps);
    }

    private Plant plantsAtFront(ArrayList<Plant> plants) {
        for (Plant p : plants) {
            if (row == p.row && Math.ceil(column) == p.column) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (this instanceof Shielders) {
            return name + " (" + hp + " + " + ((Shielders) this).shieldHp() + ") at lawn " + row + " col " + column;
        }
        return name + " (" + hp + ") at lawn " + row + " col " + column;
    }

    public static class ZombieColumnComparator implements Comparator<Zombie> {

        @Override
        public int compare(Zombie o1, Zombie o2) {
            return Double.compare(o1.column, o2.column);
        }
    }
}
