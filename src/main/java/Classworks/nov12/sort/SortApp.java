package Classworks.nov12.sort;
import Classworks.nov2.MinimalPair.RandomArray;
import java.util.ArrayList;
import java.util.List;

public class SortApp {

    public void sort(List<Integer> origin){
        for(int i = 0; i < origin.size(); i++){
            for (int j = i - 1; j >= 0; j--){
                if(origin.get(j) > origin.get(j + 1)){
                    int tmp = origin.get(j);
                    origin.set(j, origin.get(j + 1));
                    origin.set(j + 1, tmp);
                }
            }
        }
    }

    public void mergeSort(List<Integer> origin){
        int p;
        for (p = 1; p <= origin.size(); p *= 2);
        //System.out.println(p);;
        for(int i = 2; i <= p; i*=2){
            for (int l = 0; l < origin.size(); l+=i){
                int r = Integer.min(l + i - 1, origin.size() - 1);
                int m = l + i/2;
                merge(origin, l, m -1, m, r);
            }
        }
    }
    public void merge(List<Integer> origin, int l1, int r1, int l2, int r2){
        List<Integer> buffer = new ArrayList<>();
        int length = r2 - l1 + 1;
        for(int i = 0; i < length; i++){
            //System.out.println(i);
            if(l1 > r1) buffer.add(origin.get(l2++));
            else if (l2 > r2) buffer.add(origin.get(l1++));
            else if(origin.get(l1) < origin.get(l2)){
                buffer.add(origin.get(l1++));
            }
            else buffer.add(origin.get(l2++));
            //System.out.println(buffer.size());
        }
        //System.out.println(buffer);
        for (int i = 0; i < buffer.size(); i++){
            origin.set(r2 - i, buffer.get(buffer.size() - i - 1));
        }
    }

    public static void main(String[] args) {
        RandomArray randomArray = new RandomArray();
        List<Integer> origin = randomArray.generateRandomArray(9, 10, 50);

        SortApp app = new SortApp();
        System.out.println(origin);
        app.mergeSort(origin);
        System.out.println(origin);
    }


}
