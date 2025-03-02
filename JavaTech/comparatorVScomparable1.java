package JavaTech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorVScomparable1 {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)  
                    return 1;
                else{
                    return -1;
              }    
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(47);
        nums.add(98);
        nums.add(80);
        nums.add(78);

        Collections.sort(nums, com);
        System.out.println(nums);

    }
    }