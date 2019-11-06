package Homeworks.hmw9;

import java.util.Map;

public final class Man extends Human {
    public Man(String name, String surname, int year, int iq, Map<DaysOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man() {

    }

    @Override
    public boolean greetPet() {
        if (getFamily() == null) return false;
        if (getFamily().getPet(0) == null) return false;
        System.out.println("Hello, " + getFamily().getPet(0).getNickname() + "! How was your day?");
        return true;
    }

    public void repairCar() {
        System.out.println("I am repairing my car.");
    }
}
