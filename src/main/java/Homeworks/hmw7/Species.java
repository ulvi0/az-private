package Homeworks.hmw7;


public enum Species {
    WOLF(true, false, 4),
    DOG(true, false, 4),
    CAT(true, false, 4),
    HAMSTER(true, false, 4),
    FISH(false, false, 0),
    ROBOCAT(false, false, 4),
    UNKNOWN();

    boolean hasFur, canFly;
    int numberOfLegs;

    Species(boolean hasFur, boolean canFly, int numberOfLegs) {
        this.hasFur = hasFur;
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
    }

    Species() {

    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

}

