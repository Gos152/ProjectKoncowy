package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dao.LoginDao;
import pl.coderslab.model.Login;



@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginDao loginDao;


    @RequestMapping(path = "/save")
    @ResponseBody
    public String saveLogin(@RequestParam Long id, @RequestParam String password){
        Login login = new Login();
        login.setPassword(password);
        loginDao.save(login);
        return login.toString();
    }

    @RequestMapping(path = "/update")
    @ResponseBody
    public String updateLogin(@RequestParam Long id, @RequestParam String password)
    {
        Login login = loginDao.getById(id);
        login.setPassword(password);
        loginDao.update(login);
        return login.toString();
    }

    @RequestMapping(path = "/delete")
    @ResponseBody
    public String deleteLogin(@RequestParam long id) {
        loginDao.deleteById(id);
        return "register";
    }

    @RequestMapping(path = "/get")
    @ResponseBody
    public String getRLogin(@RequestParam long id) {

        return loginDao.getById(id).toString();
    }

    @GetMapping("/form")
    public String displayForm(Model model) {
        Login login = new Login();
        model.addAttribute("login", login);
        return "login/form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(Login login) {
        return login.toString();
    }

}
