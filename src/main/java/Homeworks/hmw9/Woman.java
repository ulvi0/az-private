package Homeworks.hmw9;

import java.util.Map;

public final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq, Map<DaysOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman() {
    }

    @Override
    public boolean greetPet() {
        if (getFamily() == null) return false;
        if (getFamily().getPet(0) == null) return false;
        System.out.println("Hello, " + getFamily().getPet(0).getNickname() + "! You are so cute!");
        return true;
    }

    public void makeup() {
        System.out.println("I am doing makeup.");
    }
}
