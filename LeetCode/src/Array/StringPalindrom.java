package Array;



public class StringPalindrom {
    public static void main(String[] args) {
        String input = "aapaa";
        String b = "";
       for(int i = input.length()-1; i>=0; i--){
           b= b+ input.charAt(i);
       }
       if(input.equalsIgnoreCase(b)){
           System.out.println("PALINDROME");
       }
       else{
           System.out.println("NOT PALINDROME");
       }


    }
}
