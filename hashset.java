/* Online Java Compiler and Editor 
Write a Java program to remove the third element from an array Sets.
Algorithm
1. Create a HashSet.
2. Add elements to the HashSet.
3. Convert the HashSet to an ArrayList (to access elements by index).
4. Check if the ArrayList size is at least 3.
5. If yes, remove the element at index 2 (third element) from the HashSet.
6. Print the updated HashSet
*/
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        HashSet<String> set=new HashSet<>();
        
        //adding elements in arraylist
        
        set.add("Banana");
        set.add("Apple");
        set.add("Strawbery");
        
        
        
        System.out.println("HashSet is:"+set);
        
        //convert hashset into the array lkkist
        ArrayList<String> list=new ArrayList<>(set);
        
        // check whether size is 3 or not
    
        
        if(list.size()>=3){
            System.out.println("Size of the LinkedList is :"+list.size());
            
            //removing element from 2nd index
            String n=list.remove(2);
            System.out.println("Removed element is :"+n);
            System.out.println("After removing LinkedList is:"+list);
        }
        else{
            System.out.println("Size of the LinkedList is greater than 3");
        }
        
     }
}
/* Online Java Compiler and Editor */
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        HashSet<String> set=new HashSet<>();
        
        //adding elements in arraylist
        
        set.add("Banana");
        set.add("Apple");
        set.add("Strawbery");
        
        
        
        System.out.println("HashSet is:"+set);
        
        //convert hashset into the array lkkist
        ArrayList<String> list=new ArrayList<>(set);
        
        // check whether size is 3 or not
    
        
        if(list.size()>=3){
            System.out.println("Size of the arraylist is :"+list.size());
            
            //removing element from 2nd index
            String n=list.remove(2);
            System.out.println("Removed element is :"+n);
            System.out.println("After removing arraylist is:"+list);
            set.remove(2);
            System.out.println("after removing HashSet is:"+set);
        }
        else{
            System.out.println("Size of the arraylist is greater than 3");
        }
        
     }
}
