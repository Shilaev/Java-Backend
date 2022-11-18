package shilaev.models;

import org.springframework.beans.factory.annotation.Value;

public class Account {
    private int id;
    private String name;
    private Float balance;
    private String type;

    public Account(int id, String name, Float balance, String type) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
