package service;
import entities.*;
import java.util.*;
import dao.IGuestDao;


import exceptions.IncorrectIdException;

public class GuestServiceImpl implements IGuestService {
	
	private IGuestDao dao;
	
	public GuestServiceImpl (IGuestDao dao) {
		this.dao=dao;
	}
	
	@Override
	public void addGuest (Guest e) {
		dao.addGuest(e);
	}
	
	@Override
	public Guest findGuestById(int id) {
		if (id<0) {
			throw new IncorrectIdException("id not found");
		}
		Guest e= dao.findGuestById(id);
		return e;
		}
	
	@Override
	public Set<Guest> allGuests(){
		Set <Guest> guests= dao.allGuests();
		return guests;
		
	}
	
	
	

}
