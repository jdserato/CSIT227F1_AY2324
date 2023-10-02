package Zombies;

import java.util.List;

public class MagnetShroom extends Plant{
    boolean absorbing = false;
    public static final int MAX_COOLDOWN = 3;
    int cooldown;

    public MagnetShroom(int row, int col) {
        super("Magnet-shroom", 500, 0, 100, row, col);
    }

    @Override
    public void attack(List<Zombie> zombies) {
        if (absorbing) {
            cooldown--;
            if (cooldown == 0) {
                absorbing = false;
            }
        } else {
            for (Zombie z : zombies) {
                if (z instanceof Shielders && ((Shielders)z).getShield() instanceof Magnetized && ((Shielders)z).hasShield()) {
                    System.out.println("Taken a shield");
                    ((Shielders)z).getShield().hp = 0;
                    cooldown = MAX_COOLDOWN;
                    absorbing = true;
                    break;
                }
            }
        }
    }
}
