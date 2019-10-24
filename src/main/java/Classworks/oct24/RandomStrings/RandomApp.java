package Classworks.oct24.RandomStrings;

public class RandomApp {
    public static Result process (String origin){
        Result r = new Result();
        int i;
        for(i = 0; i < origin.length(); i++){
            if(origin.charAt(i) < 'a') break;
            r.lcv += origin.charAt(i);
        }
        for(; i < origin.length(); i++){
            if(origin.charAt(i) >= 'a') break;
            r.ucv += origin.charAt(i);
        }
        for(; i < origin.length(); i++){
            if(origin.charAt(i) < 'a') break;
            r.lcc += origin.charAt(i);
        }
        for(; i < origin.length(); i++){
            r.ucc += origin.charAt(i);
        }
        return r;
    }
    public static void main(String[] args) {
        Task1 t = new Task1();
        String origin = t.generate_Strings(30);
        Result result = process (origin);

        //System.out.println(origin);
        result.print();
    }
}
