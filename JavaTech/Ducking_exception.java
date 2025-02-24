package codes;
class A{
    public void show() throws ClassNotFoundException{
         //try{
            Class.forName("calc");

        //}
       // catch(ClassNotFoundException e){
         //   System.out.println("Not able to find the class"+e);
        //}
    }
}
public class Ducking_exception {
    static{
        System.out.println("class loaded");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        A obj = new A();
        obj.show();
    }

}
