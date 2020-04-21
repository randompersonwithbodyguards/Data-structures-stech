/*
Author: Austin Smith 
Date: march 31 2020

Description: making the max method
 */
import java.util.Arrays;

public class Exercise19_05 {
  public static void main(String[] args) {
    Integer[] numbers = {1, 2, 3,};
    System.out.println(max(numbers));
    
    String[] words = {"red", "green", "blue"};
    System.out.println(max(words));
    
    Circle[] circles = {new Circle(3), new Circle(2.9), new Circle(5.9)};
    System.out.println(max(circles));
  }
  public static <E extends Comparable<E>> E max(E[] list){
    //E returnList = new E[list.length];
    E biggest = list[0];
      
    //the for runs through every number in the array to get the biggest one
    for (int i = 0; i < list.length-1; i++) {
      if (biggest.compareTo(list[i+1]) < 0) {
        biggest = list[i+1];
      }
    }
    return biggest;
  }
  
  
  static class Circle implements Comparable<Circle> {
    double radius;
    
    public Circle(double radius) {
      this.radius = radius;
    }
    
    @Override
    public int compareTo(Circle c) {
      if (radius < c.radius) 
        return -1;
      else if (radius == c.radius)
        return 0;
      else
        return 1;
    }
    
    @Override
    public String toString() {
      return "Circle radius: " + radius;
    }
  }
}
