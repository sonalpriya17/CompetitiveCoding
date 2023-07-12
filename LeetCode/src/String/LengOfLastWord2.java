package String;

public class LengOfLastWord2 {
    public static int getStatementForLastWord(String statement){
        int wordLen = 0;
        int lastIndex = statement.length()-1;
        if(statement.charAt(lastIndex)==' '){
            lastIndex --;
        }
        while (statement.charAt(lastIndex)!=' ' && lastIndex >=0){
            lastIndex --;
            wordLen++;

        }
        wordLen = (statement.length()-1)-lastIndex;
        return wordLen;
    }
    public static void main(String[] args) {
        System.out.println(getStatementForLastWord("I am Sonal  "));
    }
}