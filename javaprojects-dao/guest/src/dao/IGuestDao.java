package dao;
import entities.*;
import java.util.*;

public interface IGuestDao {
	void addGuest(Guest e);
	public Guest findGuestById(int id);
	Set<Guest> allGuests();
		

}
