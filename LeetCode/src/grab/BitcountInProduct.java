package grab;

public class BitcountInProduct {
    public static void main(String[] args) {
        int number = 4;
        int[] binary = new int[10];
        int i=0;
        while(number>0){
            binary[i]= number%2;
            number= number/2;
            i++;
        }
        for(int j=0;j<binary.length;j++){
          //System.out.print(binary[j]);
        }
        for(int j=i-1;j>=0;j--){
           System.out.print(binary[j]);
        }
    }

    }


