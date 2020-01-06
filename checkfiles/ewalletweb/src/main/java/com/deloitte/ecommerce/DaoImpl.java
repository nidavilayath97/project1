package com.deloitte.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class DaoImpl implements Dao{

    private Map<String, Customer> store = new HashMap<>();

    public DaoImpl() {
        Customer user1 = new Customer("23563814","Nida", "1234",21);
        store.put("23563814", user1);
        Customer user2 = new Customer("1234","Neeraj", "678",21);
        store.put("1234", user2);
    }

    @Override
    public boolean credentialsCorrect(String mobileno, String password) {
        Customer user = store.get(mobileno);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }

    @Override
    public Customer getUserByMobileno(String mobileno) {
        Customer user = store.get(mobileno);
        return user;
    }

}
