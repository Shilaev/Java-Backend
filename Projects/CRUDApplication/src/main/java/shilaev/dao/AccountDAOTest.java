package shilaev.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import shilaev.configuration.SpringConfiguration;


public class AccountDAOTest {

    AccountDAO accountDAO;

    @Before
    public void setup() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfiguration.class);
        accountDAO = context.getBean("accountDAO", AccountDAO.class);
    }

    @Test
    public void getRandomString() {
        System.out.println(accountDAO.getRandomString());
    }

    @Test
    public void getRandomFloat(){
        System.out.println(accountDAO.getRandomFloat());
    }

    @Test
    public void get_10_000_000_RandomAccounts(){
        System.out.println(accountDAO.get_100_RandomAccounts().size());
    }
}