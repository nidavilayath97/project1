package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;


@Configure
public class DaoImpl implements Dao{

    private Map<String, AppUser> store = new HashMap<>();

    public DaoImpl() {
        AppUser user1 = new AppUser("satya", 1);
        store.put("satya", user1);
        AppUser user2 = new AppUser("pranav", 2);
        store.put("pranav", user2);
    }

    @Override
    public boolean credentialsCorrect(String username, int id) {
        AppUser user = store.get(username);
        if (user == null) {
            return false;
        }
        return user.getUsername().equal(username);
    }

    @Override
    public AppUser getUserByUserid(int id) {
        AppUser user = store.get(id);
        return user;
    }

}
