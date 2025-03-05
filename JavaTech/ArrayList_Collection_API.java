package JavaTech;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class ArrayList_Collection_API {
    public static void main(String[] args) {
         
        List<Integer> nums = new ArrayList<Integer>(); //for index value
        //Collection<Integer> nums = new ArrayList<Integer>(); // for printing same
        //Collection nums = new ArrayList();
        nums.add(8);
        nums.add(9);
        nums.add(0);
        nums.add(5);
        nums.add(5);
        //nums.add("5");

        System.out.println(nums);
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(9));

       for(int n : nums){
      // for(Object n : nums){
        int num = (Integer)n;
       System.out.println(num*2);
    }
      }
    }

