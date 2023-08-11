/* Online Java Compiler and Editor */
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        List<Integer> list=new LinkedList<>();
        
        //adding elements in arraylist
        
        list.add(10);
        list.add(78);
        list.add(55);
        
        // for(int i:list){
        //     System.out.println("Element"+(i+1)+" :"+list.get(i));
        // }
        
        System.out.println("LinkedList is:"+list);
        
        // check whether size is 3 or not
        
        if(list.size()>=3){
            System.out.println("Size of the LinkedList is :"+list.size());
            
            //removing element from 2nd index
            int n=list.remove(2);
            System.out.println("Removed element is :"+n);
            System.out.println("After removing LinkedList is:"+list);
        }
        else{
            System.out.println("Size of the LinkedList is greater than 3");
        }
        
     }
}
