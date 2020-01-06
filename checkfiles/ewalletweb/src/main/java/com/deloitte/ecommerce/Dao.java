package com.deloitte.ecommerce;

public interface Dao {
    Customer getUserByMobileno(String mobileno);

    boolean credentialsCorrect(String mobileno, String password);
}
