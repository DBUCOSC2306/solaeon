package jsjf;

import jsjf.exceptions.*;
import java.util.Iterator;

/**
 * Represents a linked implementation of a stack.
 *
 * @author Lewis and Chase 
 * @version 4.0
 */
public class LinkedStack<T> implements StackADT<T>
{
    private int count;  
    private LinearNode<T> top; 

    /**
     * Creates an empty stack.
     */
    public LinkedStack()
    {
        count = 0;
        top = null;
    }

    /**
     * Adds the specified element to the top of this stack.
     * @param element element to be pushed on stack
     */
    public void push(T element)
    {
        LinearNode<T> temp = new LinearNode<T>(element);

        temp.setNext(top);
        top = temp;
        count++;
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it. 
     * @return element from top of stack
     * @throws EmptyCollectionException if the stack is empty
     */
    public T pop() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        T result = top.getElement();
        top = top.getNext();
        count--;
 
        return result;
    }
   
    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.  
     * @return element on top of stack
     * @throws EmptyCollectionException if the stack is empty  
     */
    public T peek() throws EmptyCollectionException
    {
        LinearNode<T> copy = new LinearNode<T>(top);
		return copy;
		//I didn't think that returning a reference to the node would be... secure.
		//so I made a copy and returned that. You can access a copy of the data, but you won't change the original.
    }

    /**
     * Returns true if this stack is empty and false otherwise. 
     * @return true if stack is empty
     */
    public boolean isEmpty()
    {
		if (top == null)
			return true;
		else
			return false;
    }
 
    /**
     * Returns the number of elements in this stack.
     * @return number of elements in the stack
     */
    public int size()
    {
        return count;
    }

    /**
     * Returns a string representation of this stack. 
     * @return string representation of the stack
     */
    public String toString()
    {
        string holdMyRootBeer;
		Iterator<LinkedStack<T>> linkedStackIterator = stack.Iterator();
		while (linkedStackIterator.hasNext())
		{
			holdMyRootBeer += linkedStackIterator.next();
			holdMyRootBeer += " ";
			return holdMyRootBeer;
		}
    }
	//this probably won't work. I don't know if I can make an Iterator<LinkedStack<T>> like that.
	//And I don't know if I can concatenate my string like that with the iterator.
}
