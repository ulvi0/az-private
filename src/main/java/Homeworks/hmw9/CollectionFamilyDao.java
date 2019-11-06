package Homeworks.hmw9;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao{
    List<Family> families = new ArrayList<>();
    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamily(int i) {
        return families.get(i);
    }

    @Override
    public int getIndexOf(Family family) {
        for (int i = 0; i < families.size(); i++) {
            Family current = families.get(i);
            if(current.equals(family)) {
                return i;
            }
            return -1;
        }
        return 0;
    }

    @Override
    public boolean deleteFamily(int i) {
        families.remove(i);
        return i <= families.size();
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }
    public boolean exits(Family family){
        for (Family current: families) {
            if(current.equals(family)) return true;
        }
        return false;
    }
    @Override
    public void saveFamily(Family family) {
        if(!exits(family)) families.add(family);
    }
}
