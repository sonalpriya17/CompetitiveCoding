package Array;

import java.util.HashSet;
import java.util.Set;

public class Algo {
    public static void main(String[] args) {
      //  FibonacciWithoutRecursion();
       // FibonacciRecursion();
      //sumOfDigitInaNumber();
   //primeNumber();
     //   primeNumberRange();
      //  swapUsingThirdVariable();
      //  swapWithoutThirdVariable();
       // reeverseDigit();
        removeDuplicateFromArray();
    }
    public static void FibonacciWithoutRecursion(){
     // 0 1 1 2 3 5 8 13
        int a= 0, b= 1,c = 0;
        System.out.print(a +" "+b);
     /*   for(int i=0;i<=10;i++){
        c = a+b;
           // System.out.print(" "+c);
        a= b;
        b= c;
        }*/
        while(c<50){
            c = a+b;
            System.out.print(" "+c);
            a= b;
            b= c;
        }
    }
    public static void FibonacciRecursion(){
    int a=0,b=1;
    }
    public static void sumOfDigitInaNumber(){
        int num = 321;
        int sum = 0;
        while(num>0){
            sum=sum + num%10;
            num = num/10;
        }
        System.out.println(sum);

    }
    public static void reeverseDigit(){
        int num = 101;
        int rev = 0;
       while (num>0){
           int dg = num%10;
           rev= rev*10+dg;
           num= num/10;
       }
        System.out.println(rev);

    }
    public static void primeNumber(){
        int nuumber = 7;
        int flag = 0;
        for(int i=2;i<nuumber-1;i++){
            if(nuumber%i == 0){
               flag= flag+1;
            }
        }
        if(flag>0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
    public static void primeNumberRange(){
      int temp=0;
      for(int i=1;i<=100;i++){
          for(int j=2;j<i-1;j++) {
              if (i % j == 0) {
                  temp = temp + 1;
              }
          }
              if(temp==0) {
                  System.out.println(i);
              }
              else{
                  temp = 0;
              }
          }
      }

    public static void swapUsingThirdVariable(){
        int a= 10, b=20;
        int temp =0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a +", b:"+ b);



    }
    public static void swapWithoutThirdVariable()
    {
        int a= 10, b=20;
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a+" b: "+b);
    }
    public static void removeDuplicateFromArray()
    {
       int arr[] = {1,2,3,4,2,5,6,7,3,5,1};
        Set<Integer> set = new HashSet<>();
        for(int a: arr){
            set.add(a);
        }
        System.out.println(set);
    }
}

