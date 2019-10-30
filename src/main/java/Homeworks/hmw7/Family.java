package Homeworks.hmw7;

import java.util.Objects;
import java.util.Random;

public class Family implements HumanCreator{

    private Woman mother;
    private Man father;
    private Human[] children;
    private Pet pet;

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
        children = new Human[20];
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

    public Human[] getChildren() {
        return children;
    }

    public Human getChild(int index) {
        return children[index];
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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

        s+=((pet != null)?(", pet=" + pet) : "") +
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
        int count = 0;
        for( Human child : children){
            if(child != null) count++;
            else break;
        }
        return count;
    }

    public void addChild(Human new_child){
        for( int i = 0; i < children.length; i++) {
            if (children[i] == null) {
                children[i] = new_child;
                new_child.setFamily(this);
                break;
            }
        }
    }

    public boolean deleteChild(int index){
        if(index >= children.length) return false;
        if(children[index] == null) return false;
        children[index].setFamily(null);
        for(int i = index + 1; i < children.length; i++){
            children[i - 1] = children[i];
            children[i] = null;
        }

        return true;
    }

    public boolean deleteChild(Human child){
        for(int i = 0; i < children.length; i++){
            if(children[i] == null) return false;
            if(children[i].equals(child)){
                child.setFamily(null);
                for(int j = i + 1; j < children.length; j++){
                    children[j - 1] = children[j];
                    children[j] = null;
                }
                return true;
            }
        }
        return false;
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
        if (!(o instanceof Family)) return false;
        Family that = (Family) o;
        return this.hashCode() == that.hashCode();
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
