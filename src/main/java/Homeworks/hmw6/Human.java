package Homeworks.hmw6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String [][] schedule;

    static {
        System.out.println("Human class is being loaded.");
    }
    {
        System.out.println("New Human created.");
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
    //Constructors
    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    //Other methods
    public boolean greetPet(){
        if(this.family == null) return false;
        if(this.family.getPet() == null) return false;
        System.out.println("Hello, " + this.family.getPet().getNickname() + "!");
        return true;
    }
    public boolean  describePet(){
        if(this.family == null) return false;
        if(this.family.getPet() == null) return false;
        System.out.println("I have a " + this.family.getPet().getSpecies() + ", she is " + this.family.getPet().getAge() + " years old, she is " +
        ( (this.family.getPet().getTrickLevel() > 50) ? "very sly." : "almost not sly."));
        return true;
    }
    //toString
    @Override
    public String toString() {
        return "Human{" +
                ((name != null)? ("name='" + name + '\''):"") +
                ((surname != null)? (", surname='" + surname + '\''):"") +
                ((year != 0)? (", year=" + year):"") +
                ((iq != 0)? (", iq=" + iq ):"") +
                ((schedule != null)?(", schedule=" + Arrays.deepToString(schedule)):"") +
                '}';
    }

    public boolean feedPet(boolean b){
        if(this.family == null) return false;
        if(this.family.getPet() == null) return false;
        System.out.println("Isn't it time for feeding??");
        Random random = new Random();
        int r = random.nextInt();
        if(b || r <= family.getPet().getTrickLevel() ){
            System.out.println("Hm... I will feed " + family.getPet().getNickname() + ".");
            System.out.print(family.getPet().getNickname() + ": ");
            family.getPet().eat();
            return true;
        }
        System.out.println("I think " + family.getPet().getNickname() + " is not hungry.");
        return false;
    }


    //Equals and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return year == human.year &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " " + surname + " is dead.");
        super.finalize();
    }
}