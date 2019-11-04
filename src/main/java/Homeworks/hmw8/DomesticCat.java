package Homeworks.hmw8;

import java.util.Set;

public class DomesticCat extends Pet {
    {
        setSpecies(Species.DOMESTIC_CAT);
    }
    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void response() {
        System.out.printf("Meow, I am %s. I miss you!\n", getNickname());
    }
    public void foul(){
        System.out.println("Meow, my owner is gonna clean this.\n");
    }
}
