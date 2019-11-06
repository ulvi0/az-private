package Homeworks.hmw9;

import java.util.List;

public class FamilyController{
    private FamilyService familyService = new FamilyService();

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int number) {
        return familyService.getFamiliesBiggerThan(number);
    }

    public List<Family> getFamiliesLessThan(int number) {
        return familyService.getFamiliesLessThan(number);
    }

    public int countFamiliesWithMemberNumber(int number) {
        return familyService.countFamiliesWithMemberNumber(number);
    }

    public void createFamily(Human mother, Human father) {
        familyService.createFamily(mother, father);
    }

    public boolean deleteFamilyByIndex(int i) {
        return familyService.deleteFamilyByIndex(i);
    }

    public Family bornChild(Family family, String sex) {
        return familyService.bornChild(family, sex);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }

    public List<Pet> getPets(int id) {
        return familyService.getPets(id);
    }

    public void addPet(int id, Pet pet) {
        familyService.addPet(id, pet);
    }
}
