package Homeworks.hmw7;

public class DomesticCat extends Pet {
    {
        setSpecies(Species.Cat);
    }
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
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
