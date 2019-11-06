package Homeworks.hmw9;

import java.util.ArrayList;
import java.util.List;

public class FamilyService {
    CollectionFamilyDao database = new CollectionFamilyDao();
    public List<Family> getAllFamilies(){
        return database.getAllFamilies();
    }
    public void displayAllFamilies(){
        System.out.println(database);
    }
    public List<Family> getFamiliesBiggerThan(int number){
        List<Family> familiesBiggerThan = new ArrayList<>();
        for (Family current: database.getAllFamilies()) {
            if(current.countFamily() > number) familiesBiggerThan.add(current);
        }
        System.out.println(familiesBiggerThan);
        return familiesBiggerThan;
    }

    public List<Family> getFamiliesLessThan(int number){
        List<Family> familiesLessThan = new ArrayList<>();
        for (Family current: database.getAllFamilies()) {
            if(current.countFamily() < number) familiesLessThan.add(current);
        }
        System.out.println(familiesLessThan);
        return familiesLessThan;
    }

    public int countFamiliesWithMemberNumber(int number){
        int counter = 0;
        for (Family current: database.getAllFamilies()) {
            if(current.countFamily() == number) counter++;
        }
        return counter;
    }
    public void createFamily(Human mother, Human father){
        database.saveFamily(new Family(mother, father));
    }
    public boolean deleteFamilyByIndex(int i){
        return database.deleteFamily(i);
    }
    public Family bornChild(Family family, String sex){
        if(family == null) throw new NullPointerException("Family parameter is null");
        int id = database.getIndexOf(family);
        if(id == -1) throw new RuntimeException("Family not found");
        if(sex == "masculine"){

        }
    }


}
