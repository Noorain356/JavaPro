package codes;
class NavinException extends Exception{
 public NavinException(String string){
    super(string);
 }
}

public class Custom_exception {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try{
            Class.forName("Calc");

        }
        catch(ClassNotFoundException e){
            System.out.println("Not able to find the class"+e);
        }
        try{
            j = 18/i;
            if(j==0)
            throw new NavinException("I dont want to print zero");
        } 
        catch(NavinException e){
            j = 18/1;
            System.out.println("This is default output"+e);  
        
        }
        catch(Exception e){
            System.out.println("Something went wrong"+e);
        }
        System.out.println(j);
        System.out.println("bye"); 
}
}
