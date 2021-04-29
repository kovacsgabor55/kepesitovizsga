package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {
    private final List<MilitaryUnit> militaryUnitList;

    public Army() {
        this.militaryUnitList = new ArrayList<>();
    }

    public int getArmySize() {
        return militaryUnitList.size();
    }

    public int getArmyDamage() {
        int counter = 0;
        for (MilitaryUnit item : militaryUnitList) {
            counter += item.doDamage();
        }
        return counter;
    }

    public void damageAll(int damage) {
        Iterator<MilitaryUnit> it = militaryUnitList.iterator();
        while (it.hasNext()) {
            MilitaryUnit item = it.next();
            item.sufferDamage(damage);
            if (item.getHitPoints() < 25) {
                it.remove();
            }
        }
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnitList.add(militaryUnit);
    }
}
