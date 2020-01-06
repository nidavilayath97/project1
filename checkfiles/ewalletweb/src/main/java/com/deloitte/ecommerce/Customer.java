package com.deloitte.ecommerce;

public class Customer {
	public Customer() {

    }

    public Customer(String mobileno, String username, String password, int age) {
        this.mobileno=mobileno;
    	this.username = username;
        this.password = password;
        this.age = age;
    }
    
    private String mobileno;

    public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public Customer(String mobileno) {
		super();
		this.mobileno = mobileno;
	}

	private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof Customer)) {
            return false;
        }
        Customer user = (Customer) obj;
        return user.username.equals(this.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }
}



