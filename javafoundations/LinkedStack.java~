/*
 * LinkedStack.java
 * Emily Van Laarhoven
 * CS230 Assign 5 Task 1 - Complete LinkedStack implementation
 * Due: 10/16/16 @11:59pm
 */

package javafoundations;

import javafoundations.exceptions.*;

/**
 *  LinkedStack.java       Java Foundations
 *
 *  Represents a linked implementation of a stack.
 */

public class LinkedStack<T> implements Stack<T>
{
  private int count;
  private LinearNode<T> top;
  
  /**
   *  Creates an empty stack using the default capacity.
   */
  public LinkedStack()
  {
    count = 0;
    top = null;
  }
  
  /**
   *  Removes the element at the top of this stack and returns a
   *  reference to it. Throws an EmptyCollectionException if the
   *  stack contains no elements.
   * 
   * @return the element at the top of the stack
   */
  public T pop() throws EmptyCollectionException
  {
    if (count == 0)
      throw new EmptyCollectionException ("Pop operation failed. "
                                            + "The stack is empty.");
    
    T result = top.getElement();
    top = top.getNext();
    count--;
    
    return result;
  }
  
  /**
   *  Returns a string representation of this stack.
   * 
   * @return the elements in the stack
   */
  public String toString()
  {
    String result = "<top of stack>\n";
    LinearNode<T> current = top;
    
    while (current != null)
    {
      result += current.getElement() + "\n";
      current = current.getNext();
    }
    
    return result + "<bottom of stack>";
  }
  
  /**
   * Adds new element to top of stack
   * 
   * @param new element
   */
  public void push (T elt) { 
    LinearNode<T> nextNode = new LinearNode<T>(elt);
    nextNode.setNext(top);
    top=nextNode;
    count++;
  }   
  
  /**
   * returns top element of the stack without removing it
   * 
   * @return the top element of the stack
   */
  public T peek () throws EmptyCollectionException { 
    if (count!=0) {
      return top.getElement();
    } else {
      throw new EmptyCollectionException("Peek operation failed. "+
                                         "The stack is empty.");
    }
  }
  
  /**
   * determines whether stack is empty
   * 
   * @return true if stack is empty; false otherwise
   */
  public boolean isEmpty() { 
    return (count==0);
  }
  
  /**
   * gives # of elements in stack
   * 
   * @return number of elements in stack
   */
  public int size() {
    return count;
  }
  
}
