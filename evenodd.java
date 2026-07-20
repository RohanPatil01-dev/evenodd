package evenodd;

import java.util.Scanner;

public class evenodd {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.");
        System.out.println("enter size of array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("enter  values");
        for(int i=0;i<arr.length;i++){
            arr[i]=i;

        }

        int a=sc.nextInt();
        for(int i=0;i<arr.length;i++){
        if(i%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }}
    }
}
