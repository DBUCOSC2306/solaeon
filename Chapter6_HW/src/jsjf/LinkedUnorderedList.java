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
        head = first;
        head.setElement(first.getElement());
        tail = first;
    }
	
	/**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the list
	 */
    public void addToRear(T element)
    {
        LinearNode<T> rear = new LinearNode<T>(element);
        LinearNode<T> after = head;
        after.setNext(head.getNext());
	LinearNode<T> before = head;
	while (after != null)
		{
			before = after;
                        after = after.getNext();
                        before.setNext(after);
                }
			// insert between before & after
			rear.setNext(before.getNext());
			before.setNext(rear);
			System.out.println("add " + element + " after " + before.getElement());
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
        {
         
        LinearNode<T> tmp = head;
        tmp.setElement(head.getElement());
        LinearNode<T> refNode = null;
        System.out.println("Traversing to all nodes..");
        /**
         * Traverse till given element
         */
        while(true)
        {
            if(tmp == null){
                break;
            }
            if(tmp.getElement().compareTo(target) == 0){
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp.setElement(tmp.getNext().getElement());
            tmp = tmp.getNext();
        }
        if(refNode != null){
            //add element after the target node
            LinearNode<T> nd = new LinearNode<T>();
            nd.setElement(element);
            nd.setNext(tmp.getNext());
            if(tmp == tail){
                tail = nd;
            }
            tmp.setNext(nd);
             
         } 
            else 
            {
            System.out.println("Unable to find the given element...");
            }
        }
    }	
}
