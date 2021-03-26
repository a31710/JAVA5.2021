package poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import poly.bean.Product;

@Controller
public class ProductController {
    @RequestMapping("product")
    public String index(ModelMap model){
        Product student = new Product();
        Product product = new Product("Adidas",80,"product-1.jpg","M","W");
        model.addAttribute("product", product);
        return "product/index";
    }


    @RequestMapping("update")
    public String update(@ModelAttribute("product") Product student){
        return "product/index";
    }
}
