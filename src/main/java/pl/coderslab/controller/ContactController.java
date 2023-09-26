package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dao.ContactDao;
import pl.coderslab.model.Contact;


@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    ContactDao contactDao;

    @RequestMapping(path = "/save")
    @ResponseBody
    public String saveContact(@RequestParam long id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String description){
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setEmail(email);
        contact.setDescription(description);
        contactDao.save(contact);
        return contact.toString();
    }

    @RequestMapping(path = "/update")
    @ResponseBody
    public String updateContact(@RequestParam long id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String description){
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setEmail(email);
        contact.setDescription(description);
        contactDao.update(contact);
        return contact.toString();
    }

    @RequestMapping(path = "/delete")
    @ResponseBody
    public String deleteContact(@RequestParam long id) {
        contactDao.deleteById(id);
        return "contact";
    }

    @RequestMapping(path = "/get")
    @ResponseBody
    public String getContact(@RequestParam long id) {

        return contactDao.getById(id).toString();
    }



    @GetMapping("/form")
    public String displayForm(Model model) {
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "contact/form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(Contact contact) {
        return contact.toString();
    }

}