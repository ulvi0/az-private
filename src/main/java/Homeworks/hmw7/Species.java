package Homeworks.hmw7;


public enum Species {
    Wolf(true, false, 4),
    Dog(true, false, 4),
    Cat(true, false, 4),
    Hamster(true, false, 4),
    Fish(false, false, 0),
    RoboCat(false, false, 4),
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

