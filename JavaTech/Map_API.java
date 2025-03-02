package JavaTech;
//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Map_API {
    
        public static void main(String[] args) {
            Map<String, Integer> students = new Hashtable<>();
            //Map<String, Integer> students = new HashMap<>();
            students.put("Navin", 45);
            students.put("Harsh", 65);
            students.put("Sushil", 56);
            students.put("Kiran", 59);
            students.put("Kiran", 59);
    
            // System.out.println(students);
            // System.out.println(students.get("Harsh"));
            System.out.println(students.keySet());    
            
            for(String key : students.keySet()){
                
               System.out.println(key + " : " + students.get(key));
    }
}
}