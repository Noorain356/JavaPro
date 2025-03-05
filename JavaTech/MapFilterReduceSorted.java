package JavaTech;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Function;
// import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterReduceSorted {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        //map
        //Function<Integer,Integer> fun = n ->  n*2; 
        // Function<Integer,Integer> fun = new Function<Integer,Integer>() {
        //   public Integer apply(Integer n) {
        //         return n*2; 
        //     }
            
        // };
   
        //Filter
        //Predicate<Integer> p =  n ->  n%2==0; 
        // Predicate<Integer> p = new Predicate<Integer>() {
        //     public boolean test(Integer n){
        //         return n%2==0; 
          
                // if(n%2==0)
                //     return true;
                // else    
                // return false;
    //         }
    // };
       
    
        // int result = nums.stream()
        //         .filter(p)
        //         .map(fun)
        //         .reduce(0, (c,e)-> c+e);
       
    
        // Stream<Integer> sortedValues = nums.stream()
        //         .filter(n ->  n%2==0)
        //         .sorted();
        // sortedValues.forEach(n -> System.out.println(n));       
        
        Stream<Integer> sortedValues = nums.parallelStream()
                .filter(n ->  n%2==0);
                
    
        sortedValues.forEach(n -> System.out.println(n));         
       
    
    //System.out.println(result);
    


   } 
}
