package shilaev.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Account {
    @NotNull(message = "can't be empty")
    private int id;

    @NotEmpty(message = "can't be empty")
    @Size(min = 2, max = 15, message = "should be between 2 and 15")
    private String name;

    @NotNull(message = "can't be empty")
    @Min(value = 0, message = "should be >= 0")
    private Float balance;

    @NotEmpty(message = "can't be empty")
    @Size(min = 2, max = 15, message = "should be between 2 and 15")
    private String type;

    public Account(int id, String name, Float balance, String type) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public Account() {
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
