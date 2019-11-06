package Homeworks.hmw9;

import java.util.List;

public interface FamilyDao {
    public List<Family> getAllFamilies();

    public Family getFamily(int i);

    public int getIndexOf(Family family);

    public boolean deleteFamily(int i);

    public boolean deleteFamily(Family family);

    public void saveFamily(Family family);

}
