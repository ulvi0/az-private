package Homeworks.hmw8;

import java.util.Set;

public class RoboCat extends Pet {
    {
        setSpecies(Species.ROBO_CAT);
    }
    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void response() {
        System.out.printf("Hi, owner! I am a robot. You can call me %s\n", getNickname());
    }
}
