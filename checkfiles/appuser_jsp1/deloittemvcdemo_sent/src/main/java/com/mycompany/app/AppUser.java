package com.mycompany.app;

public class AppUser {

    public AppUser() {

    }

    public AppUser(String username,  int id) {
        this.username = username;
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AppUser)) {
            return false;
        }
        AppUser user = (AppUser) obj;
        return user.username.equals(this.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }
}
