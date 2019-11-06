package Classworks.nov5.dao;

import java.util.ArrayList;
import java.util.List;

public class DAOPersonArrayList implements DAO<Person> {
    ArrayList<Person> storage = new ArrayList<>();

    @Override
    public void put(Person object) {
        storage.add(object);
    }

    @Override
    public Person get(int id) {
        for (Person person: storage) {
            if(id == person.getId()) return person;
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < storage.size(); i++) {
            Person person = storage.get(i);
            if(id == person.getId()) storage.remove(i);
        }
    }

    @Override
    public List<Person> getAll() {
        return storage;
    }
}
