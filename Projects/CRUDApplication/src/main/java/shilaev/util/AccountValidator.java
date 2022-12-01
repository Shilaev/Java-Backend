package shilaev.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import shilaev.dao.AccountDAO;
import shilaev.models.Account;

@Component
public class AccountValidator implements Validator {

    AccountDAO accountDAO;

    @Autowired
    public AccountValidator(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Account.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Account account = (Account) target;

        if (accountDAO.getAccount(account.getName()).isPresent()) {
            errors.rejectValue("name", "", "name is already exists");
        }
    }
}
