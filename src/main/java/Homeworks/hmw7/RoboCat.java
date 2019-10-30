package Homeworks.hmw7;

public class RoboCat extends Pet{
    {
        setSpecies(Species.RoboCat);
    }
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void response() {
        System.out.printf("Hi, owner! I am a robot. You can call me %s\n", getNickname());
    }
}
