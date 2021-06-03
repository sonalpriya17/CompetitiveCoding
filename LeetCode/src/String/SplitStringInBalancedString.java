package String;

public class SplitStringInBalancedString {


    public static void main(String[] args) {
        String balancedString = "RLLLLRRRLRRLLRRRL";
        int balanceCount = 0;
        int count = 0;
        for(char ch: balancedString.toCharArray()){
            if(ch=='L'){
                count++;
            }
            else if( ch =='R'){
                count--;
            }
            if(count==0){
                balanceCount++;
            }
        }
        System.out.println(balanceCount);
    }
}
