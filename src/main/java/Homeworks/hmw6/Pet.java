package Homeworks.hmw6;

import java.util.Arrays;
import java.util.Objects;

public class Pet{
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;


    static {
        System.out.println("Pet class is being loaded.");
    }
    {
        System.out.println("New Pet created.");
    }
    //Constructors
    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    private String [] habits;

    // Other Methods
    public void eat(){
        System.out.println("I am eating.");
    }
    public void response(){
        System.out.println("Hello, owner. I am -" + this.nickname + ". I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up.");
    }

    //toString
    @Override
    public String toString() {
        return species + "{" +
                ((nickname != null)?("nickname='" + nickname + '\''):"") +
                ((age != 0)?(", age=" + age):"") +
                ((trickLevel != 0)?(", trickLevel=" + trickLevel):"") +
                ((habits != null)?(", habits=" + Arrays.toString(habits)):"") +
                '}';
    }

    //Getters and Setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
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

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
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
}
