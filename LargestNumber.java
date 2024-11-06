// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter two Numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        Larger(num1,num2);
        
    }

    public static void Larger(int n1, int n2){
        if(n1>n2){
            System.out.println("Larger number is : " + n1);
        }
        else{
            System.out.println("Larger number is : " + n2);
        }
    }
}