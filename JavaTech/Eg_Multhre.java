package JavaTech;
class A{
    public void call1(){
        for(int i=1;i<=10;i++){
            System.out.println("hii");
        }
    }
}
class B{
    public void call2(){
        for(int i=1;i<=10;i++){
            System.out.println("hello");
        }
    }
}
public class Eg_Multhre{
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();
    
        obj1.call1();
        obj2.call2();
    }
}
    

