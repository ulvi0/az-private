package Classworks.oct31.Warmups.Fractions;

public class FractionsApp {
    public String sumFractions(String s){
        String [] Sfractions = s.split("\\+");
        //System.out.println(Arrays.toString(Sfractions));

        Fraction sum = new Fraction(0,1);

        for (String str: Sfractions) {
            Fraction fraction = new Fraction(0, 0);
            fraction.parse(str);
            sum = sum.add(fraction);
        }
        return sum.toString();
    }
}
