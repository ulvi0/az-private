package Homeworks.hmw9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FamilyService {
    private CollectionFamilyDao database = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return database.getAllFamilies();
    }

    public void displayAllFamilies() {
        System.out.println(database);
    }

    public List<Family> getFamiliesBiggerThan(int number) {
        List<Family> familiesBiggerThan = new ArrayList<>();
        for (Family current : database.getAllFamilies()) {
            if (current.countFamily() > number) familiesBiggerThan.add(current);
        }
        System.out.println(familiesBiggerThan);
        return familiesBiggerThan;
    }

    public List<Family> getFamiliesLessThan(int number) {
        List<Family> familiesLessThan = new ArrayList<>();
        for (Family current : database.getAllFamilies()) {
            if (current.countFamily() < number) familiesLessThan.add(current);
        }
        System.out.println(familiesLessThan);
        return familiesLessThan;
    }

    public int countFamiliesWithMemberNumber(int number) {
        int counter = 0;
        for (Family current : database.getAllFamilies()) {
            if (current.countFamily() == number) counter++;
        }
        return counter;
    }

    public void createFamily(Human mother, Human father) {
        database.saveFamily(new Family(mother, father));
    }

    public boolean deleteFamilyByIndex(int i) {
        return database.deleteFamily(i);
    }

    public Family bornChild(Family family, String sex) {
        if (family == null) throw new NullPointerException("Family parameter is null");
        int id = database.getIndexOf(family);
        if (id == -1) throw new RuntimeException("Family not found");
        sex = sex.toLowerCase();

        Family familyInDB = database.getFamily(id);

        Random random = new Random();
        Names names = new Names();
        int iq = (familyInDB.getFather().getIq() + familyInDB.getMother().getIq()) / 2;
        if (sex.equals("masculine")) {
            Man newborn = new Man(names.generateBoyName(), familyInDB.getFather().getSurname(), 2019, iq, null);
            familyInDB.addChild(newborn);
            return familyInDB;
        } else if (sex.equals("feminine")) {
            Woman newborn = new Woman(names.generateGirlName(), familyInDB.getFather().getSurname(), 2019, iq, null);
            familyInDB.addChild(newborn);
            return familyInDB;
        } else throw new IllegalArgumentException("Invalid sex.");
    }

    public Family adoptChild(Family family, Human child) {
        if (child == null) throw new NullPointerException("Child parameter is null");
        if (family == null) throw new NullPointerException("Family parameter is null");
        int id = database.getIndexOf(family);
        if (id == -1) throw new RuntimeException("Family not found");
        Family familyInDB = database.getFamily(id);
        familyInDB.addChild(child);
        return familyInDB;
    }

    public void deleteAllChildrenOlderThan(int age) {
        for (Family family: database.getAllFamilies()){
            for (Human child: family.getChildren()) {
                if(child.describeAge() > age) family.deleteChild(child);
            }
        }
    }

    public int count(){
        return database.getAllFamilies().size();
    }

    public Family getFamilyById(int id){
        return database.getAllFamilies().get(id);
    }

    public List<Pet> getPets(int id){
        return new ArrayList<>(getFamilyById(id).getPets());
    }
    public void addPet(int id, Pet pet){
        getFamilyById(id).addPet(pet);
    }

}
