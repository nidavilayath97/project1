package com.deloitte.ecommerce;

public interface Service {
    Customer getUserByMobileno(String mobileno);

    boolean credentialsCorrect(String mobileno, String password);

}
