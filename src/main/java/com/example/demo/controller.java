package com.example.demo;

import com.example.demo.aop.mytarget;
import com.example.demo.dao.BookMapper;
import com.example.demo.dao.PeopleMapper;
import com.example.demo.model.People;
import com.example.demo.model.PeopleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class controller {
    @Autowired
    mytarget tar;
    @Autowired
    PeopleMapper people;
//    @ModelAttribute
//    void mm(Model m){
//        m.addAttribute();
//    }

    @GetMapping("/haha")
    public  List<?> nni(){
        tar.nishisehi();
        People pl=new People();
        pl.setAge(18);
        pl.setLocale("江苏宿迁");
        pl.setName("小明1");
        pl.setQq("123456789");
        //people.myinsert("小刚","123654789","美国",15);

        //System.out.println(people.selectByExample(new PeopleExample()));
        //return people.selectByExample(new PeopleExample());
        return  people.myselect(1,3);
    }
//    @GetMapping("/")
//    public String mas(ModelMap m){
//        m.addAttribute("language","")
//        return "login";
//    }
    @PostMapping("/nihao")
    String mmmmmmm(HttpSession se,String username){
        se.setAttribute("username",username);
        return "redirect:album";
    }
}
