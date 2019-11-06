package Homeworks.hmw9;

import java.util.Random;

public class Names {
    String [] boyNames;
    String [] girlNames;
    {
        String boyNames= "Liam\n" +
                "Noah\n" +
                "William\n" +
                "James\n" +
                "Oliver\n" +
                "Benjamin\n" +
                "Elijah\n" +
                "Lucas\n" +
                "Mason\n" +
                "Logan";
        this.boyNames = boyNames.split("\n");

        String girlNames = "Emma\n" +
                "Olivia\n" +
                "Ava\n" +
                "Isabella\n" +
                "Sophia\n" +
                "Charlotte\n" +
                "Mia\n" +
                "Amelia\n" +
                "Harper\n" +
                "Evelyn";
        this.girlNames = girlNames.split("\n");
    }

    public String generateBoyName(){
        Random random = new Random();
        int index = random.nextInt(10);
        return boyNames[index];
    }
    public String generateGirlName(){
        Random random = new Random();
        int index = random.nextInt(10);
        return girlNames[index];
    }
}
