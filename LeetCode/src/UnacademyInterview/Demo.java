package UnacademyInterview;

import java.util.Arrays;

public class Demo {

/*
          1234*

          123*5

          12*45

          1*345


          *2345
          */

    public static void main(String[] args) {
    int size =6;
    int k=0;
       for(int i=1;i<=5;i++){
           for (int j=1;j<=5;j++){
               if(j==(size-i)){
                   System.out.print("*");
               }
               else{
                   System.out.print(j);
               }
               k++;
           }
           System.out.println(",");
       }

        }

    }


