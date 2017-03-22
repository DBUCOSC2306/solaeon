package jsjf;import jsjf.exceptions.*;/** * LinkedQueue represents a linked implementation of a queue. *  * @author Lewis and Chase * @version 4.0 */public class LinkedQueue<T> implements QueueADT<T>{    private int count;    private LinearNode<T> head, tail;    /**     * Creates an empty queue.     */    public LinkedQueue()    {        count = 0;        head = tail = null;    }    /**     * Adds the specified element to the tail of this queue.     * @param element the element to be added to the tail of the queue     */    public void enqueue(T element)    {        LinearNode<T> node = new LinearNode<T>(element);        if (isEmpty())            head = node;        else            tail.setNext(node);        tail = node;        count++;    }    /**     * Removes the element at the head of this queue and returns a     * reference to it.      * @return the element at the head of this queue     * @throws EmptyCollectionException if the queue is empty     */    public T dequeue() throws EmptyCollectionException    {        if (isEmpty())            throw new EmptyCollectionException("queue");        T result = head.getElement();        head = head.getNext();        count--;        if (isEmpty())            tail = null;        return result;    }       /**     * Returns a reference to the element at the head of this queue.     * The element is not removed from the queue.       * @return a reference to the first element in this queue     * @throws EmptyCollectionsException if the queue is empty     */    public T first() throws EmptyCollectionException    {        if (isEmpty())            throw new EmptyCollectionException("LinkedQueue");        T yours = head.getElement();        return yours;    }    /**     * Returns true if this queue is empty and false otherwise.      * @return true if this queue is empty      */    public boolean isEmpty()    {        if (size() == 0)            return true;        else            return false;    }     /**     * Returns the number of elements currently in this queue.     * @return the number of elements in the queue     */    public int size()    {        return count;    }    /**     * Returns a string representation of this queue.      * @return the string representation of the queue     */    public String toString()    {        String result = " ";        LinearNode<T> current = head;        if (head.getElement() != null)             current.setElement(head.getElement());        while (current != null)            {                if (current.getNext() != null)                {                        current.setElement(current.getNext().getElement());                    current = current.getNext();                    result += current.getElement() + ", ";                }                else                    current = current.getNext();            }        return "List: " + result;    }}