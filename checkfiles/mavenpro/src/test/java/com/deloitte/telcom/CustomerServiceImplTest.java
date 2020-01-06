import java.util.*;
import org.junit.Assert;
import org.junit.Test;

import com.deloitte.telcom.dao.CustomerAccountDaoImpl;
import com.deloitte.telcom.entities.CustomerAccount;



public class CustomerServiceImplTest {
	@Test
	public void testCreateAccount_1() {
		CustomerServiceImpl service = new CustomerServiceImpl (new CustomerAccountDaoImpl() );
		String mobileNo="1234567890";
		String name="nida";
		String accountType="prepaid";
		double balance=5000;
		CustomerAccount account=service.createAccount(mobileNo, name, accountType, balance);
		Assert.assertNotNull(account);
		double resultBalance=account.getInitialBalance();
		Assert.assertEquals(balance, resultBalance,0);
		Assert.assertEquals(name,account.getName());
		Map<String,CustomerAccount>store=service.getDao().getstore();
		
		CustomerAccount expected=store.get(mobileNo);
		Assert.assertNotNull(expected);
		Assert.assertEquals(expected, account);
		
		
	}
	@Test
	public void testfindCustomerByMobNo_1() {
		CustomerServiceImpl service=new CustomerServiceImpl(new CustomerAccountDaoImpl ());
		String mobileNo="7897868";
		String name="sanjana";
		String accountType="postpaid";
		double balance=6000;
		CustomerAccount account=service.createAccount(mobileNo, name, accountType, balance);
		Assert.assertNotNull(mobileNo);
		Map<String,CustomerAccount>store=service.getDao().getstore();
		String mobileNo1=account.getMobileNo();
		CustomerAccount expected=store.get(mobileNo1);
		Assert.assertEquals(expected, account);
	}
	

}
