/**
 * ThreadMainClass.java  1.1  01-09-2017
 */
package session82;
/**
* This program will implement a class that checks whether a given number is a prime using
* both the Thread class and Runnable interface
* 
* Version 1.1
* 
* Compiled on 01-Sep-2017 
* 
* @author Chhaya Yadav
 */
import java.lang.*;

//Main class declaration to extend Thread class and Implement Runnable interface.

public class ThreadMainClass extends Thread implements Runnable {
	
//Run method declaration in order to implement Runnable Interface	
	
	public void run(){
		
//Object Instantiation of PrimeCheck class		
		
		PrimeCheck p1 = new PrimeCheck();
		
//Invoking the PrintTable method of PrimeCheck Class			
		
		p1.printTable(5);
	}
	
//Main method declaration
	
	public static void main(String[] args) {
		
//PrimCheck class instantiation 
		
		PrimeCheck p = new PrimeCheck();
		
//ThreadMainClass object instantiation declaring its local  run method which will execute
//once this thread will be started
		
		ThreadMainClass th1 = new ThreadMainClass(){
			
			                  public void run(){
				
//Invoking the PrintTable method of PrimeCheck Class				
				
			                	  p.printTable(27);
				
				
			                 }
		};
		
		
//Thread Class object instantiation declaring its local  run method which will execute
//once this thread will be started
		
		ThreadMainClass tmc = new ThreadMainClass();
		
		Thread th2 = new Thread(tmc){
			
                     public void run(){
				
//Invoking the PrintTable method of PrimeCheck Class	
                	   
				            p.printTable(2);
		       
				    		
			         }
		};
		
		

		
//ThreadMainclass object instantiation and accessing the run method of ThreadMainClass method		
		
        ThreadMainClass tm = new ThreadMainClass();
		
		Thread th3 = new Thread(tm);
		
		
		
//Setting the priority of each thread 	
		
		th1.setPriority(MAX_PRIORITY);
		
		th2.setPriority(NORM_PRIORITY);
		
		th3.setPriority(MIN_PRIORITY);
		
//Starting all the 3 threads
		
		th1.start();
		
		th2.start();
		
		th3.start();
		
	}

}
