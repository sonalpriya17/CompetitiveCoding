package String;

public class RemoveVowels {
    public static void main(String[] args) {
        String inputString =
                "leetcodeisacommunityforcoders";
        String outputString = "";
        for(char ch:inputString.toCharArray()){
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                outputString = outputString+ch;
            }
        }
        System.out.println("Output : "+outputString);


    }
}
