import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         
        System.out.println("Enter first number:");
        Scanner a = new Scanner(System.in);
        int p = a.nextInt();
        
        System.out.println("Enter second number:");
        Scanner b = new Scanner(System.in);
        int q = b.nextInt();
        
        System.out.println("Enter third number:");
        Scanner c = new Scanner(System.in);
        int z = c.nextInt();
        
        if(p > q){
            if(p > z){
            System.out.println("first number is greater" + p);
            }
        }
        else if(q > p){
            if(q > z){
            System.out.println("second number is greater" + q);
            }
        }
        else{
            System.out.println("third number is greater" + z);
        }
            
            
        
        
     }
}
