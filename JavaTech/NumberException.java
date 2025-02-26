package JavaTech;

public class NumberException {
    public static void main(String[] args) {
        
        Runnable obj3 = () ->{
            for(int i=1;i<=5;i++){
                System.out.println("hii");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                } 
        }
    };         
    
        Runnable obj4 = () ->{
        
            for(int i=1;i<=5;i++){
                System.out.println("hello");
            try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } 
        };
        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);
       
        t1.start(); 
        t2.start(); 
    }
}
