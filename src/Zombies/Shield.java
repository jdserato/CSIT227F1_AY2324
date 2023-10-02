package Zombies;

public abstract class Shield {
    int hp;

    public Shield(int hp) {
        this.hp = hp;
    }

    public boolean takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            return true;
        }
        return false;
    }

    public static class Cone extends Shield {

        public Cone() {
            super(370);
        }
    }

    public static class Bucket extends Shield implements Magnetized {

        public Bucket() {
            super(1100);
        }
    }
}
