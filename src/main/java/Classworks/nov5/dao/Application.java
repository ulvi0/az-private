package Classworks.nov5.dao;

public class Application {
  public static void main(String[] args) {

    DAO<Person> pps =
            new DAOPersonArrayList();
            //new DAOPersonHashMap();

    pps.put(new Person(1, "Vaqif", 18));
    pps.put(new Person(2, "Ulvi", 20));
    pps.put(new Person(3, "Emin", 40));
    pps.put(new Person(4, "Fatima", 30));
    pps.put(new Person(5, "Cabbar", 32));
    pps.put(new Person(6, "Amir", 12));



    System.out.println(pps.get(3));
    pps.delete(3);
    System.out.println("Person with id 3 deleted.");
    System.out.println(pps.getAll());




  }
}
