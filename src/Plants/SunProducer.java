package Plants;

import java.util.Comparator;

public interface SunProducer {
    int produce_sun();
}

interface Attacker {
    default int attack() {
        System.out.println(this + " attacks");
        return 0;
    }
    rangeType rangeType();
}

interface InstantKiller {
    killType killType();
}

interface PlantUpgrade {
    int concurrentSunCost();
}

interface Upgradable {
    PlantUpgrade upgrade();
}

// add more interfaces here
enum rangeType {
    SINGLE_LINE, AOE, LIMITED, FREE_RANGE;
}

enum killType {
    INSTANT, CLOSE_CONTACT;
}