package Homeworks.hmw7;

public final class Man extends Human{
    public Man(String name, String surname, int year, int iq, String[][] schedule) {
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
        if (getFamily().getPet() == null) return false;
        System.out.println("Hello, " + getFamily().getPet().getNickname() + "! How was your day?");
        return true;
    }
    public void repairCar(){
        System.out.println("I am repairing my car.");
    }
}
