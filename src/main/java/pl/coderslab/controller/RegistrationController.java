package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dao.RegistrationDao;
import pl.coderslab.model.Registration;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    RegistrationDao registrationDao;

    @RequestMapping(path = "/save")
    @ResponseBody
    public String saveRegistration(@RequestParam long id,@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String createPassword, @RequestParam String repeatPassword){
        Registration registration = new Registration();
        registration.setFirstName(firstName);
        registration.setLastName(lastName);
        registration.setEmail(email);
        registration.setCreatePassword(createPassword);
        registration.setRepeatPassword(repeatPassword);
       registrationDao.save(registration);
       return registration.toString();
    }

    @RequestMapping(path = "/update")
    @ResponseBody
    public String updateRegistration(@RequestParam long id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String createPassword, @RequestParam String repeatPassword)
    {
        Registration registration = registrationDao.getById(id);
        registration.setFirstName(firstName);
        registration.setLastName(lastName);
        registration.setEmail(email);
        registration.setCreatePassword(createPassword);
        registration.setRepeatPassword(repeatPassword);
        registrationDao.update(registration);
        return registration.toString();
    }

    @RequestMapping(path = "/delete")
    @ResponseBody
    public String deleteRegistration(@RequestParam long id) {
        registrationDao.deleteById(id);
        return "register";
    }

    @RequestMapping(path = "/get")
    @ResponseBody
    public String getRegistration(@RequestParam long id) {

        return registrationDao.getById(id).toString();
    }



    @GetMapping("/form")
    public String displayForm(Model model) {
        Registration registration = new Registration();
        model.addAttribute("registration", registration);
        return "registration/form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(Registration registration) {
        return registration.toString();
    }

}
