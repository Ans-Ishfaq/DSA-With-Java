// 3. Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.

import java.util.Scanner;

public class FindInterest{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal, time and rate respectivily;");
        int principal = input.nextInt();
        int time = input.nextInt();
        int rate = input.nextInt();
        float result=SimpleInterest(principal,time,rate);
        System.out.println(result);
    }

    public static float SimpleInterest(int principal, int time, int rate){
        float interest= (principal * time * rate)/100;
        // System.out.println("The Simple Interest is: " + interest); 
        return interest;
    }
}