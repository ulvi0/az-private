package Homeworks.hmw7;

public class Fish extends Pet{
    {
        setSpecies(Species.Fish);
    }
    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void response() {
        System.out.println("***silence***");
    }
}
