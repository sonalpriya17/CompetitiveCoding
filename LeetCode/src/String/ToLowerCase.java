package String;

public class ToLowerCase {
    public static void main(String[] args) {
        String str ="SONAL";
        String result ="";
        for(char c : str.toCharArray()){
            if(c>='A'&& c<='Z'){
                result = result+ (char)(c-'A'+'a');
            }
            else{
                result=result+c;
            }
        }
        System.out.println(result);


    }
}
