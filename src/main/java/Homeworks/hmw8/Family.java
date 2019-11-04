package Homeworks.hmw8;

import java.util.*;

public class Family implements HumanCreator {

    private Woman mother;
    private Man father;
    List<Human> children = new ArrayList<Human>();
    private Set<Pet> pets = new HashSet<Pet>();

    static {
        System.out.println("Family class is being loaded.");
    }

    {
        System.out.println("A Family created.");
    }

    //Constructor
    public Family(Woman mother, Man father) {
        this.mother = mother;
        this.father = father;
    }

    // Getters and Setters
    public Woman getMother() {
        return mother;
    }
    public void setMother(Woman mother) {
        this.mother = mother;
    }
    public Man getFather() {
        return father;
    }
    public void setFather(Man father) {
        this.father = father;
    }
    public Human getChild(int index) {
        return children.get(index);
    }
    public List<Human> getChildren() {
        return children;
    }
    public void setChildren(List<Human> children) {
        this.children = children;
    }
    public Set<Pet> getPets() {
        return pets;
    }
    public Pet getPet(int index){
        Iterator it = pets.iterator();
        for(int i = 0; i < index; i++) {
            if(it.hasNext()) it.next();
        }
        return (Pet)it.next();
    }
    //toString
    @Override
    public String toString() {
        String s=  "Family{" +
                "mother=" + mother.toString() + "\n"+
                ", father=" + father.toString() + "\n";

        if(countChildren() > 0){
            s+=", children=[";
            for(Human child : children){
                if(child == null) break;
                s += child.toString() + "\n";
            }
            s+= "]";
        }

        s+=((pets != null)?(", pet=" + pets) : "") +
                '}';
        return s;
    }
    //Other Methods
    public int countFamily(){
        int count = countChildren();
        if(mother != null) count++;
        if(father != null) count++;
        return count;
    }
    public int countChildren(){
        return children.size();
    }
    public void addChild(Human new_child){
        if(new_child != null)
        children.add(new_child);
    }
    public void addPet(Pet new_pet){
        if(new_pet != null)
        pets.add(new_pet);
    }
    public boolean deleteChild(int index){
        if(index >= children.size()) return false;
        children.remove(index);
        return true;
    }
    public boolean deleteChild(Human child){
        return children.remove(child);
    }
    public Human bornChild(){
        boolean isMan;
        Random random = new Random();
        isMan = random.nextBoolean();
        Names names = new Names();
        int iq = (getFather().getIq() + getMother().getIq())/2;
        if(isMan){
            Man newborn = new Man(names.generateBoyName(), getFather().getSurname(), 2019, iq, null);
            addChild(newborn);
            return newborn;
        }
        else{
            Woman newborn = new Woman(names.generateGirlName(), getFather().getSurname(), 2019, iq, null);
            addChild(newborn);
            return newborn;
        }

    }
    // Equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }
    @Override
    @SuppressWarnings("deprecation")
    public void finalize() {
        System.out.println("Family is broken.");
    }
}
