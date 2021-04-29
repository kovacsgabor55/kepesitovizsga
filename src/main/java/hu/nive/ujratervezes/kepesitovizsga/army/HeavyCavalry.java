package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {
    private int countAttack = 0;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        if (countAttack == 0) {
            countAttack++;
            return getDamage() * 3;
        } else {
            countAttack++;
            return getDamage();
        }
    }
}
