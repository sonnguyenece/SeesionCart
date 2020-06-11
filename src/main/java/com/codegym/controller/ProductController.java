package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.CartService;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("myCart")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CartService cartService;

    @ModelAttribute("myCart")
    public Cart setUpCart() {
        return new Cart();
    }

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

    @PostMapping("/showCart")
    public ModelAndView addCart(@RequestParam("id") Long id, @ModelAttribute("myCart") Cart cart) {
        ModelAndView modelAndView = new ModelAndView("/cart");

        List<Product> productList = (List<Product>) productService.findAll();
        cart.addAProduct(id);

        modelAndView.addObject("cartList", cart.getProductList());
        modelAndView.addObject("productList",productList);
        return modelAndView;
    }

}
