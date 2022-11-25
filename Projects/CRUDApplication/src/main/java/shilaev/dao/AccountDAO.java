package shilaev.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import shilaev.models.Account;

import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Component
public class AccountDAO {
    private final JdbcTemplate jdbcTemplate;
    List<Account> accountsList = get_100_RandomAccounts();

    @Autowired
    public AccountDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Account> getAccounts() {
        return jdbcTemplate.query("SELECT * FROM accounts", new AccountMapper());
    }

    // CREATE
    public void addAccount(Account newAccount) {
        String query = "INSERT INTO accounts (name, balance, type) VALUES (?, ?, ?)";
        jdbcTemplate.update(query,
                newAccount.getName(),
                newAccount.getBalance(),
                newAccount.getType());
    }

    // READE
    public Account getAccount(int id) {
        String query = "SELECT * FROM accounts where id = ?";
        return jdbcTemplate.queryForObject(query, new AccountMapper(), id);
    }

    // UPDATE
    public void update(int id, Account newAcc) {
        String query = "update accounts set name = ?, balance = ?, type = ? where id = ?";
        jdbcTemplate.update(query, newAcc.getName(), newAcc.getBalance(), newAcc.getType(), id);
    }

    // DELETE
    public void delete(int id) {
        String query = "delete from accounts where id = ?";
        jdbcTemplate.update(query, id);
    }

    // MULTIPLY DELETE
    public void delete(int fromId, int toId) {
        String query = "delete from accounts where id between ? and ?";
        jdbcTemplate.update(query, fromId, toId);
    }

    //////////////////////////////////
    /////// BATCH UPDATE TEST ////////
    //////////////////////////////////
    public void batchAddAccounts() {
        String insertAccounts = "INSERT INTO accounts (name, balance, type) VALUES (?, ?, ?)";
        jdbcTemplate.batchUpdate(insertAccounts, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, "Unnamed");
                ps.setFloat(2, 0.0f);
                ps.setString(3, "No_Type");
            }

            @Override
            public int getBatchSize() {
                return accountsList.size();
            }
        });
    }

    public void batchUpdateAccounts() {

        String patchAccounts = "update accounts " +
                "set name = ?, balance = ?, type = ?" +
                "where id = ?";
        jdbcTemplate.batchUpdate(patchAccounts, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, accountsList.get(i).getName());
                ps.setFloat(2, accountsList.get(i).getBalance());
                ps.setString(3, accountsList.get(i).getType());
                ps.setInt(4, accountsList.get(i).getId());
            }

            @Override
            public int getBatchSize() {
                return accountsList.size();
            }
        });
    }

    protected List<Account> get_100_RandomAccounts() {
        List<Account> patchedAccounts = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            patchedAccounts.add(new Account(
                    i,
                    getRandomString(),
                    getRandomFloat(),
                    "Mir"
            ));
        }
        return patchedAccounts;
    }

    protected float getRandomFloat() {
        float minX = 0.0f;
        float maxX = 10000.0f;

        Random rand = new Random();

        return (maxX - minX) * rand.nextFloat() + minX;
    }

    protected String getRandomString() {
        return java.util.UUID.randomUUID().toString();
    }

}
