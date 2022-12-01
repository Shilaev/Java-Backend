package shilaev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import shilaev.dao.AccountDAO;
import shilaev.models.Account;
import shilaev.util.AccountValidator;

import javax.validation.Valid;

@Controller
@RequestMapping("/accounts")
public class AccountsController {

    final
    AccountDAO accountDAO;

    final AccountValidator accountValidator;

    @Autowired
    public AccountsController(AccountDAO accountDAO, AccountValidator accountValidator) {
        this.accountDAO = accountDAO;
        this.accountValidator = accountValidator;
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
    public String postAddedAccount(@ModelAttribute("newAccount") @Valid Account newAccount,
                                   BindingResult bindingResult) {
        accountValidator.validate(newAccount, bindingResult);
        if (bindingResult.hasErrors()) {
            return "accounts/account_add_form";
        }
        accountDAO.addAccount(newAccount);
        return "redirect:/accounts";
    }

    @GetMapping("/edit_account/{id}")
    public String getEditAccount(@PathVariable("id") int id,
                                 @ModelAttribute("editAccount") Account editAccount) {
        return "accounts/account_edit_form";
    }

    @PatchMapping("/edit_account/{id}")
    public String patchAccount(
            @PathVariable("id") int id,
            @ModelAttribute("editAccount") @Valid Account editAccount, BindingResult bindingResult) {
        accountValidator.validate(editAccount, bindingResult);
        if (bindingResult.hasErrors()) {
            return "accounts/account_edit_form";
        }
        accountDAO.update(id, editAccount);

        return "redirect:/accounts";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAccount(@PathVariable("id") int id) {
        accountDAO.delete(id);
        return "redirect:/accounts";
    }

    @DeleteMapping("/delete")
    public String deleteMultiplyAccounts(@RequestParam("fromId") int fromId,
                                         @RequestParam("toId") int toId) {
        accountDAO.delete(fromId, toId);
        return "redirect:/accounts";
    }

    @GetMapping("/batchAddAccounts")
    public String batchAddAccounts() {
        accountDAO.batchAddAccounts();
        return "redirect:/accounts";
    }

    @GetMapping("/batchUpdateAccounts")
    public String batchUpdateAccounts() {
        accountDAO.batchUpdateAccounts();
        return "redirect:/accounts";
    }
}
