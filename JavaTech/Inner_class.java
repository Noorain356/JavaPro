package codes;
class A{ // can't make outer class Static

    int age;
    public void show(){
       System.out.println("In show");
    }
    static class B{
       public void config(){
         System.out.println("In Config");
       }
    }
    // Non static class 
    // static class B{
    //     public void config(){
    //       System.out.println("In Config");
    //     }
    //  }

}
public class Inner_class {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        //  static class 
        A.B obj1 = new A.B();
        obj1.config();
        // Non static class 
        // A.B obj1 = obj.new B();
        // obj1.config(); 
        
        
    }   
}
