package chapter6HWproject; 
import jsjf.*;/**
 *
 * @author jackjt
 */
public class Chapter6HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// 1. Complete the incomplete classes
        // 2. In this main, write a test for each method AND any exceptions
        ArrayOrderedList aOrderedList = new ArrayOrderedList(2);
        ArrayUnorderedList aUnorderedList = new ArrayUnorderedList(2);
        
        LinkedOrderedList lOrderedList = new LinkedOrderedList();
        LinkedUnorderedList lUnorderedList = new LinkedUnorderedList();
        
        Integer content1 = 5;
        Integer content2 = 10;
        Integer content3 = 3;
        
        aOrderedList.add(content1);
        aUnorderedList.addToFront(content1);
        lOrderedList.add(content1);
        lUnorderedList.addToFront(content1);
                
        aOrderedList.add(content2);
        aUnorderedList.addAfter(content2, content1);
        lOrderedList.add(content2);
        lUnorderedList.addAfter(content2, content1);
        
        aOrderedList.add(content3);
        aUnorderedList.addToRear(content3);
        lOrderedList.add(content3);
        lUnorderedList.addToRear(content3);
        
        System.out.println(aOrderedList.toString());
        System.out.println(aUnorderedList.toString());
        System.out.println(lOrderedList.toString());
        System.out.println(lUnorderedList.toString());
        
        aOrderedList.remove(content2);
        System.out.println(aOrderedList.toString());
        
        aUnorderedList.remove(content2);
        System.out.println(aUnorderedList.toString());
        
        lOrderedList.remove(content2);
        System.out.println(lOrderedList.toString());
        
        lUnorderedList.remove(content2);
        System.out.println(lUnorderedList.toString());
        
        aOrderedList.removeFirst();
        System.out.println(aOrderedList.toString());
        
        aUnorderedList.removeFirst();
        System.out.println(aUnorderedList.toString());
        
        
        // 3. Push all of the changes back to the repository (git push)
        
    }
}

































