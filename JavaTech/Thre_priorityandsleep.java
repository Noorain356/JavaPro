package JavaTech;

// class C implements Runnable{ //can extends thread
//     public void run(){
//         for(int i=1;i<=5;i++){
//             System.out.println("hii");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//               e.printStackTrace();
//             }
//         }
//     }
// }
class D implements Runnable { //can extends thread
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Thre_priorityandsleep {
    public static void main(String[] args) {
        
        Runnable obj1 = new Runnable() { public void run(){
                    for(int i=1;i<=5;i++){
                        System.out.println("hii");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                          e.printStackTrace();
                        }
                    }
                }
        };
        //Runnable obj1 = new C();
        Runnable obj2 = new D();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        // C obj1 = new C();
        // D obj2 = new D();
        //System.out.println(obj1.getPriority());
        // obj2.setPriority(Thread.MAX_PRIORITY);
       // obj1.start();
        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        //obj2.start();
        t1.start(); 
        t2.start(); 
    }
}
