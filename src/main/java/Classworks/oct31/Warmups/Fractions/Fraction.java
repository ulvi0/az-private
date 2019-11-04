package Classworks.oct31.Warmups.Fractions;

public class Fraction {
    int nominator, denominator;

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction that){
        int denom = this.denominator * that.denominator;
        int nom = this.nominator*that.denominator + that.nominator * this.denominator;
        //System.out.println(nom + " " + denom);
        Fraction fraction = new Fraction(nom/gcd(nom, denom), denom/gcd(nom, denom));
        return fraction;
    }

    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    @Override
    public String toString() {
        return nominator + "/" + denominator;
    }

    public void parse(String string){
        String [] numbers = string.split("/");
        nominator = Integer.parseInt(numbers[0]);
        denominator = Integer.parseInt(numbers[1]);
    }
}
