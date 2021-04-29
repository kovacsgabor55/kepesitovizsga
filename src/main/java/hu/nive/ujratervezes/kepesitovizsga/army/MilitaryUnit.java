package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {
    private int health;
    private final int damage;
    private final boolean armor;

    protected MilitaryUnit(int health, int damage, boolean armor) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    int doDamage() {
        return damage;
    }

    void sufferDamage(int damage) {
        if (armor) {
            health -= (damage / 2);
        } else {
            health -= damage;
        }
    }

    public int getHitPoints() {
        return health;
    }
}
