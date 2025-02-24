package codes; 
 abstract class car {
    public  abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play music.");
    }
     
    
 }
 abstract class wagonR extends car{
    
    
    public void drive(){
        System.out.println("Driving");
    }

 }
 class UpdatewagonR extends wagonR{

    @Override
    public void fly() {
        System.out.println("Flying");
    } 
 }

public class AbstractKeyword {
    public static void main(String[] args) {
        car obj = new UpdatewagonR();
        obj.drive();
        obj.playMusic();

    }
}
