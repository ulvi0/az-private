/*
*       Haven't finished this one yet.
* */



package Homeworks.hmw5;


import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human [] children;
    private Pet pet;

    static {
        System.out.println("Family class is being loaded.");
    }

    {
        System.out.println("A Family created.");
    }

    //Constructor
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children = new Human[20];
    }

    // Getters and Setters
    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
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

        if(countFamily() > 2){
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
        int count = 2;
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

    // Equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }
}
