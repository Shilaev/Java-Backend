package shilaev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shilaev.dao.AccountDAO;

@Controller
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    AccountDAO accountDAO;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("accounts", accountDAO.getAccounts());
        return "accounts/index";
    }

    @GetMapping("/{id}")
    public String getAccount(@PathVariable("id") int id, Model model) {
        // TODO: 18.11.2022 получить один счет из дао и открыть его страницу
        return "accounts/{id}";
    }
}
