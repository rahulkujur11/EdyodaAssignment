package DataStructuresAndAlgorithm.Edyoda;

import java.util.Scanner;

public class TwoStringPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev="";
        String strOne = sc.nextLine();
        String strTwo = sc.nextLine();
        int length = strOne.length();
        for(int i=length-1;i>=0;i--)
        {
           rev=rev + strOne.charAt(i);
        }
        if(strTwo.equalsIgnoreCase(rev)){
            System.out.println("Is a Rotation");
        }
        else
            System.out.println("Not a Rotation");
    }
}
