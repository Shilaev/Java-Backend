package shilaev.dao;

import org.springframework.stereotype.Component;
import shilaev.models.Account;

import java.util.LinkedList;
import java.util.List;

@Component
public class AccountDAO {
    private static int ID = 0;
    private final List<Account> accounts;

    {
        accounts = new LinkedList<>();
        accounts.add(new Account(
                ++ID,
                "4828629057700799",
                423591f,
                "Visa"
        ));
        accounts.add(new Account(
                ++ID,
                "4975390938505649",
                179626f,
                "MasterCard"
        ));
        accounts.add(new Account(
                ++ID,
                "5050433404730823",
                717.677413f,
                "Mir"
        ));
        accounts.add(new Account(
                ++ID,
                "5053454404730467",
                1717.677413f,
                "Visa"
        ));
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account getAccount(int id) {
        return accounts.stream().filter(account -> account.getId() == id).findFirst().orElse(null);
    }

    public void addAccount(Account newAccount) {
        newAccount.setId(++ID);
        accounts.add(newAccount);
    }

    public void delete(int id) {
        accounts.removeIf(p -> p.getId() == id);
    }

    public void update(Account oldAcc, Account newAcc) {
        oldAcc.setName(newAcc.getName());
        oldAcc.setBalance(newAcc.getBalance());
        oldAcc.setType(newAcc.getType());
    }
}
