package rikkei_trong.com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rikkei_trong.com.demo.Entity.khachhangEntity;
import rikkei_trong.com.demo.Service.khachhangservice;

import java.util.List;

@Controller
public class khachhangcontroller {
    @Autowired
    private khachhangservice service;

    @RequestMapping("/index")
    public String viewHomePage(Model model){
        List<khachhangEntity> listkhachhang = service.listALL();
        model.addAttribute("listkhachhang",listkhachhang);
        return "index";
    }

    @RequestMapping("/add")
    public String newkhachhang(Model model){
        khachhangEntity khachhang= new khachhangEntity();
        model.addAttribute("customer",khachhang);
        return "new_customer";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savecustomer(@ModelAttribute("customer") khachhangEntity khachhang){
        service.save(khachhang);
        return  "redirect:/";
    }
}
