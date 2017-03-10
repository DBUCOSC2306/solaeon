package jsjf;

import jsjf.exceptions.*;

/**
 * LinkedOrderedList represents a singly linked implementation of an 
 * ordered list.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class LinkedOrderedList<T extends Comparable<T>> extends LinkedList<T> 
         implements OrderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LinkedOrderedList()
    {
        super();
    }

    /**
     * Adds the specified element to this list at the location determined by
	 * the element's natural ordering. Throws a NonComparableElementException 
	 * if the element is not comparable.
     *
     * @param element the element to be added to this list
     * @throws NonComparableElementException if the element is not comparable
	 */
    public void add(T element)
    {
        // make the new node to insert into list
		LinearNode<T> newNode = new LinearNode(element);
		// first see if the list is empty
		if (head == null)
		{
			System.out.println("add " + element + " to front");
			head = newNode;
			return;
		}
		// there is something in the list
		// now check to see if it belongs in front
		else if (element.compareTo(head.getElement()) < 0)
		{
			System.out.println("add " + element + " before " + head.getElement());
			newNode.setElement(head.getElement());
			head = newNode;
		}
		// otherwise, step down the list.  n will stop 
		// at the node after the new node, and trailer will
		// stop at the node before the new node
		else
		{
			LinearNode<T> after = head.getNext();
			LinearNode<T> before = head;
			while (after != null)
			{
				if (element.compareTo(after.getElement()) < 0)
					break;
				before = after;
				after = after.getNext();
			}
			// insert between before & after
			newNode.setNext(before.getNext());
			before.setNext(newNode);
			System.out.println("add " + element + "after" + before.getElement());
		}
    }
}
