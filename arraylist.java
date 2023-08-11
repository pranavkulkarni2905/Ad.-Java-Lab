/* Online Java Compiler and Editor 
Write a Java program to remove the third element from an array list
Algorithm
1. Create an ArrayList.
2. Add elements to the ArrayList.
3. Check if the ArrayList size is at least 3.
4. If yes, remove the element at index 2 (third element).
5. Print the updated ArrayList.
*/
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        List<Integer> list=new ArrayList<>();
        
        //adding elements in arraylist
        
        list.add(10);
        list.add(78);
        list.add(55);
        
        // for(int i:list){
        //     System.out.println("Element"+(i+1)+" :"+list.get(i));
        // }
        
        System.out.println("ArrayList is:"+list);
        
        // check whether size is 3 or not
        
        if(list.size()>=3){
            System.out.println("Size of the arraylist is :"+list.size());
            
            //removing element from 2nd index
            int n=list.remove(2);
            System.out.println("Removed element is :"+n);
            System.out.println("After removing array list is:"+list);
        }
        else{
            System.out.println("Size of the arraylist is greater than 3");
        }
        
     }
}
