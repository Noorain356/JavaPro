package JavaTech;
class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class Race_Condition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        
        
        Runnable obj3 = () ->{
            for(int i=1;i<=1000;i++){
               c.increment(); 
        }
    };         
        Runnable obj4 = () ->{
            for(int i=1;i<=1000;i++){
                c.increment();
             } 
        };
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);

        
        t3.start(); 
        t4.start();
        
        t3.join();
        t4.join();
        System.out.println(c.count);
        


    }
}
