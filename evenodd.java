package evenodd;

import java.util.Scanner;

public class evenodd {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
