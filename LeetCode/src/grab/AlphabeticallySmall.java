package grab;

public class AlphabeticallySmall {
/*    public static void main(String[] args) {
        String givenWord = "pazcyzb";

        //find letter with greatest ascii value
        char max = 'a';
        for(int i=0;i<givenWord.length();i++){
            if(max<givenWord.charAt(i)){
                max= givenWord.charAt(i);
            }
        }
        System.out.println("Greatest Alphabet: "+max);
        String s="";

        for(int i=0;i<givenWord.length();i++){
            if(givenWord.charAt(i)==max){
             s = givenWord.substring(0, i) + givenWord.substring(i + 1);
            }
        }
        System.out.println("op: "+s);
    }*/
public static void main(String[] args) {
    String givenString ="ueiwim";
    char max ='a';
    for(int i=0;i<givenString.length();i++){
        if(givenString.charAt(i)>max){
            max=givenString.charAt(i);
        }
    }
    System.out.println("Max : " +max);
    for(int i=0;i<givenString.length();i++){
        if(givenString.charAt(i)==max){
           givenString= givenString.substring(0,i)+givenString.substring(i+1);
           break;
        }
    }
    System.out.println("OutputString :"+ givenString);
}
}
