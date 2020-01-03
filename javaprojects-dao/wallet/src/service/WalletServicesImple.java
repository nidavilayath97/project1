package service;
import java.util.Set;

import dao.WalletDao;
import dao.WalletDaoImpl;
import entities.Wallet;
import exceptions.IncorrectIdException;
import exceptions.IncorrectNumException;


public class WalletServicesImple implements WalletServices {
	private WalletDao dao;
	
	
	//public WalletServicesImple(WalletDaoImpl walletDaoImpl) {
		// TODO Auto-generated constructor stub
	//}

	
	public WalletServicesImple(WalletDao dao) {
        this.dao = dao;
    }

    @Override
    public void addWallets(Wallet e) {
        dao.addWallets(e);
    }

    @Override
    public Wallet findWalletByNum(String number) {
        if (number == null) {
            throw new IncorrectNumException("number is incorrect");
        }
        Wallet e = dao.findWalletByNum(number);
        return e;
    }

    @Override
    public Set<Wallet> allWallets() {
        Set<Wallet> wallets = dao.allWallets();
        return wallets;
    }
	

}
