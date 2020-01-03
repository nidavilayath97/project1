package ui;
import java.util.*;
import entities.*;
import service.IGuestService;
import dao.GuestDaoImpl;



public class HotelUi {
	private IGuestService service=new IGuestService(new GuestDaoImpl()) {
		public static void main(String[] args) {
	        GuestUi ui = new GuestUi();
	        ui.runUi();
	    }
	
		
		public void runUi() {
	        try {
	            Guest e1 = new Guest(1, "chandra");
	            Guest e2 = new Guest(2, "satya");
	            Guest e3 = new Guest(3, "chffandra");
	            service.addGuest(e1);
	            service.addGuest(e2);
	            service.addGuest(e3);
	            
	            Guest fetched1=service.findGuestById(1);
	            Guest Fetched2=service.findGuestById(2);
	            System.out.println(fetched1.getName());
	            System.out.pritnln(fetched2.getName());
	            System.out.println("********print all guests********");
	            Set<Guest> guests= service.allGuests();
	            print(guests);
	        }catch (Throwable e) {
	        	System.out.println("Something went wrong");
	        }
		}
		
		void print (Collection<Guest>guests){
			for (Guest g:guests) {
				System.out.println(" "+g.getName()+" "+g.getId());
			}
		}
		
	}


			
		
	        
	            
	            
	           
		
			
	
	


		
