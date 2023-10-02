package Zombies;

import java.util.List;

public class Peashooter extends Plant{
    public Peashooter(int row, int col) {
        super("Peashooter", 500, 20, 100, row, col);
    }

    @Override
    public void attack(List<Zombie> zombies) {
        zombies.sort(new Zombie.ZombieColumnComparator());
        for (Zombie z : zombies) {
            if (this.row == z.row) {
                z.takeDamage(damage);
                break;
            }
        }
    }
}
