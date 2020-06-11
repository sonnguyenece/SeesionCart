package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/homepage")
    public ModelAndView showHomepage() {
        ModelAndView modelAndView = new ModelAndView("/homepage");
        Iterable<Product> productList = productService.findAll();
        modelAndView.addObject("productList", productList);
        return modelAndView;
    }

    @GetMapping("/game/{id}")
    public ModelAndView showGame(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/gameDetail");
        Product game = productService.findById(id);
        modelAndView.addObject("gameDetail", game);
        return modelAndView;
    }

    @PostMapping("addCart")
    public ModelAndView addCart(@RequestParam("id")Long id){
        ModelAndView modelAndView =new ModelAndView("/cart");
        System.out.println(id);
        Product game = productService.findById(id);

        return modelAndView;
    }
}
