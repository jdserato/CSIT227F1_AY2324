package Zombies;

public class NormalZombie extends Zombie{
    public NormalZombie() {
        super("Normal Zombie", 181, 4.7, 100);
    }

    public static class BucketheadZombie extends NormalZombie implements Shielders {
        Shield.Bucket myBucket;

        public BucketheadZombie() {
            name = "BucketheadZombie";
            myBucket = new Shield.Bucket();
        }

        @Override
        public boolean hasShield() {
            return myBucket.hp > 0;
        }

        @Override
        public int shieldHp() {
            return myBucket.hp;
        }

        @Override
        public Shield getShield() {
            return myBucket;
        }
    }

    public static class ConeheadZombie extends NormalZombie implements Shielders {
        Shield.Cone myCone;
        public ConeheadZombie() {
            name = "Conehead Zombie";
            myCone = new Shield.Cone();
        }

        @Override
        public boolean hasShield() {
            return myCone.hp > 0;
        }

        @Override
        public int shieldHp() {
            return myCone.hp;
        }

        @Override
        public Shield getShield() {
            return myCone;
        }


    }
}
