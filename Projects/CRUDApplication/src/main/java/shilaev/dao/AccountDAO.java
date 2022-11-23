package shilaev.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import shilaev.configuration.SpringConfiguration;
import shilaev.models.Account;

import java.util.List;

@Component
public class AccountDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AccountDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Account> getAccounts() {
        return jdbcTemplate.query("SELECT * FROM accounts", new AccountMapper());
    }

    public Account getAccount(int id) {
        String query = "SELECT * FROM accounts where id = ?";
        return jdbcTemplate.queryForObject(query, new AccountMapper(), id);
    }

    public void addAccount(Account newAccount) {
        String query = "INSERT INTO accounts (name, balance, type)\n" +
                "VALUES (?, ?, ?)";
        jdbcTemplate.update(query,
                newAccount.getName(),
                newAccount.getBalance(),
                newAccount.getType());
    }

    public void delete(int id) {
        String query = "DELETE FROM accounts WHERE accounts.id = ?";
        jdbcTemplate.update(query, id);
    }

    public void update(int id, Account newAcc) {
        String query = "update accounts\n" +
                "set name = ?,\n" +
                "    balance = ?,\n" +
                "    type = ?\n" +
                "where id = ?;";
        jdbcTemplate.update(query, newAcc.getName(), newAcc.getBalance(), newAcc.getType(), id);
    }
}
