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
    //////////////////////////////////
    /////// BATCH UPDATE TEST ////////
    //////////////////////////////////
    List<Account> accountsList = get_100_RandomAccounts();

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
        String query = "INSERT INTO accounts (id, name, balance, type)\n" +
                "VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(query,
                newAccount.getId(),
                newAccount.getName(),
                newAccount.getBalance(),
                newAccount.getType());
    }

    public void delete(int id) {
        String query = "DELETE FROM accounts WHERE accounts.id = ?";
        jdbcTemplate.update(query, id);
    }

    public void update(int id, Account newAcc) {
        String query = "update accounts set id = ?, name = ?, balance = ?, type = ? where id = ?";
        jdbcTemplate.update(query, newAcc.getId(), newAcc.getName(), newAcc.getBalance(), newAcc.getType(), id);
    }

    public void batchAddAccounts() {
        String insertAccounts = "INSERT INTO accounts (id, name, balance, type) VALUES (?, ?, ?, ?)";
        jdbcTemplate.batchUpdate(insertAccounts, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setInt(1, accountsList.get(i).getId());
                ps.setString(2, "Unnamed");
                ps.setFloat(3, 0.0f);
                ps.setString(4, "No_Type");
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

    public void batchDeleteAccounts() {
        String deleteQuery = "DELETE FROM accounts WHERE accounts.id = ?";
        int[] argTypes = {Types.INTEGER};
        List<Object[]> args = new LinkedList<>();
        for (Account account : accountsList) {
            args.add(new Object[]{account.getId()});
        }
        jdbcTemplate.batchUpdate(deleteQuery, args, argTypes);
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

        float finalX = rand.nextFloat() * (maxX - minX) + minX;
        return finalX;
    }

    protected String getRandomString() {
        return java.util.UUID.randomUUID().toString();
    }

}
