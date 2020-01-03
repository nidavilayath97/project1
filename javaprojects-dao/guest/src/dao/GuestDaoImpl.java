package dao;
import java.util.*;
import entities.*;

import exceptions.IncorrectIdException;
import util.GuestIdComparator;

public class GuestDaoImpl implements IGuestDao {
	private Map<Integer, Guest> Store=new HashMap<>();
	
	@Override
	public void addGuest(Guest e) {
		Store.put(e.getId(),e);
	}
		
    @Override
	public Guest findGuestById(int id) {
		Guest e= Store.get(id);
		if(e==null) {
			throw new IncorrectIdException ("Guest not found for id" +id);
			}
			return e;
		}
	
	@Override
	 public Set<Guest> allGuests(){
		Collection<Guest> guests=Store.values();
		Set <Guest> guestSet =new TreeSet<>(new GuestIdComparator());
		guestSet.addAll(guests);
		return guestSet;
	}
	
	

}
