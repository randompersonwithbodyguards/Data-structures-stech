/*
Author: austin smith
Date: march 31 2020

Description: making the sort method
*/
import java.util.ArrayList;

public class Exercise19_09 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(4);
    list.add(42);
    list.add(5);
    Exercise19_09.<Integer>sort(list);
    
    System.out.print(list);
  }
  public static <E extends Comparable<E>> void sort(ArrayList<E> list){
    ArrayList<E> tempList = (ArrayList<E>)list.clone();
    for (int i = 0; i < list.size(); i++) {
      //compare list.get(i) to the indexes after it, if the compared index is smaller, swap them
      E cache;
      for (int j = 0; j < list.size(); j++) {
        if (list.get(i).compareTo(list.get(j))<0) {
          cache = list.get(i);
          list.set(i, list.get(j));
          list.set(j, cache);
        }
      }
    }
  }
}
