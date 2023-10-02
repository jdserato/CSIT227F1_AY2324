package Zombies;

public interface Shielders {
    boolean hasShield();
    int shieldHp();
    default void shieldTakeDamage(int damage) {
        getShield().hp -= damage;
    }
    Shield getShield();

}
