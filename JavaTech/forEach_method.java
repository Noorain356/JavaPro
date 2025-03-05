package JavaTech;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class forEach_method {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
          
        
        // List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
          
        //Consumer<Integer> con = new Consumer<Integer>(){
        //    public void accept(Integer n){
        //       System.out.println(n);
        //    }
        // };
        //nums.forEach(con);

        //nums.forEach(n -> System.out.println(n) );

        //Consumer<Integer> con = n ->  System.out.println(n);
        //nums.forEach(con);
           
        nums.forEach( n -> System.out.println(n));




    }
    
}
