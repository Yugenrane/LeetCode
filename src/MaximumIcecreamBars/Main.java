package MaximumIcecreamBars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int coins=sc.nextInt();
        SolveProblem obj=new SolveProblem();
        System.out.println(obj.iceBars(arr,coins));
    }
}
