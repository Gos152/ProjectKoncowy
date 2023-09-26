//package pl.coderslab.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import pl.coderslab.model.Hoodie;
//
//import javax.validation.ConstraintViolation;
//import javax.validation.Validator;
//import java.awt.print.Book;
//import java.util.Comparator;
//import java.util.Set;
//import java.util.SortedSet;
//import java.util.TreeSet;
//
//@Controller
//public class ValidationController {
//    @Autowired
//    private Validator validator;
//
//    @RequestMapping(path = "/validateHoodie", produces = "text/html;charset=UTF-8")
//    @ResponseBody
//    public String validateNewHoodie() {
//        Hoodie hoodie = new Hoodie();
//        hoodie.setTitle("a");
//        StringBuilder response = new StringBuilder();
//        Set<ConstraintViolation<Hoodie>> violations = validator.validate(hoodie);
//
//        if (!violations.isEmpty()) {
//            Set<ConstraintViolation<Hoodie>> sortedSet = new TreeSet<>(
//                    Comparator.comparing(c -> c.getPropertyPath().toString()));
//            sortedSet.addAll(violations);
//
//            for (ConstraintViolation<Hoodie> constraintViolation : sortedSet) {
//                response.append(constraintViolation.getPropertyPath()).append(" ")
//                        .append(constraintViolation.getMessage()).append("<br />");
//            }
//        }
//        return response.toString();
//    }
//
//    @RequestMapping(path = "/validateHoodieView")
//    public String validateNewHoodie(Model model) {
//        Hoodie hoodie = new Hoodie();
//        hoodie.setTitle("a");
//        model.addAttribute("violations", validator.validate(hoodie));
//        return "validation/violations";
//    }
//}
//
//    @RequestMapping(path = "/validateAuthorView")
//    public String validateNewAuthor(Model model) {
//        Author author = new Author();
//        model.addAttribute("violations", validator.validate(author));
//        return "validation/violations";
//    }
//}