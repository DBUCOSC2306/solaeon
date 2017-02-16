/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1project;  
 
import jsjf.ArrayStack;
import jsjf.LinkedStack;
import jsjf.exceptions.*;

public class Exam1Project	{
  
public static void main(String[] args) 
	{
         
		ArrayStack myArrayStack = new ArrayStack();
         //Debugging sequence
         arrayStackTest();
         linkedStackTest();
     }
     
    private static void arrayStackTest()
     {
         ArrayStack<String> arrayStack = new ArrayStack<>();
         System.out.println("ArrayStack test...");
         ArrayStack<String> arrayStack = new ArrayStack<String>();
         System.out.println("Is empty? " + arrayStack.isEmpty());
         
         //Test push().
         arrayStack.push("Element 1");
         arrayStack.push("Element 2");
         arrayStack.push("Element 3");
         System.out.println(arrayStack.pop());
         System.out.println(arrayStack.peek());
         
         //Test pop() and peek().
         System.out.println("Pop: " + arrayStack.pop());
         System.out.println("Peek: " + arrayStack.peek());
         
         //Test isEmpty() and toString().
         System.out.println("Is empty? " + arrayStack.isEmpty());
         System.out.println("toString(): " + arrayStack.toString());
         
         //Pop everything out of the stack.
         arrayStack.pop();
         arrayStack.pop();
         System.out.println("Is empty? " + arrayStack.isEmpty());
         
         //Attempt to pop while the stack is empty and
         //then handle the exception.
         try
		 {
             arrayStack.pop();
         }
         catch(EmptyCollectionException e) 
		 {
             System.out.println("Error: " + e.getMessage());
         }
         
         //Check that the stack is actually empty.
         System.out.println("Is empty? " + arrayStack.isEmpty());
		 }
     
     private static void linkedStackTest()
     {
         LinkedStack<String> linkedStack = new LinkedStack<>();
         System.out.println("\nLinkedStack test...");
         LinkedStack<String> linkedStack = new LinkedStack<String>();
         System.out.println("Is empty? " + linkedStack.isEmpty());
         
         //Test push().
         linkedStack.push("Element 1");
         linkedStack.push("Element 2");
         linkedStack.push("Element 3");
         System.out.println(linkedStack.pop());
         System.out.println(linkedStack.peek());
         
         //Test pop() and peek().
         System.out.println("Pop: " + linkedStack.pop());
         System.out.println("Peek: " + linkedStack.peek());
         
         //Test isEmpty() and toString().
         System.out.println("Is empty? " + linkedStack.isEmpty());
         System.out.println("toString(): " + linkedStack.toString());
         
         //Pop everything out of the stack.
         linkedStack.pop();
         linkedStack.pop();
         
         //Attempt to pop while the stack is empty and
         //then handle the exception.
         try {
             linkedStack.pop();
         }
         catch(EmptyCollectionException e) {
             System.out.println("Error: " + e.getMessage());
         }
         
         //Check that the stack is actually empty.
         System.out.println("Is empty? " + linkedStack.isEmpty());
      }
  }

