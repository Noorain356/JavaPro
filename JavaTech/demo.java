package JavaTech;
abstract class A3{
    public abstract void show1();
    public abstract void config1();
}
// class B3 extends A3{
//     public void show1(){
//         System.out.println("In show 1");
//     }
// }

public class demo{
   public static void main(String a[]){
    A3 obj = new A3()
    {
        public void show1(){
            System.out.println("In new Show");
    }
        public void config1() {
            System.out.println("In config");
        }
    };
    obj.show1();
    obj.config1();

   } 
}
