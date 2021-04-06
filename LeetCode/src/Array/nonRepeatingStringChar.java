package Array;

public class nonRepeatingStringChar {
    public static void main(String[] args) {
        String input = "elephant";
        for(int i=0;i<input.length();i++){
            boolean unique = true;
            for(int j=0;j<input.length();j++){
                if (j!=i && input.charAt(i)==input.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if(unique){
                System.out.println(input.charAt(i));
                break;
            }
        }
        }}



