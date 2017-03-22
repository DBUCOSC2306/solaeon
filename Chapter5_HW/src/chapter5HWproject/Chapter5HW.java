package chapter5HWproject;
import jsjf.*;

/**
 *
 * @author jackjt
 */
public class Chapter5HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {   
        CircularArrayQueue aCircularQueue = new CircularArrayQueue(2);
        LinkedQueue lQueue = new LinkedQueue();
        
        Integer content1 = 4;
        Integer content2 = 234;
        Integer content3 = 49;        
        
        //Circular Queue test.
        aCircularQueue.enqueue(content1);
        System.out.println(aCircularQueue.toString());
        aCircularQueue.dequeue();
        System.out.println(aCircularQueue.toString());
        
        aCircularQueue.enqueue(content2);
        aCircularQueue.enqueue(content3);
        System.out.println(aCircularQueue.toString());
        
        System.out.println(aCircularQueue.first());
        System.out.println(aCircularQueue.size());
        
        //test linked queue.
        lQueue.enqueue(content1);
        System.out.println(lQueue.toString());
        lQueue.dequeue();
        System.out.println(lQueue.toString());
        
        lQueue.enqueue(content2);
        lQueue.enqueue(content3);
        
        System.out.println(lQueue.toString());
        System.out.println(lQueue.first());
        System.out.println(lQueue.size());
    }
    
}
























