/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;
import java.util.*;
/**
 *
 * @author fireb
 */
public class GCD {

    public static void gcd( int x, int y){
        if(x < y)
	{
	       int tmp = x;
		x = y;
		y = tmp;
	}
    
    while (y != 0) {
       int temp = x%y;
         x = y;
         y = temp;
     }
      System.out.println(" The gcd is " + x);
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // TODO code application logic here
        
        System.out.println(" Hello!");
        System.out.println(" Please enter two numbers"); 
        int a = input.nextInt(); 
        int b = input.nextInt(); 
      gcd(a,b);
    }
    
    
}
