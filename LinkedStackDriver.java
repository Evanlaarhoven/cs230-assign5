/**
 * LinkedStackDriver.java
 * Emily Van Laarhoven
 * CS230 Task 1 - testing of LinkedStack
 * Due: 10/16/16 @11:59pm
 */

//javac -cp C:\javafoundations;.javafoundations.LinkedStack.java

import javafoundations.*;

public class LinkedStackDriver {
  
    //helper method
  private static Character toCharacter(char c) {
    Character ch = new Character(c);
    return ch;
  }
  
  public static void main (String [] args) {
    
    //test stack of characters
    LinkedStack<Character> characterStack = new LinkedStack<Character>();
    System.out.println("The size of characterStack is "+characterStack.size());
    characterStack.push('c');
    characterStack.push('b');
    characterStack.push('a');
    System.out.println("The size of characterStack is "+characterStack.size()); 
    System.out.println("characterStack is empty?"+characterStack.isEmpty());
    for (int i = 0; i<3;i++) {
      System.out.println(characterStack.peek()); //print out a,b,c
      characterStack.pop(); //remove everything
    }
    System.out.println("The size of characterStack is "+characterStack.size()); 
    System.out.println("characterStack is empty?"+characterStack.isEmpty());
    
    //LinkedStack<Character> testForPalidrome = new LinkedStack<Character>();
    String word = "madam";
    char [] charArray = word.toCharArray();
    System.out.println(charArray);
    System.out.println(charArray[0]); //type is primitive char
    System.out.println(toCharacter(charArray[0]));
    System.out.println(toCharacter(charArray[0]).getClass()); //class java.lang.Character
    characterStack.push(toCharacter(charArray[0]));
    characterStack.push(toCharacter(charArray[1]));
    characterStack.push(toCharacter(charArray[2]));
    System.out.println("The size of characterStack is "+characterStack.size()); 
    System.out.println("characterStack is empty?"+characterStack.isEmpty());
        for (int i = 0; i<3;i++) {
      System.out.println(characterStack.peek()); //print out a,b,c
      characterStack.pop(); //remove everything
    }
    //testForPalindrome.push(toCharacter(charArray[0]));
    //testForPalindrome.push(Character(charArray[0]));
    //testForPalindrome.push(charArray);
//    for (int i=0; i<charArray.length; i++) {
//      testForPalindrome.push(toCharacter(charArray[i])); //Character vs char issue??
//    }
//    System.out.println(testForPalindrome.size());


    
    
    //test stack of strings
    LinkedStack<String> wordStack = new LinkedStack<String>();
    System.out.println("The size of wordStack is "+wordStack.size()); //should print 0
    wordStack.push("Emily"); //add word Emily to stack
    wordStack.push("Van"); //add 2nd word to stack
    wordStack.push("Laarhoven"); //add 3rd word to stack
    System.out.println(wordStack.peek()); //should print Laarhoven
    System.out.println("The new size of wordStack is "+wordStack.size()); //should print 3
    wordStack.pop(); //removes Laarhoven
    wordStack.pop(); //removes Van
    System.out.println(wordStack.peek()); //should print Emily
    wordStack.pop();
    System.out.println(wordStack.size()); //should print 0
    
    

    
  }
}
