package MakeMyTrip;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] inputArr ={4,22,-5,10,44,60,22,-44,2,11,21};
        int largest1 =0;
        int largest2 =0;
    for(int i=0;i<inputArr.length-1;i++){
        if(inputArr[i]>inputArr[i+1]&& inputArr[i]>largest1){
            largest1=inputArr[i];
        }
        else{
            largest1=inputArr[i+1];
        }
    }
        System.out.println("Largest 1 : "+largest1);
        for(int i=0;i<inputArr.length-1;i++){
            if(inputArr[i]>inputArr[i+1]&& inputArr[i]!=largest1 && inputArr[i]>largest2){
                largest2=inputArr[i];
            }
            else{
                largest1=inputArr[i+1];
            }
        }
        System.out.println("largest2: "+largest2);
    }
    }


