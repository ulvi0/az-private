package Homeworks.hmw8;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;
    static {
        System.out.println("Pet class is being loaded.");
    }

    {
        System.out.println("New Pet created.");
    }

    //Constructors
    public Pet() {
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }



    // Other Methods
    public void eat() {
        System.out.println("I am eating.");
    }

    public abstract void response();


    //toString
    @Override
    public String toString() {
        return species.name() + "{" +
                "hasFur=" + species.getNumberOfLegs() +
                ", canFly=" + species.isCanFly() +
                ", numberOfLegs=" + species.getNumberOfLegs() +
                ((nickname != null) ? ("nickname='" + nickname + '\'') : "") +
                ((age != 0) ? (", age=" + age) : "") +
                ((trickLevel != 0) ? (", trickLevel=" + trickLevel) : "") +
                ((habits != null) ? (", habits=" + habits) : "") +
                '}';
    }

    //Getters and Setters


    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }
    //Equals and hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age);
    }

    @Override
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
        System.out.println(nickname + " is dead.");
        super.finalize();
    }
}
