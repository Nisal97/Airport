package cw2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class PassengerQueue {
	 Passenger[]queueArray= new Passenger[30];
    private int firstName=0; 
    private int last=0;
    private int maxSize;
    private int count=0;
    int i;
    private static int arrfirst = 0;
    public PassengerQueue(int maxSize){
     
        this.maxSize=maxSize;
        initialiseArr(queueArray);
    }

    
    public void initialiseArr(Passenger pArr[]) {
        for (int x = 0; x <30; x++ ){ 
        	pArr[x]=new Passenger(null,null,x);
        }
        	System.out.println( "Initialised!!! ");
       }
    
	@SuppressWarnings({ "resource" })
	public void add(){
    	
		Scanner input = new Scanner(System.in);
		
        if(count==30){ 
        	 System.out.println("The queue is full!");
        }
        else{     
           
	        System.out.print("Enter first name of the passenger :");    
	        String firstName = input.next();
	       
	        
	
	        System.out.print("Enter last name of the passenger : ");
	        String lastName = input.next();
	        
	        Passenger mypassenger = new Passenger(firstName,lastName,0);
	        queueArray[last] = mypassenger;
	        
	        last++;
	        count++;
        }
    }
    public void remove(){
    	
    	 if (isEmpty()) {
    		 System.out.println("Empty queue");
         } else {
               
             System.out.println("Passenger deleted :" + queueArray[firstName].getFirstName() +" "+ queueArray[firstName].getSurname());
             
             
             	queueArray[firstName].setFirstName(" ");
             	queueArray[firstName].setSurname(" ");
             	firstName++;
            last--;
            count--;
            
         }
        
    }
    public void display(){
        
    	 System.out.println("Queue display: ");
       
    	 for(Passenger pArr:queueArray){
    		 System.out.print(pArr.getFirstName()+" "+pArr.getSurname()+"\n");
         }
    	 System.out.println(" ");
    	}
    
    public void storeData()throws UnsupportedEncodingException, FileNotFoundException, IOException {
		String filename = "\\customer.txt";
		
		File desktop = new File(System.getProperty("user.home"), "Desktop");
		String filePath = desktop + filename;
		System.out.println("File saved in desktop under name customer.txt");
		File file = new File(filePath);

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		
			for (Passenger pass : queueArray) {
				if(pass.getFirstName()!=null && pass.getSurname()!=null){
					bw.write(pass.getFirstName()+ " ");
					bw.write(pass.getSurname()+ "");
					bw.newLine();
				}
			}
		
		bw.close();

		System.out.println("\nAll the data was successfully saved to a text file.\n");
    }
    
    /* public void loadData() throws IOException{
    	String filename = "\\customer.txt";
		File desktop = new File(System.getProperty("user.home"), "Desktop");
		String filePath1 = desktop + filename;
		BufferedReader in = new BufferedReader(new FileReader(filePath1));
		String lnTxt = null;
		
		int i=0;
		while ((lnTxt = in.readLine()) != null) {
			
			//String line;
			//line = in.readLine();
			String[] words=lnTxt.split(" ");
			
			queueArray[i].setFirstName(words[0]);
			queueArray[i].setSurname(words[1]);
				
			i++;
			count++;
		}
		System.out.println("Data loaded sucesfully");
		System.out.println(count);
		in.close(); 
	} */
    



	

    public int getMaxSize(int NewMaxSize){
        return maxSize;
    }
    public boolean isEmpty(){
        
    	return (count==0);
    }
    public boolean isFull(){
    	
    	return (count==maxSize);
    	
    }
}
    
