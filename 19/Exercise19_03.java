/*
Author: Austin smith
Date: 2-27-20

Description: makes a new list that doesn't have duplicates.
 */
import java.util.ArrayList;

public class Exercise19_03 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(14);
    list.add(42);
    list.add(25);
    /* list should be 
    14 24 42 25
    */    
    ArrayList<Integer> newList = removeDuplicates(list);
    
    System.out.print(newList);
  }
  
  public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
    
      ArrayList<E> noDup = new ArrayList<E>();
      
      for(int i=0; i<list.size(); i++){
        
        //if noDUp already has list.get(i) then dont add it
        if(!noDup.contains(list.get(i))){
          noDup.add(list.get(i));
        }
      }
      return noDup;
  }
  
}