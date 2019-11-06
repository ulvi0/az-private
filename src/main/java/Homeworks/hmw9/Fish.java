package Homeworks.hmw9;

import java.util.Set;

public class Fish extends Pet {
    {
        setSpecies(Species.FISH);
    }
    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void response() {
        System.out.println("***silence***");
    }
}
