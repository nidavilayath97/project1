package ui;
import java.util.*;


import dao.WalletDaoImpl;
import entities.Wallet;
import service.WalletServicesImple;
import service.WalletServices;

public class WalletUi {
	
	public WalletServices service = new WalletServicesImple(new WalletDaoImpl());

    public static void main(String[] args) {
        WalletUi ui = new WalletUi();
        ui.runUi();
    }

    public void runUi() {
        try {
            Wallet e1 = new Wallet("2345678871", "chandra",400);
            Wallet e2 = new Wallet("9885787960", "satya",70000);
            service.addWallets(e1);
            service.addWallets(e2);
            Wallet fetched1 = service.findWalletByNum("2345678871");
            Wallet fetched2 = service.findWalletByNum("9885787960");
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            System.out.println("********printing all wallets****");
            Set<Wallet> wallets = service.allWallets();
            print(wallets);
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("something went wrong");
        }
    }

    void print(Collection<Wallet>wallets){
        for (Wallet e:wallets){
            System.out.println(""+e.getNumber()+" "+e.getName()+ " "+e.getBalance());
       
            

}
    }
}
