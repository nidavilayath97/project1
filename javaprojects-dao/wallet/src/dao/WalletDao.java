package dao;
import java.util.*;

import entities.Wallet;

public interface WalletDao {
	
	void addWallets(Wallet e);
	
	Wallet findWalletByNum(String number);
	
	Set<Wallet> allWallets();
	
	

}
