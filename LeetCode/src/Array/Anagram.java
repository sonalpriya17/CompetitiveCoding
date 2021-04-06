package Array;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    // win niw inw
    // same letters words are anagram
    // pen : epn: yes : pot : not anagram

    public static void main(String[] args) {
        String input = "apple$";
       int ipLen= input.length();


        //String output = "apple";
        String output = "apple";
       int opLen=  output.length();

        // a, apple, ppp ,

         List<Character> iplist = new ArrayList<>();
        for(int i= 0 ; i<input.length()-1;i++){
            iplist.add(input.charAt(i));
        }

        List<Character> opList = new ArrayList<>();
        for(int i = 0;i<output.length()-1;i++){
            opList.add(output.charAt(i));
        }

        if(ipLen==opLen){
            System.out.println(" prim");
        }


           if(iplist.equals(opList)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }

        }




    }

