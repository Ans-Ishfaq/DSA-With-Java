// 2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreeintName{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = input.next();
        Greeting(name);
        
    }

    public static void Greeting(String name){
        System.out.println("Hello Mr:" + name);
    }
}