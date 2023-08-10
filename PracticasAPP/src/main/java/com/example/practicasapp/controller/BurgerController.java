package com.example.practicasapp.controller;
import com.example.practicasapp.repository.BurgerRepository;
import com.example.practicasapp.service.BurgerServiceIMP;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BurgerController {

    private BurgerServiceIMP burgerService;
    @Autowired
    private BurgerRepository burgerRepository;

    @GetMapping("/index.html")
    public String index(){
        return "index";
    }

    @GetMapping("/contact.html")
    public String contact(){
        return "contact";
    }


}
