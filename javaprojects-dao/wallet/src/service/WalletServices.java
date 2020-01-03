package service;
import java.util.*;

import entities.Wallet;

public interface WalletServices {
	
	void addWallets(Wallet e);
	
	Wallet findWalletByNum(String number);
	
	Set<Wallet> allWallets();
	

}
