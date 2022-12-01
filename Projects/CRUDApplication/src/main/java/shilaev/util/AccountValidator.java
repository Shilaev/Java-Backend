package shilaev.util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import shilaev.models.Account;

public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Account.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        
    }
}
