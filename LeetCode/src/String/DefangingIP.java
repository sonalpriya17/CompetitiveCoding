package String;

public class DefangingIP {
    public static void main(String[] args) {
        String input = "1.1.1.1";
        String defangedIP = "";
        for (char ch : input.toCharArray()) {
        if(ch=='.'){
            defangedIP+="[.]";
        }
        else{
            defangedIP+=ch;
        }
        }
        System.out.println(defangedIP);
    }
}

