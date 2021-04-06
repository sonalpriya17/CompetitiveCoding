package UnacademyInterview;

public class Demo2 {

   /* print the indices and the values which are not unique in array
   arr=[25,45,25,96,45,250] 
   Expected op 0 25 2 1 45 4

   arr=[25,45,25,96,45,25, 250] 
   Expected op 0 25 2 5|  1 45 4
*/

  /*  get a[i]
check if it repeats,
    if it repeats, print value if a[i]
    print all the position it is repeating

    i++;
    check a[i+1]
*/

    public static void main(String[] args) {
        int[] arr = {25,45,25,96,45,250};

        for(int i= 0; i< arr.length-1;i++){

            for (int j= i+1;j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.print(i+ " "+ arr[i]);
                }
                if(arr[i]==arr[j]){
                    System.out.print(" "+j+ " ");
                }
            }
        }

    }




}
