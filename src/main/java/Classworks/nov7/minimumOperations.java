package Classworks.nov7;

public class minimumOperations {

    int min(int a, int b){
        if(a < b) return a;
        return b;
    }
    int max(int a, int b){
        if(a > b) return a;
        return b;
    }

    int solution(String from, String to){

        int [][] dp = new int[from.length() + 1][to.length() + 1];


        for(int i = 0; i <= from.length(); i++){
            for (int j = 0; j <= to.length(); j++){
                if(i  == 0 || j == 0) {dp[i][j] = max(i, j); continue;}
                dp[i][j] = min(dp[i][j - 1], dp[i - 1][j]) + 1;
                if(from.charAt(i - 1) == to.charAt(j - 1)) dp[i][j] = min(dp[i][j], dp[i - 1][j - 1]);
                else dp[i][j] = min(dp[i][j], dp[i - 1][j - 1] + 1);
            }
        }
        return dp[from.length()][to.length()];
    }
}
