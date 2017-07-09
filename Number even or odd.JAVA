import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Enter a number:");
        Scanner a = new Scanner(System.in);
        int r = a.nextInt();
        if (r % 2 == 0){
            System.out.println("number is even");
            
        }
        else{
            System.out.println("no. is odd");
        }
            
            
        
        
     }
}
