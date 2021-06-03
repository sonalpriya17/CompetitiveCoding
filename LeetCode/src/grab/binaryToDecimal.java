package grab;

public class binaryToDecimal {
    public static void main(String[] args) {
        long binary = 1001;
        int[] binaryArr = new int[10];
        int i = 0;
        int base = 1;
        int number = 0;
       while (binary > 0) {
            binaryArr[i] = (int) (binary % 10);
            binary = binary / 10;
        }
       for(int j=0;j<binaryArr.length;j++){
           System.out.print(binaryArr[j]);
       }

    }
}
