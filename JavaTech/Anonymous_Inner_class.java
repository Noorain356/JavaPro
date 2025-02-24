package codes;
class A1{
    public void config(){
        System.out.println("in A config");
    }
}
//   class B1 extends A1{
//     public void config(){
//       System.out.println("In B Show");
//     }

// }

public class Anonymous_Inner_class {
      public static void main(String[] args) {
        A1 obj = new A1(){
            public void config(){
                System.out.println("in new config");
            }
        };
        obj.config();
        
      }
}
