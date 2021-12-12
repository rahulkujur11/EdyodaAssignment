package DataStructuresAndAlgorithm.Edyoda;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PairsSum {
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
        System.out.println("Enter Sum");
        int sum = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if((ar[i]+ar[j])==sum){
                    System.out.print(ar[i]+" ");
                    System.out.print(ar[j]);
                    System.out.println();
                }
            }
        }
    }
}
