package jee.mundia.tp3springmvcthymeleaf.web;

import jee.mundia.tp3springmvcthymeleaf.entities.Product;
import jee.mundia.tp3springmvcthymeleaf.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/index")
    public String index(Model model){
        List<Product> products = productRepository.findAll();
        model.addAttribute("productList", products);
        return "products";
    }
    @GetMapping("/delete")
    public  String delete(Long id){
        productRepository.deleteById(id);
        return "redirect:/index";
    }

}
