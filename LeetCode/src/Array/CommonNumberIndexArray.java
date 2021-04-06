package Array;

/*public class CommonNumberIndexArray {

    // Print the common numbers in two arrays and also print the index from each array
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,4,5,6,3,8};
        int[] arr2 = {9,10,11,1,14,1,3};
for(int i = 0; i<arr1.length-1;i++){
    for (int j = 0;j<arr2.length-1;j++){
        if(arr1[i]==arr2[j]){
            System.out.println(arr1[i] + " is at index "+ i + " in 1st Array and at index "+j+" in 2nd array");

        }
    }
}
 }
}*/
public class CommonNumberIndexArray {

    // Print the common numbers in two arrays and also print the index from each array
    public static void main(String[] args) {
        int[] numArray1 = {1,2,3,4,5,6,3,8};
        int[] numArray2 = {9,10,11,1,14,1,3};
        // Outer loop
        for(int i = 0; i < numArray2.length-1; i++){
            for(int j = 0; j < numArray1.length-1; j++){// inner loop
                if(numArray1[i] == numArray2[j]){
                    System.out.println("repeating number " +numArray1[i] + "\n index arr 1: " + i + " index arr 2: " + j);

                }
            }
        }
    }
}
