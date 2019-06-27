package com.qf.controller;

import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClaService;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("stu")
public class StuController {

    @Autowired
    private IStuService stuService;

    @Autowired
    private IClaService claService;

    @RequestMapping("/list")
   public String stuList(Model model){
        List<Student> list = stuService.queryAll();

        model.addAttribute("list",list);
       return "stulist";
   }


    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        List<Classes> classes = claService.queryAll();
        model.addAttribute("classes",classes);
        return "addstu";
    }
    @RequestMapping("/toInsert")
    public String toInsert(Student student){
        stuService.toInsert(student);
      return "redirect:/stu/list";
    }

    @RequestMapping("/toDel")
    public String toDel(Integer sid){
        stuService.toDel(sid);
        return "redirect:/stu/list";
    }

    @RequestMapping("/queryone/{id}")
    public String queryById(Integer id){
        return  null;
    }

}
