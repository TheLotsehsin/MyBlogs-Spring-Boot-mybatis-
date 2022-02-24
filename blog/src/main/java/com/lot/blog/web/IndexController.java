package com.lot.blog.web;

import com.lot.blog.hander.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        //int i=9/0;  //500
      /*  String blog = null;
        if(blog == null){
           throw new NotFoundException("找不到博客"); //404
        }*/
        System.out.println("--------");
        return "index";
    }
}
