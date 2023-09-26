package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dao.ClientDao;
import pl.coderslab.dao.HoodieDao;
import pl.coderslab.dao.LoginDao;
import pl.coderslab.dao.RegistrationDao;
import pl.coderslab.model.Client;
import pl.coderslab.model.Hoodie;


@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private HoodieDao hoodieDao;

    @Autowired
    private LoginDao loginDao;

    @Autowired
    RegistrationDao registrationDao;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String saveClient(@RequestParam String firstName, @RequestParam String lastName) {
        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        clientDao.save(client);
        return "Client saved with ID: " + client.getId();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public String updateClient(@RequestParam long id, @RequestParam String firstName, @RequestParam String lastName) {
        Client client = clientDao.getById(id);
        if (client != null) {
            client.setFirstName(firstName);
            client.setLastName(lastName);
            clientDao.update(client);
            return "Client updated: " + client.toString();
        } else {
            return "Client with ID " + id + " not found.";
        }
    }

    @RequestMapping(path = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteClient(@RequestParam long id) {
        Client client = clientDao.getById(id);
        if (client != null) {
            clientDao.delete(client);
            return "Usunięto klienta o ID: " + id;
        } else {
            return "Klient o podanym ID nie istnieje.";
        }
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getClient(@RequestParam long id) {
        Client client = clientDao.getById(id);
        if (client != null) {
            return client.toString();
        } else {
            return "Klient o podanym ID nie istnieje.";
        }
    }
    @GetMapping("/form")
    public String displayForm(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "client/form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(Client client) {
        return client.toString();
    }
}

