package jsjf;

import jsjf.exceptions.*;

/**
 * LinkedUnorderedList represents a singly linked implementation of an 
 * unordered list.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class LinkedUnorderedList<T extends Comparable<T>> extends LinkedList<T> 
         implements UnorderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LinkedUnorderedList()
    {
        super();
    }

    /**
     * Adds the specified element to the front of this list.
     *
     * @param element the element to be added to the list
	 */
    public void addToFront(T element)
    {
        LinearNode<T> first = new LinearNode(element);
        LinearNode<T> temp = first;
        temp.setNext(head);
        head = temp;
    }
	
	/**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the list
	 */
    public void addToRear(T element)
    {
        LinearNode<T> last = new LinearNode(element);
        LinearNode<T> temp = last;
        temp.setNext(tail);
        tail = temp;
    }
	
	
    /**
     * Adds the specified element to this list after the given target.
     *
     * @param  element the element to be added to this list
	 * @param  target the target element to be added after
	 * @throws ElementNotFoundException if the target is not found
	 */
    public void addAfter(T element, T target)
    {
        if (contains(target)); 
        {
            LinearNode<T> temp = new LinearNode(element);
            LinearNode<T> holder = new LinearNode(target);
            temp = head;
            while (!temp.equals(target) && temp.getNext() != null)
            {
                temp = temp.getNext();
                if (temp.equals(target))
                {
                    temp = temp.getNext();
                    holder.setNext(temp);
                    modCount++;
                }
            }
        }
    }	
}
