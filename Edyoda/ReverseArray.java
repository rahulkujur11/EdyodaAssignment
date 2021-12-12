package DataStructuresAndAlgorithm.Edyoda;

import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int n,int ar[]){
        for(int i=0;i<n/2;i++)
        {
            int k = ar[i];
            ar[i] = ar[n-i-1];
            ar[n-i-1] = k;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int [] ar = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            ar[i]= sc.nextInt();
        }
        reverse(n,ar);
    }
}
