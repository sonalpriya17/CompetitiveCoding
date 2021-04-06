package Array;

public class StringReverse {
    public static void main(String[] args) {
        String input = "aapaa";
        char[] inputarr = input.toCharArray();
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(inputarr[i]);
        }

    }
}
