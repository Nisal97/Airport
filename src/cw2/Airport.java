package cw2 ;
import java.io.IOException;
import java.util.Scanner;


public class Airport {
	
    private static PassengerQueue airportQueue = new PassengerQueue(30);
    
    public static void main(String[] args) throws IOException{
    	
    	Passenger[] passenger = new Passenger[30];
    	for(int x=0;x<passenger.length;x++){
    		passenger[x]=new Passenger(null, null, x);
            }
    	for(int x=0;x<passenger.length;x++){
    		passenger[x].setFirstName(" ");
    		passenger[x].setSurname(" ");
    		passenger[x].setSecsInQueue(0);
            }
    	
    	
    	Scanner sc = new Scanner(System.in);
    	AirportMenu(); 
    	String userValue=sc.nextLine().toUpperCase();
    	
    	do{
    	switch(userValue){
    		case "V":
    			airportQueue.display();
    			
    			AirportMenu();
    			userValue=sc.nextLine().toUpperCase();
    			break;
    		case "A":
    			airportQueue.add();
    			
    			
    			AirportMenu();
    			userValue=sc.nextLine().toUpperCase();
    			break;
    		case "D":
    			airportQueue.remove();
    		
    			
    			AirportMenu();
    			userValue=sc.nextLine().toUpperCase();
    			break;
    		case "S":
    			airportQueue.storeData();
    			
    	
    			
    			
    		default:
    			System.out.println("Invalid input");
    			
    			AirportMenu();
    			userValue=sc.nextLine().toUpperCase();
    	}
    	}while(!userValue.equals("X"));
    	
    }
    
    
    private static void AirportMenu(){
		   
		System.out.println("==============================================");
		System.out.println("|   Main Menu - Informatics Airport   |");
		System.out.println("==============================================");
    	System.out.println("V: Display passenger queue");
    	System.out.println("A: Add new passenger to passenger queue");
    	System.out.println("D: Delete passenger from passenger queue");	
    	System.out.println("S: Store passenger data in file");	
    	System.out.println("L: Load passenger data from file");	
    	System.out.println("R: Run the simulation and produce report");	
    	System.out.println("X: Exit the menu ");
		System.out.println("==============================================");

     }
}
