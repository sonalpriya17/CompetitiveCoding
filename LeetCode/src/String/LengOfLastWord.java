package String;

public class LengOfLastWord {
    public static int lengthOfLastWord2(String s){
        String[] arr = s.split(" ");
        int lastWordIndex = arr.length;
        String word = arr[lastWordIndex-1];
        System.out.println("word: "+ word);
       int wl=word.length();
        int wordLen = word.toCharArray().length;
        //return wordLen;
        return wl;
    }

    public static int lengthOfLastWord3(String s){
        char[] arr = s.toCharArray();
        int wordLen = 0;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]!=' '){
                wordLen++;
            }
            else{
                break;
            }
        }
        return wordLen;
    }
    public static int lengthOfLastWord(String s){
        int wordLen = 0;
        int lastIndex = s.length()-1;
        System.out.println("last index 1: "+ lastIndex);
        if(s.charAt(lastIndex)==' '){
            lastIndex = lastIndex-1;
        }
        while (lastIndex >= 0 && s.charAt(lastIndex) != ' ') {
                lastIndex--;
            }
        wordLen= (s.length() -1)-(lastIndex);
        return wordLen;
    }

    public static void main(String[] args) {
        int wordLen = lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println("Word Length :"+ wordLen);
    }
}
