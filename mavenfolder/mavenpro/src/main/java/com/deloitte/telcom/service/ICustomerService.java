package com.deloitte.telcom.service;
import java.util.*;
import com.deloitte.telcom.entities.*;

public interface ICustomerService {
	CustomerAccount createAccount(String mobNo,String name,String AccType,double bal);
	CustomerAccount findCustomerByMobNo(String mobNo);
	void rechargeAccount(CustomerAccount ac,double addBalance);
	Map<String,CustomerAccount> store=new HashMap<>();
	
	
}
