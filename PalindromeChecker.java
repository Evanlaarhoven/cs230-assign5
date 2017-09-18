/**
 * PalindromeChecker.java
 * Emily Van Laarhoven
 * CS230 Assignment 5 Task 2 - Palindromes
 * Due: 10/16/16 @11:59pm
 */

import javafoundations.*;

public class PalindromeChecker {
  
  //instance vars
  private ArrayStack<Character> stack1;
  private ArrayStack<Character> stack2;
  private ArrayStack<Character> stack3;
  
  //constructor
  public PalindromeChecker () {
    stack1 = new ArrayStack<Character>();
    stack2 = new ArrayStack<Character>();
    stack3 = new ArrayStack<Character>();
  }
  
  /**
   * checks to see if word read from command line arg is palindrome
   * 
   * @param String word to check, assume string contains no spaces or special characters
   * @returns true if word is a palindrome, false otherwise
   */
  public boolean checkPalindrome(String word) { 
    char [] a = word.toCharArray();
    for(int i = 0; i < a.length; i++) {
      stack1.push(a[i]); //push the characters into the stack so left to right is bottom to top
      stack2.push(a[i]); //make second copy
    }
    while (!(stack1.isEmpty())) { //pop all characters out (FILO) of stack 2 and push into stack 3
      stack3.push(stack1.pop()); //stack 3 now contains word backwards, stack 1 is empty
    } //now compare stack 2 and stack 3
    while (!(stack2.isEmpty())) {
      if (stack3.pop()!= stack2.pop()) {
        return false;
      }
    }//if all characters match and stacks are empty return true
    return true;
  }
  
  public static void main (String [] args) {
    if ((args.length)==0) {
      System.out.println("Please enter a word (no spaces or special characters) to check whether it is a palindrome");
    } else {
      String input = args[0];
      PalindromeChecker p = new PalindromeChecker();
      System.out.println("Is "+input+" a palindrome? "+p.checkPalindrome(input));
    }
  
//    System.out.println("Is aaaa a palindrome? "+p.checkPalindrome("aaaa"));
//    System.out.println("Is madam a palindrome? "+p.checkPalindrome("madam"));
//    System.out.println("Is atoyota a palindrome? "+p.checkPalindrome("atoyota"));
//    System.out.println("Is Madam a palindrome? "+p.checkPalindrome("Madam"));
//    System.out.println("Is the empty string a palindrome? "+p.checkPalindrome(""));
//    System.out.println("Is emily a palindrome? "+p.checkPalindrome("emily"));
  }
}



