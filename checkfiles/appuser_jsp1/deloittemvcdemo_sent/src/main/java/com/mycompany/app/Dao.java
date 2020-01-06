package com.mycompany.app;

public interface Dao {
    AppUser getUserById(int id);

    boolean credentialsCorrect(String username, int id);
}
