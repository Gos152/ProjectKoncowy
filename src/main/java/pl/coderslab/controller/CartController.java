package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dao.CartDao;
import pl.coderslab.dao.HoodieDao;
import pl.coderslab.model.Cart;
import pl.coderslab.model.CartItem;
import pl.coderslab.model.Hoodie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    HoodieDao hoodieDao;
    @Autowired
    CartDao cartDao;
//
//    private final Cart cart;
//    private final HoodieDao hoodieDao;
//
//    public CartController(Cart cart, HoodieDao hoodieDao) {
//        this.cart = cart;
//        this.hoodieDao = hoodieDao;
//    }
//    @RequestMapping("/addtocart")
//    @ResponseBody
//    public String addtocart(@RequestParam long id, @RequestParam int quantity) {
//
//        Optional<Hoodie> first = hoodieDao.getList()
//                .stream()
//                .filter(p -> p.getId().equals(id))
//                .findFirst();
//
//        CartItem cartItem = new CartItem(quantity, first.get());
//
//
//        cart.addToCart(cartItem);
//        return "addtocart";
//    }
//
//
//    public String cart() {
//        return cart.getCartItems()
//                .stream()
//                .map(ci->String.join(" : ", ci.getHoodie().getName(), ci.getQuantity().toString()))
//                .collect(Collectors.joining(" @@@@ "));
//
//    }


    @RequestMapping(path = "/save")
    @ResponseBody
    public String saveCart(@RequestParam String name, @RequestParam int quantity, @RequestParam int price) {
        Cart cart = new Cart();
        cart.setName(name);
        cart.setQuantity(quantity);
        cart.setPrice(price);
        cartDao.save(cart);
        return cart.toString();

    }

    @RequestMapping(path = "/update")
    @ResponseBody
    String updateCart(@RequestParam String name, @RequestParam int quantity, @RequestParam int price) {
        Cart cart = new Cart();
        cart.setName(name);
        cart.setQuantity(quantity);
        cart.setPrice(price);
        cartDao.update(cart);
        return cart.toString();
    }

    @RequestMapping(path = "/delete")
    @ResponseBody
    public String deleteCart(@RequestParam long id) {
        Cart cart = cartDao.getById(id);
        cartDao.delete(cart);
        return "redirect:/hoodie/showAll";
    }

    @RequestMapping(path = "/get")
    @ResponseBody
    public String getCart(@RequestParam long id) {

        return cartDao.getById(id).toString();
    }


    @GetMapping("/form")
    public String displayForm(Model model) {
        Cart cart = new Cart();
        model.addAttribute("cart", cart);
        return "cart/form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(Cart cart) {
        return cart.toString();
    }

}
