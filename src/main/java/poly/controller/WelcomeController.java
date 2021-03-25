package poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String Welcome(){
        return "index";
    }

    @RequestMapping("/product")
    public String product_detail(){
        return "product/index";
    }
}
