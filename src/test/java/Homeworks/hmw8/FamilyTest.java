package Homeworks.hmw8;

import Homeworks.hmw6.Family;
import Homeworks.hmw6.HappyFamily;
import Homeworks.hmw6.Human;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FamilyTest {
    Family family;
    HappyFamily app;
    Human new_child;
    @Before
    public void before(){
         app = new HappyFamily();
        family = app.CreateFamily();
        new_child = new Human();
    }

    @Test
    public void testToString() {
        String string1 = family.toString();
        String string2 = "Family{mother=Human{name='Ned', surname='Stark', year=263}\n" +
                ", father=Human{name='Catelyn', surname='Stark', year=264}\n" +
                ", children=[Human{name='Arya', surname='Stark', year=289, iq=120, schedule=[[Monday, do home work], [Tuesday, go to courses; watch a film], [Wednesday, go to university], [Thursday, read articles], [Friday, deadline of home work;], [Saturday, go to courses], [Sunday, meeting with friends]]}\n" +
                "Human{name='Sansa', surname='Stark', year=285, iq=100, schedule=[[Monday, do home work], [Tuesday, go to courses; watch a film], [Wednesday, go to university], [Thursday, read articles], [Friday, deadline of home work;], [Saturday, go to courses], [Sunday, meeting with friends]]}\n" +
                "Human{name='Bran', surname='Stark', year=288, iq=115, schedule=[[Monday, do home work], [Tuesday, go to courses; watch a film], [Wednesday, go to university], [Thursday, read articles], [Friday, deadline of home work;], [Saturday, go to courses], [Sunday, meeting with friends]]}\n" +
                "Human{name='Robb', surname='Stark', year=281, iq=118, schedule=[[Monday, do home work], [Tuesday, go to courses; watch a film], [Wednesday, go to university], [Thursday, read articles], [Friday, deadline of home work;], [Saturday, go to courses], [Sunday, meeting with friends]]}\n" +
                "Human{}\n" +
                "], pet=Wolf{hasFur=4, canFly=false, numberOfLegs=4nickname='Nymeria', age=4, trickLevel=56, habits=[eat, play, sleep]}}";
        assertEquals(string2, string1);

    }

    @Test
    public void countFamily() {
        int familySize = family.countFamily();
        assertEquals(familySize, 7);
    }

    @Test
    public void countChildren() {
        int childrenSize = family.countChildren();
        assertEquals(childrenSize, 5);
    }

    @Test
    public void addChild() {
        int childrenSize = family.countChildren();
        family.addChild(new_child);
        int newChildrenSize = family.countChildren();
        assertEquals(childrenSize + 1, newChildrenSize);
        for(Human child : family.getChildren()){
            if(child == new_child) {
                if(new_child.getFamily() != family) throw new RuntimeException("Family hasn't been assigned to the child.");
                return;
            }
        }
        throw new RuntimeException("New child haven't been added.");
    }

    @Test
    public void deleteChild() {
        Human firstChild = family.getChild(0);
        int childrenSize = family.countChildren();
        family.deleteChild(0);
        int newChildrenSize = family.countChildren();
        assertEquals(childrenSize - 1, newChildrenSize);

        Human secondChild = family.getChild(0);
        assertNotEquals(firstChild, secondChild);
    }

    @Test
    public void testDeleteChild() {
        Human firstChild = family.getChild(0);
        int childrenSize = family.countChildren();
        family.deleteChild(firstChild);
        int newChildrenSize = family.countChildren();
        assertEquals(childrenSize - 1, newChildrenSize);

        Human secondChild = family.getChild(0);
        assertNotEquals(firstChild, secondChild);
    }

    @Test
    public void testEquals() {
        Family family1 = new Family(family.getMother(), family.getFather()); // Equal family
        Family family2 = new Family(new Human(), new Human()); // Not equal family
        Assert.assertTrue(family.equals(family1));
        Assert.assertFalse(family.equals(family2));

    }

    @Test
    public void testHashCode() {
        Family family1 = new Family(family.getMother(), family.getFather()); // Equal family
        Family family2 = new Family(new Human(), new Human()); // Not equal family
        Assert.assertTrue(family1.hashCode() == family.hashCode());
        Assert.assertFalse(family2.hashCode() == family.hashCode());
    }

}