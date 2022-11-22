package shilaev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import shilaev.dao.AccountDAO;
import shilaev.models.Account;

@Controller
@RequestMapping("/accounts")
public class AccountsController {

    final
    AccountDAO accountDAO;

    public AccountsController(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("all_accounts", accountDAO.getAccounts());
        return "accounts/index";
    }

    @GetMapping("/{id}")
    public String getAccount(@PathVariable("id") int id, Model model) {
        model.addAttribute("current_account", accountDAO.getAccount(id));
        return "accounts/account";
    }

    @GetMapping("/add_account")
    public String getAddAccount(@ModelAttribute("newAccount") Account newAccount) {
        return "accounts/account_add_form";
    }

    @PostMapping("/add_account")
    public String postAddedAccount(@ModelAttribute("newAccount") Account newAccount) {
        accountDAO.addAccount(newAccount);
        return "redirect:/accounts";
    }

    @GetMapping("/edit_account/{id}")
    public String getEditAccont(@PathVariable("id") int id, Model model) {
        model.addAttribute("current_account", accountDAO.getAccount(id));
        return "accounts/edit_account";
    }

//    @PatchMapping

//    @DeleteMapping
}
