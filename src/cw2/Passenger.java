package cw2;
public class Passenger {
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", surname=" + surname + ", secsInQueue=" + secondsInQueue + "]";
	}

	private String firstName;
	private String surname;
	private int secondsInQueue;
	
	
	 public Passenger(String firstName,String surname,int secondsInQueue){
	       this.firstName=firstName;
	       this.surname=surname;
	       this.secondsInQueue = secondsInQueue;
	   }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	    	if(firstName.length()>0)
	        this.firstName = firstName;
	    }

	    public String getSurname() {
	        return surname;
	    }

	    public void setSurname(String surname) {
	    	if(surname.length()>0)
	        this.surname = surname;
	    }

	    public int getSecsInQueue() {
	        return secondsInQueue;
	    }

	    public void setSecsInQueue(int secsInQueue) {
	        this.secondsInQueue = secondsInQueue;
	    }
	   
		 
}
