/**
 * PrimeCheck.java  1.1  01-09-2017
 */
package session82;
/**
* This program will implement a class that checks whether a given number is a prime .
* 
* Version 1.1
* 
* Compiled on 01-Sep-2017 
* 
* @author Chhaya Yadav
*/
//Class declaration
public class PrimeCheck {
	
//Member variable declaration	
	
	boolean flag  ;
	
//Method declaration	

	public void printTable(int n){
		
// set the flag to false
		
		flag = false ;
		
		for(int i = 2 ; i < n; i++){
		  
//If number is divisible by any number lesser than given number the set the flag true
//implying that number is not prime number			
			if((n%i==0) & (i!=n)){
			
			
				flag = true ;
				
				break ;
				
			}
			
		
		}
		
//if number is not totally divisible by any other number except itself
//flag will still be set to False,thus display appropriate message	
		
		if(!flag){
			
			System.out.println(n +" is a prime number");
		}
		
//if number is totally divisible by any other number except itself
//flag will change to true,thus display appropriate message
		
		else{
			
			System.out.println(n +" is a not prime number");
		}
			
		
		
	}

	
}
