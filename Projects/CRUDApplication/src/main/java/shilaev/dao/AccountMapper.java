package shilaev.dao;


import org.springframework.jdbc.core.RowMapper;
import shilaev.models.Account;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setId(rs.getInt("id"));
        account.setName(rs.getString("name"));
        account.setBalance(rs.getFloat("balance"));
        account.setType(rs.getString("type"));
        return account;
    }
}
