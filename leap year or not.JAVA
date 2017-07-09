import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         
        System.out.println("Enter year:");
        Scanner a = new Scanner(System.in);
        int p = a.nextInt();
        
        if(p % 4 ==0 && (p % 400 == 0 || p % 100 != 0)){
            System.out.println("year is a leap year");
        }
        
        else{
            System.out.println("not a leap year");
        }
            
            

     }
}
