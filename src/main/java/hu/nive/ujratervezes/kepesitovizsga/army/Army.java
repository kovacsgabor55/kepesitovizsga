package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
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
        for (MilitaryUnit item : militaryUnitList) {
            item.sufferDamage(damage);
        }
        List<MilitaryUnit> tmp = new ArrayList<>();
        for (MilitaryUnit item : militaryUnitList) {
            if (item.getHitPoints() >= 25) {
                tmp.add(item);
            }
        }
        militaryUnitList.clear();
        militaryUnitList.addAll(tmp);
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnitList.add(militaryUnit);
    }
}
