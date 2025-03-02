package JavaTech;

import java.util.Arrays;
import java.util.List;

public class Stream_API {
     public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        // normal for loop
        // basically goes to the  list to fetch the 1st and 2nd elements nd goes on 
           
        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        // enhanced for loop
        // array itself will give you value and that value goes to n
        // for(int n: nums){
        //     System.out.println(n);
        // }

        // It give one value at a time
        nums.forEach(n -> System.out.println(n) );

        // int sum = 0;
        // for(int n : nums){
        //     if(n%2==0){
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }

        // System.out.println(nums);
        // System.out.println(sum);

     }
}
