package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Try_With_Resources {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        BufferedReader br = null;

        try{
        InputStreamReader in = new InputStreamReader(System.in);
        br = new BufferedReader(in);
        num = Integer.parseInt(br.readLine());
        System.out.println(num);
        }
      
        finally{
           br.close();
        }
    }
    
}
