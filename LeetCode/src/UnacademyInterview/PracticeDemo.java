package UnacademyInterview;

public class PracticeDemo {
/*    1234*

            123*5

            12*45

            1*345


            *2345 */

    public static void main(String[] args) {


    }

    public void rightStarPattern(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void leftStarPattern(){
        for(int i=0;i<5;i++){
            for(int j=0;j<2*(5-i);j++){
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void printStarFromLeftToRight(){
        String number = "12345";
        for(int i=number.length()-1;i>0;i--){
            //number=number.replace(number.charAt(i),'*');
            System.out.println(number.replace(number.charAt(i),'*'));
        }
    }
}
