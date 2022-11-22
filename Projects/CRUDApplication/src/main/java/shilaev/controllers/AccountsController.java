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
    public String getAllAccountsTable(Model model) {
        model.addAttribute("all_accounts", accountDAO.getAccounts());
        return "accounts/all_accounts_table";
    }

    @GetMapping("account/{id}")
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
        return "redirect:/accounts/account/" + newAccount.getId();
    }

    @GetMapping("/edit_account/{id}")
    public String getEditAccount(@PathVariable("id") int id,
                                 @ModelAttribute("editAccount") Account editAccount) {
        return "accounts/account_edit_form";
    }

    @PatchMapping("/edit_account/{id}")
    public String patchAccount(
            @PathVariable("id") int id,
            @ModelAttribute("editAccount") Account editAccount) {
        accountDAO.update(accountDAO.getAccount(id), editAccount);

        return "redirect:/accounts/account/" + id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAccount(@PathVariable("id") int id) {
        accountDAO.delete(id);
        return "redirect:/accounts";
    }
}
