package com.school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.school.beans.Student;
import com.school.dao.StudDao;

@Controller
public class StudController {
    @Autowired
    StudDao dao;
    @RequestMapping("/studform")
    public String showform(Model m){
        m.addAttribute("command", new Student());
        return "studform";
    }

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("stud") Student student){
        dao.save(student);
        return "redirect:/viewstud/1";
    }

    @RequestMapping("/viewstud/{pageid}")
    public String viewstud(@PathVariable int pageid, Model m){
        int total=5;
        if(pageid==1){}
        else{
            pageid=(pageid-1)*total+1;
        }
        System.out.println(pageid);
        List<Student> list=dao.getStudents(pageid,total);
        m.addAttribute("list",list);
        return "viewstud";
    }

    @RequestMapping(value="/editstud/{id}")
    public String edit(@PathVariable int id, Model m){
        Student stud=dao.getStudById(id);
        m.addAttribute("command",stud);
        return "studeditform";
    }

    @RequestMapping(value="/editsave",method = RequestMethod.POST)
    public String editsave(@ModelAttribute("stud") Student stud){
        dao.update(stud);
        return "redirect:/viewstud/1";
    }

    @RequestMapping(value="/deletestud/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        dao.delete(id);
        return "redirect:/viewstud/1";
    }
}
