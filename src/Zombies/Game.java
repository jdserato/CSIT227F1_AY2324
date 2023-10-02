package Zombies;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    ArrayList<Zombie> zombies;
    ArrayList<Plant> plants;

    public void createGame() {
        zombies = new ArrayList<>();
        plants = new ArrayList<>();
        Zombie normal1 = new NormalZombie();
        Plant pea1 = new Peashooter(1, 5);
        Plant pea2 = new Peashooter(2, 5);
        Plant pea3 = new Peashooter(3, 5);
        Plant pea4 = new Peashooter(4, 5);
        Plant pea5 = new Peashooter(5, 5);
        Plant magnet1 = new MagnetShroom(2, 1);
        Plant magnet2 = new MagnetShroom(4, 1);
        plants.add(pea1);
        plants.add(pea2);
        plants.add(pea3);
        plants.add(pea4);
        plants.add(pea5);
        plants.add(magnet1);
        plants.add(magnet2);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int zomtype = rand.nextInt(3);
            if (zomtype == 0) {
                zombies.add(new NormalZombie());
            } else if (zomtype == 1) {
                zombies.add(new NormalZombie.ConeheadZombie());
            }else if (zomtype == 2) {
                zombies.add(new NormalZombie.BucketheadZombie());
            }
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean result = false;
            for (Plant p : plants) {
                p.attack(zombies);
            }
            for (Zombie z : zombies) {
                result = z.move(plants);
                if (result) {
                    System.out.println("GAME OVER Zombies won");
                    return;
                }
            }
            System.out.println("ZOMBIES: ");
            ArrayList<Zombie> toRemove = new ArrayList<>();
            for (Zombie z : zombies) {
                if (z.hp <= 0) {
                    toRemove.add(z);
                } else {
                    System.out.println(z);
                }
            }
            ArrayList<Plant> toRemovePlant = new ArrayList<>();
            zombies.removeAll(toRemove);
            if (zombies.size() == 0) {
                System.out.println("Plants won");
                return;
            }
            System.out.println("PLANTS: ");
            for (Plant p : plants) {
                if (p.hp <= 0) {
                    toRemovePlant.add(p);
                } else {
                    System.out.println(p);
                }
            }
            plants.removeAll(toRemovePlant);
            sc.nextLine();
        }
    }
}
