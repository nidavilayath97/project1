package com.deloitte.ecommerce;

public class ServiceImpl implements Service {
    private Dao dao;

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public Customer getUserByMobileno(String mobileno) {
        Customer user = dao.getUserByMobileno(mobileno);
        return user;
    }

    @Override
    public boolean credentialsCorrect(String mobileno, String password) {
        boolean correct = dao.credentialsCorrect(mobileno, password);
        return correct;
    }
}
