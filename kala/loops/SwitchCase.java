package loops;

import java.util.Scanner;

public class SwitchCase {       
    public static void main(String args[])  
    {    
    	
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the correct age for voting : Option A: 16 Option B: 18 Option C: 65");
         int age = sc.nextInt();        
         switch (age)  
         {  
             case (16):            
                 System.out.println("You are under 18.");  
                 break;  
             case (18):                
                 System.out.println("You are eligible for vote.");  
                 break;  
             case (65):                
                 System.out.println("You are senior citizen.");  
                 break;  
             default:  
                 System.out.println("Please give the valid age.");  
                 break;  
         }             
     }  
}  
