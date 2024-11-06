// 8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the String");
        String word = input.next();
        CheckPalindrome(word);
    }                    

    public static void CheckPalindrome(String word){
        System.out.println("Your String is this: " + word);
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(word.charAt(start) == word.charAt(end)){
                start++;
                end--;
            }
            else{
                System.out.println("This String is not a palindrome");
                return;
            }
        }
        System.out.println(word + " is a Palindrome");

    }
}