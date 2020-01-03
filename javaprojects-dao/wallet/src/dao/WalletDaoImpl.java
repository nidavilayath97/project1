package dao;
import entities.Wallet;

import java.util.*;
import entities.Wallet;
import exceptions.IncorrectNumException;

public class WalletDaoImpl implements WalletDao {
	private Map <String, Wallet> store=new HashMap<>();
	
	@Override
	public void addWallets(Wallet e) {
		store.put(e.getNumber(), e);
		}
	
	public Wallet findWalletByNum(String number) {
		Wallet e=store.get(number);
		if(e==null) {
			throw new IncorrectNumException("Wallet not found for given number" +number);
		}
		return e;
		
	}
	
	@Override
	public Set<Wallet> allWallets (){
		Collection<Wallet> wallets= store.values();
		Set<Wallet> walletset=new HashSet<>(wallets);
		return walletset;
	}

}
