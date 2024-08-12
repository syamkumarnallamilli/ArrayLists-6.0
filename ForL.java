import java.util.ArrayList;

public class ForL {
    public static void main(String[] args) {
        // Prepare an object for ArrayList
        ArrayList<String> stringList = new ArrayList<>();

        // Load String values into the ArrayList
        stringList.add("sri");
        stringList.add("keerthana");
        stringList.add("syam");


        // Iterate over them using
        for (String fruit : stringList) {
          System.out.println(fruit);
      }
    }}
