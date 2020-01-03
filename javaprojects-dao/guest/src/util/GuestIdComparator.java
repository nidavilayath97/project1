package util;
import java.util.*;
import entities.Guest;



public class GuestIdComparator implements Comparator <Guest>{
	public int Compare(int num1,int num2) {
		if(num1>num2) {
			return 1;
		}
		if (num1<num2) {
			return -1;
		}
		return 0;
	} 
	

}
