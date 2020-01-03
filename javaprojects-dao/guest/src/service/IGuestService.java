package service;
import entities.*;
import java.util.*;

public interface IGuestService {
	void addGuest(Guest e);
	public Guest findGuestById(int id);
	Set<Guest> allGuests();

	

}
