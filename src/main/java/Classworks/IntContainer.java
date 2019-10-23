package Classworks;

public class IntContainer {
    public static class  Container{
        int i;

        public Container(int i) {
            this.i = i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }
    }

    public static void main(String[] args) {
        Container a, b;
        a = new Container(5);
        b = new Container(6);
        System.out.println(a.getI());
        System.out.println(b.getI());
        swap(a, b);
        System.out.println(a.getI());
        System.out.println(b.getI());
    }

    public static void swap(Container i, Container k){
        int tmp = i.getI();
        i.setI(k.getI());
        k.setI(tmp);
    }

}
