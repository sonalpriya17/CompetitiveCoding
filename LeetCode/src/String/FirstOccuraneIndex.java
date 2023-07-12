package String;


public class FirstOccuraneIndex {
    public static int result(String needle, String haystack){
        int needleLength = needle.length();
        int hayLength = haystack.length();

        for(int i=0;i<=hayLength-needleLength;i++ ){
            int j;
            for(j=0;j<needleLength;j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
                if (j==needleLength) {
                    return i;
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        String needle = "sad";
        String haystack = "sabbutsad";
        int index = result(needle,haystack);
       if(index!= -1){
           System.out.println("index is : "+ index );
       }
       else {
           System.out.println("Substring not available" );
       }
    }
}

