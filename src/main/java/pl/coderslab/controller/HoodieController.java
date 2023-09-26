package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.dao.*;
import pl.coderslab.model.Hoodie;

@Controller
@RequestMapping(path="/hoodie")
public class HoodieController {

    @Autowired
    HoodieDao hoodieDao;
    @Autowired
    ClientDao clientDao;
    @Autowired
    LoginDao loginDao;
    @Autowired
    RegistrationDao registrationDao;
    @Autowired
    CartDao cartDao;

    @RequestMapping(path = "/save")
    @ResponseBody
    public String saveBook(@RequestParam String accessories, @RequestParam String colour, @RequestParam String description, @RequestParam String gender, @RequestParam Integer points, @RequestParam String size, @RequestParam String title, @RequestParam String transaction) {
        Hoodie hoodie = new Hoodie();

        hoodie.setColour(colour);
        hoodie.setDescription(description);
        hoodie.setGender(gender);

        hoodie.setSize(size);
        hoodie.setTitle(title);

        hoodieDao.save(hoodie);
        return hoodie.toString();
    }

    @RequestMapping(path = "/update")
    @ResponseBody
    String updateHoodie(@RequestParam long id, @RequestParam String accessories, @RequestParam String colour, @RequestParam String description, @RequestParam String gender, @RequestParam Integer points, @RequestParam String size, @RequestParam String title, @RequestParam String transaction) {
        Hoodie hoodie = hoodieDao.getById(id);

        hoodie.setColour(colour);
        hoodie.setDescription(description);
        hoodie.setGender(gender);

        hoodie.setSize(size);
        hoodie.setTitle(title);

        hoodieDao.update(hoodie);
        return hoodie.toString();
    }

    @RequestMapping(path = "/delete")
    @ResponseBody
    public String deleteHoodie(@RequestParam long id) {
        Hoodie hoodie = hoodieDao.getById(id);
        hoodieDao.delete(hoodie);
        return "redirect:/hoodie/showAll";
    }

    @RequestMapping(path = "/get")
    @ResponseBody
    public String getHoodie(@RequestParam long id) {
        return hoodieDao.getById(id).toString();
    }

    @GetMapping("/form")
    public String displayForm(Model model) {
        Hoodie hoodie = new Hoodie();
        model.addAttribute("hoodie", hoodie);
        return "hoodie/form";
    }
}
//    @PostMapping("/form")
//    @ResponseBody
//    public String processForm(Hoodie hoodie) {
//        return hoodie.toString();
//    }
//
//    @PostMapping("/form")
//    @ResponseBody
//    public String processForm(Hoodie hoodie, @RequestParam int quantity) {
//        Cart cart = new Cart();
//        cart.setName(hoodie.getTitle());
//        cart.setQuantity(quantity);
//        cart.setPrice(hoodie.getPrice());
//        cartDao.save(cart);
//        return "Added to cart: " + cart.toString();
//    }
//}
