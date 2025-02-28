package JavaTech;


import java.util.Collection;
//import java.util.HashSet;
import java.util.Iterator;
//import java.util.Set;
import java.util.TreeSet;

public class set_API {
    public static void main(String[] args) {
       
        // Set<Integer> numss = new HashSet<Integer>();
        Collection <Integer> numss = new TreeSet<Integer>();
            numss.add(49);
            numss.add(78);
            numss.add(58);
            numss.add(50);

         Iterator<Integer> values = numss.iterator();
         values.next(); 
         
         while (values.hasNext()) {
            System.out.println(values.next());
            
         }
    
    //  for(int n  : numss){
    //      System.out.println(n);
    //     }
          }
        
    }
    
