import java.util.ArrayList;
import java.util.Iterator;
public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
          ArrayList<Integer> list = new ArrayList<>();
          list.add(65);
          list.add(87);



          Iterator<Integer> iterator = list.iterator();
          while (iterator.hasNext()) {
              // Print each element
              System.out.println(iterator.next());

}}
}