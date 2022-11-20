package shilaev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shilaev.dao.AccountDAO;

@Controller
@RequestMapping("/accounts")
public class AccountsController {

    final
    AccountDAO accountDAO;

    public AccountsController(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("all_accounts", accountDAO.getAccounts());
        return "accounts/index";
    }

    @GetMapping("/{id}")
    public String getAccount(@PathVariable("id") int id, Model model) {
        model.addAttribute("current_account", accountDAO.getAccount(id));
        return "accounts/account";
    }
}
